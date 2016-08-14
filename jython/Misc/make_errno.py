# Asynchronous sockets in Jython.
#
# Copyright (c) 2002 brian zimmer <mailto:bzimmer@ziclix.com>

'''
Generate the errno module by extracting the values from CPython.

Better windows error messages could be derived by parsing:
 http://www.sockets.com/err_lst1.htm#DetailedErrorDescriptions
 http://msdn.microsoft.com/library/default.asp?url=/library/en-us/winsock/errors_2036.asp
'''

import os
if os.name == 'java':
  raise ImportError('this script must be run by CPython')

import errno, sys

error_messages = {
  10035 : "The socket operation could not complete without blocking",
  10022 : "Invalid argument",
}

def gen_python(fp=None):
  print >> fp, "'''"
  print >> fp, "This file was autogenerated using:"
  print >> fp, " Python %s" % (" ".join(sys.version.split()))
  print >> fp, "'''"
  print >> fp, ""
  for a in errno.errorcode.keys():
                #if a < 1000:
    print >> fp, "%-25s = %d" % (errno.errorcode[a], a)
    if hasattr(fp, "flush"): fp.flush()

  print >> fp, ""
  print >> fp, "errorcode = {}"
  for a in errno.errorcode.keys():
                #if a < 1000:
    print >> fp, "errorcode[%s] = '%s'" % (errno.errorcode[a], errno.errorcode[a])
    if hasattr(fp, "flush"): fp.flush()

def gen_java(fp=None):
  print >> fp, "package org.python.modules;"
  print >> fp, ""
  print >> fp, "import org.python.core.*;"
  print >> fp, ""
  print >> fp, "/**"
  print >> fp, " * This file contains autogenerated error codes from:<br/>"
  print >> fp, " *  <b>Python %s</b>" % (" ".join(sys.version.split()))
  print >> fp, " *"
  print >> fp, " * @author brian zimmer"
  print >> fp, " * @version %s" % (".".join(map(lambda x: str(x), sys.version_info[:3])))
  print >> fp, " * @copyright 2002 brian zimmer"
  print >> fp, " */"
  print >> fp, "public final class errno implements ClassDictInit {"
  print >> fp, ""
  print >> fp, "    private errno() {}"
  print >> fp, ""

  errors = [(e, getattr(errno, e)) for e in dir(errno) if e[0] == 'E']
  errors.sort(lambda x, y: cmp(x[1], y[1]))
  
  for name, code in errors:
    if code > 1000: continue
    print >> fp, "    public static final int %-25s = %d;" % (name, code)
    if hasattr(fp, "flush"): fp.flush()

  print >> fp, ""
  print >> fp, "    public static final PyObject errorcode = new PyDictionary();"
  print >> fp, "    private static final PyObject strerror = new PyDictionary();"
  print >> fp, ""
  print >> fp, "    public static void classDictInit(PyObject dict) throws PyIgnoreMethodTag {"

  for name, code in errors: 
    if code > 1000: continue
    msg = error_messages.get(code, os.strerror(code));
    print >> fp, '        addcode(dict, %s, "%s", "%s");' % (name, name, msg)
    if hasattr(fp, "flush"): fp.flush()

  print >> fp, ""
  print >> fp, "    }"

  print >> fp, ""
  print >> fp, "    public static PyObject strerror(PyObject error) {"
  print >> fp, "        return strerror.__getitem__(error);"
  print >> fp, "    }"
  print >> fp, ""
  print >> fp, "    private static void addcode(PyObject dict, int errno,"
  print >> fp, "                                String err, String msg) {"
  print >> fp, "        PyObject errno_o = Py.newInteger(errno);"
  print >> fp, "        PyObject err_o = Py.newString(err);"
        
  print >> fp, "        strerror.__setitem__(errno_o, Py.newString(msg));"
  print >> fp, "        errorcode.__setitem__(errno_o, err_o);"
  print >> fp, "        dict.__setitem__(err_o, errno_o);"
  print >> fp, "    }"
  print >> fp, "}"

if __name__ == '__main__':
  gen_java(None)
