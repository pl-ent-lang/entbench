#!/bin/sh

dir=`dirname "$0"`

ent -cp $dir/../classes:$dir/../lib/xalan-2.6.0.jar:$dir/../lib/xerces_2_5_0.jar:$dir/../lib/xml-apis-ext.jar:$dir/../lib/xml-apis.jar:$dir/../resources org.apache.batik.apps.rasterizer.Main -m image/jpeg -w 2048 $dir/small.svg 

mv $dir/mode.txt $dir/run_sd_${1}.txt
