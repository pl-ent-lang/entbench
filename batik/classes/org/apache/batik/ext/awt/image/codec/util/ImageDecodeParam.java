package org.apache.batik.ext.awt.image.codec.util;
public interface ImageDecodeParam extends java.lang.Cloneable, java.io.Serializable {
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471188907000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL1XW2wUVRg+u9s7Lb3R0gCtXGpiAXdiFBJslUtp7cK23bRI" +
                                          "4lZYzs6c7Q6dnTnMnGm3xRg1MeKLIQqCJvSphMQoEmOiD0pqTBTjJQGJikb0" +
                                          "UWOINCa+EC//OTO7MzttDU9usmdmz/n+//y3851/37yFyi0TdRCdRdk0JVa0" +
                                          "T2cJbFpE6dWwZR2AuZR8JoL/OPzL0I4wqkiilVlsDcrYIv0q0RQridpV3WJY" +
                                          "l4k1RIjCJRImsYg5iZlq6EnUolqxHNVUWWWDhkI44CA246gRM2aqaZuRmKuA" +
                                          "ofY4WCIJS6TdweXuOKqVDTrtwdt88F7fCkfmvL0shhriR/EklmymalJctVh3" +
                                          "3kRbqKFNj2sGi5I8ix7Vtrkh2BfftigEGy/V/3nnZLZBhKAZ67rBhHvWCLEM" +
                                          "bZIocVTvzfZpJGcdQ0+jSByt8IEZ6owXNpVgUwk2LXjrocD6OqLbuV5DuMMK" +
                                          "miqozA1iaEOpEopNnHPVJITNoKGKub4LYfB2fdFbx8tFLp7eIp06c7jhnQiq" +
                                          "T6J6VR/l5shgBINNkhBQkksT09qtKERJokYdkj1KTBVr6oyb6SZLHdcxsyH9" +
                                          "hbDwSZsSU+zpxQryCL6ZtswMs+heRhSU+6s8o+Fx8LXV89XxsJ/Pg4M1Khhm" +
                                          "ZjDUnStSNqHqCkP3BCWKPnbuBwCIVuYIyxrFrcp0DBOoySkRDevj0iiUnj4O" +
                                          "0HIDCtBkaM2ySnmsKZYn8DhJ8YoM4BLOEqCqRSC4CEMtQZjQBFlaE8iSLz+3" +
                                          "hnpeOq4P6GEUApsVImvc/hUg1BEQGiEZYhI4B45g7eb4q7j1wxNhhADcEgA7" +
                                          "mPeeWti1tWP+ioNZuwRmOH2UyCwlz6VXXl3X27Ujws2oooal8uSXeC5OWcJd" +
                                          "6c5TYJjWoka+GC0szo988sQzb5DfwqgmhipkQ7NzUEeNspGjqkbMx4hOTMyI" +
                                          "EkPVRFd6xXoMVcJ7XNWJMzucyViExVCZJqYqDPEbQpQBFTxENfCu6hmj8E4x" +
                                          "y4r3PEUIVcIXheC7ATmf9XxgKCdljRyRsIx1VTekhGlw/y0JGCcNsc1Kaaj6" +
                                          "CckybBNKUDLMcQlDHWSJu8BPJp5ikpqD9EsysJHsBCbGJ/YSPpPgJzfKy47+" +
                                          "3xvmeQSap0IhSM66IDVocKoGDE0hZko+Ze/pW7iY+twpO35U3Ngx9DDYEHVs" +
                                          "iAobBJGCDVFhQ1TY4CQ8aAMKhcTWq7gtDgQyOgHcAORc2zV6aN+RExsjUIx0" +
                                          "qoznIy8O69rCDxAM2Cxo4ZFReu67r359MIzCHoPU+6h/lLBuX9VynU2iPhs9" +
                                          "Ow6YhADux7OJV07femFMGAGITUtt2MnHXqhW8Amo7Pkrx278dHPuerhoeIQB" +
                                          "bdtpuP0YqsJp4DwsM4aqi+TlOLbqH/iE4Ps3/3If+YRTiE297mlYXzwOlPrC" +
                                          "ERbvbQw1Cx84fwFtGDrBaY0U1pw4q0a0SNmwyOPYvhzhCLKce+7UrDJ8/gGH" +
                                          "FppKD3Ef3FFvffPXF9GzP3+2RHVUM4Per5FJopXkDu7iYDHw8LYtup4cSpUv" +
                                          "ztZXrZ59/NswKvPRXi1kMWNrWnFH/+78qjRJRhU1XivGRioe2xnquuuiZaiM" +
                                          "P4T12xz5HXCD3408Q+Xi6ZftYajjv2VBSjz9UjuBWZeTYigCox+9BzK9FBqQ" +
                                          "MPqRfZCHIBL2F08/boChGg8H1ey8+CH7QTtA+Guc0nwoeFQ7l+mzfC1PSj55" +
                                          "/XbdwduXF0QhlfZM/gM8iGm3k1A+tHD1q4MUMoCtLOAemh96skGbvwMak6BR" +
                                          "BtK0hk3gtHzJcXfR5ZXff/Rx65GrERTuRzWagZV+zLsTuGNYFhqaLNBhnu7c" +
                                          "5dwRU1UwNAgHUdDdTSXuiubMdXjQdtqzlPz27L6h4wvbzztEBW3dzIy4zKE3" +
                                          "yRhmDmvFtm3DstoKuioGuu6svFR9Lz+jvsgIfg/ado/nN1ymGhQqD3FnX46y" +
                                          "ac68M++vfrfnwuxNQWBwLVJ+NNd4QrtNE09bneLB8Tfmei5/eaLiGsR4DIUw" +
                                          "cNCYr4tyWgZoAGzgmbG49yfD9z9A5UTU3fX69KNbM7//4O6LxK20PD4lX79w" +
                                          "6OuX2+Y6wmhFDE6NrpB8ElpCa++0PkLkSTOJ6lSrLw8mghYgvBiqsnX1mE1i" +
                                          "0H2u5CyCeYcnQuhGvq44C1cvnOCNi1o5mCYKdLe+vxlQKVPE3GPYusLV1EHt" +
                                          "ejMlDabLTDU2pQEBb6aY9VWLfU/Je1+s/+BkU6QfmLDEHb/6SstOc7Sr2+s5" +
                                          "xYQoigY+3Jd3LpdIKj5IaeGyqT7o3ixpB8PnGQptFmXQHCgDnv/8s9faX/sU" +
                                          "n4NmEBowS50hTvpExYW4EiL2FL4KG7L/Are/8g9zDgAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471188907000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL1Ya8zj2Fn2fHOf7u7MTtmLttvtXqYSS9rPuThOwhRofEli" +
                                          "x0kcJ3EuQKe+xo7v9nHspBShSrQLlcpKzEJ/lP21FajaXkBIICHQIgQqokKq" +
                                          "VHGT6FYICVC1UvcHqGIF5dj5Lplvd7btHyLZPjnnfc953ut5z3n1DeRiFCIF" +
                                          "37M3S9sDh1oKDld29RBsfC06ZLkqL4WRppK2FEVj2HdHefZr1//rrReNGwfI" +
                                          "pQXyXsl1PSAB03MjQYs8e62pHHL9tJe2NScCyA1uJa0lNAamjXJmBG5zyHv2" +
                                          "WAFyizuGgEIIKISA5hDQ5ikVZHpQc2OHzDgkF0QB8svIOQ655CsZPIA8c+8k" +
                                          "vhRKztE0fC4BnOFK9l+EQuXMaYg8fSL7Tua3CfxSAb372x+78QfnkesL5Lrp" +
                                          "jjI4CgQB4CIL5AFHc2QtjJqqqqkL5GFX09SRFpqSbW5z3AvkZmQuXQnEoXai" +
                                          "pKwz9rUwX/NUcw8omWxhrAAvPBFPNzVbPf53UbelJZT10VNZdxK2sn4o4DUT" +
                                          "Agt1SdGOWS5YpqsC5ANnOU5kvNWFBJD1sqMBwztZ6oIrwQ7k5s52tuQu0REI" +
                                          "TXcJSS96MVwFIE/cd9JM176kWNJSuwOQx8/S8bshSHU1V0TGApBHzpLlM0Er" +
                                          "PXHGSnv2eaP/kc99wu24BzlmVVPsDP8VyPTUGSZB07VQcxVtx/jAT3G/JT36" +
                                          "py8cIAgkfuQM8Y7mj37pzY9+6KnXvr6jed870AzklaaAO8or8kPffJJ8vnE+" +
                                          "g3HF9yIzM/49kufuzx+N3E59GHmPnsyYDR4eD74m/NX8V76kffcAucYglxTP" +
                                          "jh3oRw8rnuObtha2NVcLJaCpDHJVc1UyH2eQy7DNma626x3oeqQBBrlg512X" +
                                          "vPw/VJEOp8hUdBm2TVf3jtu+BIy8nfoIglyGD3IOPs8gu9/T2QsgDmp4joZK" +
                                          "iuSarofyoZfJH6GaC2SoWwOVoddbaOTFIXRB1AuXqAT9wNCOBrLIlBKAmg40" +
                                          "P6p40GA7xTBZB6VlPXwWuYeZ2/n/3wummQZuJOfOQeM8eTY12DCqOp6tauEd" +
                                          "5W5M0G9+5c7fHJyEypHuAPLTEMPhDsNhjiFPqxDDYY7hMMewM/hZDMi5c/nS" +
                                          "P5Fh2ZFAi1owN8Cs+cDzo19kP/7Cs+ehM/rJhcweaR6sj+d/zkO+5++fyVtZ" +
                                          "GmHy1KlAz378vwe2/Kl/+X6Ofz8ZZxMevEP0nOFfoK9+4QnyZ7+b81+FeQtI" +
                                          "0M9gSnjqbAzfE3ZZMJ/VK0zHp/OWv+T858Gzl/7yALm8QG4oR7lelOxYG2kw" +
                                          "314zo+MNAO4H94zfm6t2gXn7KCcA5MmzuPaWvX2cWDPhL+7bE7Yz6qx9LfeN" +
                                          "h3Kah38Af+fg87/Zk1ki69hFyE3yKEyfPolT30/PnQPIxfJh7bCY8T+T2fis" +
                                          "gjMAPzPyf+cf/vY/KgfIwWmyv763fUIl3N5LMNlk1/NU8vCpy4xDLVPWP3+e" +
                                          "/82X3vjMz+f+Aimee6cFb2XvDDF0P7jr/OrXg398/duvfOvgxMfOA7jDxrJt" +
                                          "KrAR5ZsflEQ3XcnOFfIsQB5b2cqtY6lFuBlCYLdWdi1X1SNw+8+hZVY53O0g" +
                                          "eZBBRLfu4657u/4d5cVvfe9B8Xt/9ubbPPVexfQk//bOQjmqFE7/2Nko6kiR" +
                                          "Aemw1/q/cMN+7S044wLOqMC8EQ1CGNbpPWo8or54+Z/+/C8e/fg3zyMHLeSa" +
                                          "7UlqS8o2aJhmgQH3dANmhNT/uY/u0mRyBb5u5LGJ5PK/bwcnD+uHThXBeXAj" +
                                          "/ey/vviN33judYiDRS6uMx+GCPa01Y+z2uLTr770/vfc/c5nc5vApCz+2u9X" +
                                          "vp/NWs8X+GD+/snsVdhZLGt+KHt9OHsdHpvpicxMozxPclIEep5qwtpCzS31" +
                                          "rqmDD00Hetv6aONEP3nzdesL//7l3aZ4Nk+cIdZeuPvrPzj83N2DvVLkubdV" +
                                          "A/s8u3IkB/3giSmfebdVco7Wv331k3/ye5/8zA7VzXs3VhrWjV/+u//5xuHn" +
                                          "v/PX75CxL9jesVNm7/LRstmn+sMNC67yHSximsc/rjSblpOJKCwLcSOqcXJF" +
                                          "KC5JMGv7ZnOmmi2CjewJ8GtKt1yRBQazF/NthCu1Ia66Y7fntp1KKixLPa3L" +
                                          "McOAZNcj3+gNPdoZmFTRD8bEeMUO26xpycXJdMD0SalAkyg6GA9qvS0A1KQR" +
                                          "R47qbFG3gKKbSr1aQiu1TWtjFseqQKqCahVZUSqOywort3waV6fJQig344VQ" +
                                          "Zz0OHfBbrshgSWCZpi3aEaWEc2ZdDIrCMDRVX6xM2bmNWSWBWZGswDjRfFk1" +
                                          "F3aA0+7Es4O00xcn0+mUMiwGw8hmGcOXQq8sBdIiFpxu3PT0OTYlGXaEj9VE" +
                                          "m8WDbiBS4xAkKqjXWzWdtHRnzRUjwwhNAaUt29k4ks0qQDQqFUuQg26rvypH" +
                                          "bbPK1M20JoLQMsqErgNzSbc3qIhWXHfBLQij21zgtZAwOuspydE9ecF4ijhe" +
                                          "b/WFz7YVdVgsrEbEBtQZeoF7yazvi8tJYpW52Sr0FAofBJwci1Uq7vW6jhl4" +
                                          "22bJlOiBT3t+3+3wIsuM+1633Y1ljJvrRFlXW3JaBy3Or2mMX4QGXRnu0AzG" +
                                          "OIuLAmpXI2NJMP2+ZRBDy4rGxUYAurTAetZctVal7pgQQ9zbyPhowXVUJY02" +
                                          "nYYhU8loEY0mha2fDsMNyeELECW9qGBoggG78ajuFVppnZuJ9cYsjViUX2K9" +
                                          "UtcwnMWKmsDTyqgfdALS4isEOe3yrhwTCcmI8ZzZpGErVPwiRQy8zcgSKG29" +
                                          "KprmxF1hg2KHoUhAWFKvvBm5TtRdzN06ZbD1udfDCG5AB2QgjEiMpHtguFgN" +
                                          "CbiL0HVzxG0LFcOFVXGA8XibnjT9SGSctYIak2WJoIdtk17MDQYjsOqypslY" +
                                          "UFuVkrRvGE1KoZfNmsNr2hSYJTDlC6bXX8SJ4Aw65cmGTOwtLs5mdmVWrk1W" +
                                          "SVT2PE+y6/FoppHVwVRhVVypjufsaupZUqFNFqOt16jXo+FWrlJ6Eiwdw/St" +
                                          "Ya2/ndBaP/Lbq8CSeylmDMa9DUNbvCi0VDydeT1RYWuz/pTtbWNlI5p0KpIL" +
                                          "NpgHFE/LQx+KOk7pvk7GuOGs6jSWbrCwwtMTRlSYmaGRtebY0aEpll1StVfC" +
                                          "RoiYtCSONcto2wm6KbJtUulHSqkrSSucVKyNTPS7E4rrKUOb6kxHbFwneNav" +
                                          "mpYfUA062kRsJyJIuc2i8xHv80t2q3c3WK1QSdeONhxJfpExRj0cZyjRU7pe" +
                                          "m6KLxsLyCgsN9ac1c14AiT+oVCeV/jJtUNSc7oiR2fRkAiKhxJYxLI3nGDms" +
                                          "S81e11DG06C2BNRyuBksO0pzICjlrYhL/YJAp9FqwqRFGAkus6kP8EZIUmmz" +
                                          "VyZTD1u0BC2G0VapNnrMlux4PPRNA7U5Ip41xI07KZu8ETUGCT6Hto7T2oAV" +
                                          "izVdc1q9drPNjCcAlHtuZxYY03rT8Wq8FablWl3t8LEWGp7GDAlZBX7MF+dB" +
                                          "xPoYlUQ9TArMwtgecHLQQU0a46MKWmH0wlwYm3S5UXPs+WybDGw+JGlBXsvD" +
                                          "pESmdUxPWqBNhYQ0L05KfoIFRak46jvJZsDP18bWILmuohVqk5Bi6+iy3Wn5" +
                                          "fpeq0Hql1VrrOj9rNdpbvlIoCx1x0sN4Lay2WM+fWVQMlU11kjo3B7GPKSN/" +
                                          "st6CxSxcVBtoP0q6a16YmSWrN+2HU7fVQQu1erASWMGYlGbmui2YnlZO3SCO" +
                                          "Y3MhmT0eG5fK6bbamZFUBSvWh4WZiS90MJdWq3VZJEarbWOyionpQhvPTVjD" +
                                          "pYUGse02WkQw7PGBoC/IDkNw5VaxjsoeabSX9U5J29QLZKc2HINmoR0rRTfx" +
                                          "tNawZhecrU6W+NGqWkVnspqo8axVHBq2vuihy17dhHuSVWoWQIcqBVhv0vNI" +
                                          "wA2ammM08Mhqy+ukJ1k4IRCgWzSsyhJ0tqwy04XqYqbrqJDi1XZIC+NY2E6l" +
                                          "5UIsbLloHLf785YRSFyfMNy4plTVRJiUJkm/uexMVEodj2axGcs9dbYaqiDY" +
                                          "2vy2XONwA0vW8nYLaGJaUbfMBtt26cpGMBzKWbeAU6Ei4HVj02vHMR6tW0ID" +
                                          "5qTVOloyOjwYqh7q9ksbp20MA6rScmcYvpEUvN4rFNZ6qLtJnPaHUyLhRLbQ" +
                                          "76vYMAR9utiQXY0j6mPd0cwqqkmc2Y4EjGImidIn5yEGNtPlwmu2t0tHbmON" +
                                          "jU41to1mdTKeVPQZ3uj25V4NRbEBzqXdcpGnMHtWayT4IJ6VC3M8cYwWReP9" +
                                          "0CfqtO3D3bxQ5C3OGo0HLG6PQi6pO0tjvlwTZhC5s5JDl8xipxxXyQ2pzRV3" +
                                          "GBvtdQC32pKydgdk3yx5VYecd1VOK6xTe9gVebrS5udxxIklugO0Vc+mJJkb" +
                                          "U5OyP6QJGZfmDXHK6ROU1UqFCC0Q1gQf6g5H0R0ZxUcRGCi1UVguRNV0PvTM" +
                                          "5bxQYdUK56tMd1VlJK29CcY1r2KmUALebQ990HJmww65pNw1Wo8aujRDo4mL" +
                                          "9R2a8JJRtWiM1z6dzqcYbUL/5LBuu8ahzVBD68vGllo2m1lpxfx41e3D+SHk" +
                                          "5E4LFrXZQPHHqOrSd1sQIFckOQIhLP0BcvXkkm23+t4p/OD40PPe0zKehOWl" +
                                          "Jsm2djy2O96b3uHJTSEczMrc99/vnisvcV/51N2X1cEXS1mJm81EQSTA8z9s" +
                                          "a2vN3sOApPDMdfZqITsBPv62y87dBZ3ylZevX3ns5cnfHyAX9i7RrsKDph7b" +
                                          "9v5peK99yQ813cyRXN2dvPz8cwcgz//IVyCw+M4+OfqP7fhlgNz6UfjhMTT/" +
                                          "7vNqAHnq3XkhV/7d5zIA8vj9uAByHr73qS1owHeihpTwvU/pQjucpYTr5999" +
                                          "ugAg107p4Dl719gnyWaHJFkzzq4T7jH3qX/f/GGnlhOW/fuATNT8uvzIL3rx" +
                                          "7sL8jvLVl9n+J97Ev7i7j1BsabvNr1c55LLuhbAuP7lIf+a+sx3Pdanz/FsP" +
                                          "fe3qB4/d96Ed4NMI3cP2gdNjOOnZNjR2duK/RTs+2GR3Yds/fuwPP/K7L387" +
                                          "PxP/HymTOcbHGAAA");
}
