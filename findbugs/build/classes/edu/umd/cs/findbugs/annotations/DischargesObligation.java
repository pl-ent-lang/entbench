package edu.umd.cs.findbugs.annotations;
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME) 
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD) 
public @interface DischargesObligation {
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1456688264000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL1Ya2wcVxW+u+t3/E7iRE7iJs6mktN2R0ACRA4hjh+1w9re" +
                                          "2k6krks3d2fueieenZnM3LHXLiBaCZEWBJGaktJS/0pVqSolQkjwA6ogoBRB" +
                                          "kVpV0BZREH8AVVGb8ia8zrkzszM73k3gDyvN3dl7zz3v891z97lrpNG2yADT" +
                                          "eYqvmcxOjes8Qy2bKaMate0FmMvJlxL0D/f/buZInDRlSWeR2tMytdmEyjTF" +
                                          "zpI9qm5zqsvMnmFMwR0Zi9nMWqFcNfQs2a7aUyVTU2WVTxsKQ4LT1EqTHsq5" +
                                          "peYdzqY8BpzsSYMmktBEGokuD6dJu2yYawH5zhD5aGgFKUuBLJuT7vRZukIl" +
                                          "h6ualFZtPly2yB2moa0taQZPsTJPndUOey44mT68yQWDV7r+fONCsVu4YCvV" +
                                          "dYML8+w5ZhvaClPSpCuYHddYyT5HPkUSabIlRMxJMu0LlUCoBEJ9awMq0L6D" +
                                          "6U5p1BDmcJ9TkymjQpzsq2ZiUouWPDYZoTNwaOGe7WIzWLu3Yq1r5SYTH7tD" +
                                          "unjp/u6vJ0hXlnSp+jyqI4MSHIRkwaGslGeWPaIoTMmSHh2CPc8slWrquhfp" +
                                          "Xltd0il3IPy+W3DSMZklZAa+gjiCbZYjc8OqmFcQCeX9aixodAls7QtsdS2c" +
                                          "wHkwsE0FxawChbzztjQsq7rCyW3RHRUbkx8DAtjaXGK8aFRENegUJkivmyIa" +
                                          "1ZekeUg9fQlIGw1IQIuT/rpM0dcmlZfpEsthRkboMu4SULUKR+AWTrZHyQQn" +
                                          "iFJ/JEqh+FybOfqFB/RJPU5ioLPCZA313wKbBiKb5liBWQzqwN3YfjD9Jdr3" +
                                          "nfNxQoB4e4TYpfnmJ64fv3Pg6ksuza4aNLP5s0zmOflyvvOV3aNDRxKoRotp" +
                                          "2CoGv8pyUWUZb2W4bALC9FU44mLKX7w69+K9n36WvR0nbVOkSTY0pwR51CMb" +
                                          "JVPVmHU305lFOVOmSCvTlVGxPkWa4T2t6sydnS0UbManSIMmppoM8RtcVAAW" +
                                          "6KI2eFf1guG/m5QXxXvZJIQ0w0Nuh+cAcT/im5NlqWiUmERlqqu6IWUsA+23" +
                                          "JUCcPPi2KBUgmfLOki3ZliyJ1GGKIzklRZLtYDFU/dKYastFai0xezavqUti" +
                                          "NoU7zf+vuDJav3U1FoPA7I7CggYVNWloCrNy8kXnxPj153M/dlMOy8TzGyeH" +
                                          "QHoKpKdkO+VLT4Wkp2pJJ7GYELoNtXAzAeK4DIgAkNw+NP/xk2fODyYgBc3V" +
                                          "BoxCWZToLv8HbIxoK8DgI/PmU6//9PcfiJN4gBtdIcCfZ3w4lKvIs1dkZU+g" +
                                          "x4LFGND98vHMo49d++yiUAIo9tcSmMRxFHIUgBcA7DMvnXvjV29dfi1eUbyB" +
                                          "A1g7YLbMSQvNA9JRmXPSWoEsTtoCX7lWbvs3fGLw/AsfNBgn3FzsHfUKYm+l" +
                                          "Ikwz5JuYeN8J2CcMQggLxSI1EhJlkT31IEbA4+WHLm4os0+/zwWC3uqyHYdT" +
                                          "6as/++dPUo//+kc1cqKVG+ZdGlthWlXcONlWKxnQvTs3HUoukMrPb3S17Ng4" +
                                          "9fM4aQiBXTtEseBoWkVqWAM8IC1WUEV2t4uxxxRfh8Ext0hXXnVOC/UPuZs/" +
                                          "zMnWGpshsP5rmHoYIhtQcxKXq5aPcQAvd5mTBIzhxRGYgkV8PWGa5Vg0+ZN1" +
                                          "+pVQ65CTL7z2bsfpd1+4LsJT3XuES2KamsOui3DYjux3RItyktpFoDt0dea+" +
                                          "bu3qDeCYBY4yHLj2rAX4UK4qII+6sfnN736v78wrCRKfIG2aQZUJiqc8YDUv" +
                                          "QmNQBGgpmx89LqC2fbUFxm54EjfP4DFDdkoAhcx12N3eflLZT8rE5zBQk8Mc" +
                                          "47AfHRFmECgQ46RxhWoOA0986JaOxgYP2J3GDX6blpOn73nwyO5HfvumAKIW" +
                                          "0eIARXVn4R6jAEcNyBN16XDj4IIAaLIFFRuEZ793IIlvXO0zcdyBwTpQR0Ws" +
                                          "UL8Lzsmdp957+cw/XvwjhO4kaTYsRdWpBmEbqt/5iq4+4LDz77Na/qHf/HVT" +
                                          "OqEmjTV6j8j+rPTcV/pHj70t9reCSziFUxoaqoFoB1TVtGArFD2ZoJkN+L7/" +
                                          "2dKf4oNNP4iT5izplr0QiHgAimehO7T9uEA3XbWOms95oMLJ7qgeITHD/nGC" +
                                          "W1qqsaZ2+ARk18bwg0EOBG6UKmmZMeC0WEuJDh+Ln4hYLwq2A2Lch0PSPV/w" +
                                          "9QAcMrbo0SF1CxhZThrw3iAUGgKkmTs1szA1Pe4XRvLmheFqgLRukY3hcF+5" +
                                          "fsF5n7jYEtTfrppiFhD9eb3iw+kMpPWh/6nyRiyLrkF/u+Xe977/yb8R90SC" +
                                          "IvbuPNVlhbJIPzxJT+9kjbLaH+AZNJsaVCrmenIeLgMa44aOfcrBd4a6jz7z" +
                                          "5CUhrpm5+oikKrtn8j04lFzHnbplXtxeMy88M7EWojlx7mY5gcMZHCgOeT8V" +
                                          "mqbHFyZnx/wQ7a0ZopBMpFsNssD6L7NgtezjcOjY2l8VU3FZ9aI67bjX1Zz8" +
                                          "tY2TMw9c/+DTbgsHBq+vi8sNOLhgWKVKSC2yry43n1fT5NCNziutB7CDCZ1w" +
                                          "oueN6nZb7XiPl0y+hrFe/9aObxx9ZuMt0dpBnprYtPQHm0QG2knxhfRvXD76" +
                                          "wsvnm16F3FgkMQqtw+Jm7C+bDnRhi+ngT5fQ/yIqzWtseOiJtWN3Ft75hSeX" +
                                          "iE69Pj3g7KOvT11Z/stxcZFqhMaElQUIjq3pc0xegeO3xdHVcw6bgtt3J0If" +
                                          "xRuucJnn6Y7KLFw+AFMGN11lYRr6Eyv8hwyc8KvMOmE4uiLAEA6JYKbqgu3h" +
                                          "ZptjmpENwUwlyts225qTxx7u+vaF3sQE9IRV5oTZN9tO3k/gjvCdO4DqblET" +
                                          "Zbf6Ern0tGl61dh8l9dVP+yS4DQnsYMi6lsjUcdwlx98dc+Xf0ifgrsw3D9t" +
                                          "dZ250XKbcmTyeSHyc+IVhy/+B7qtLYRyEwAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1456688264000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL05e+zrVnm+v/u+Lb23BdqqLW1pb9GK4eckTuJEZRuOEydO" +
                                          "7DwcOw9vcPE7jp+xjxM7rNtAYiCQAGmXgTRW7Q8QE+KladImTZs6bUNMY5OQ" +
                                          "0B5IAzRNYhNCo+yhbWxjx87vdX/93Rb+WSSfnJzzfed7f5/Pl899D7kYhQga" +
                                          "+E5qOj7Y1xOwv3Qq+yAN9Gi/y1aGchjpGuXIUSTAtVvqU1+6/u8//Ojixh5y" +
                                          "SUJeK3ueD2Rg+V7E65HvrHWNRa4fr7Yc3Y0AcoNdymsZi4HlYKwVgedY5J4T" +
                                          "qAC5yR6ygEEWMMgClrOAkcdQEOk1uhe7VIYheyBaIb+InGORS4GasQeQN955" +
                                          "SCCHsntwzDCXAJ5wJfs9gULlyEmIPHkk+07mlwn8MRS7/fF33vjt88h1Cblu" +
                                          "eeOMHRUyASARCbnX1V1FDyNS03RNQu73dF0b66ElO9Y251tCHogs05NBHOpH" +
                                          "SsoW40APc5rHmrtXzWQLYxX44ZF4hqU72uGvi4Yjm1DWB49l3UlIZ+tQwGsW" +
                                          "ZCw0ZFU/RLlgW54GkCdOYxzJeLMHASDqZVcHC/+I1AVPhgvIAzvbObJnYmMQ" +
                                          "Wp4JQS/6MaQCkEfuemim60BWbdnUbwHk4dNww90WhLqaKyJDAcjrT4PlJ0Er" +
                                          "PXLKSifs873+2z78bq/j7eU8a7rqZPxfgUiPn0LidUMPdU/Vd4j3vpn9NfnB" +
                                          "P/jAHoJA4NefAt7B/O4vvPT2tzz+4ld2MI+eATNQlroKbqmfUu772mPUs/Xz" +
                                          "GRtXAj+yMuPfIXnu/sODneeSAEbeg0cnZpv7h5sv8l+e//Jn9e/uIdcY5JLq" +
                                          "O7EL/eh+1XcDy9HDtu7poQx0jUGu6p5G5fsMchnOWcvTd6sDw4h0wCAXnHzp" +
                                          "kp//hioy4BGZii7DueUZ/uE8kMEinycBgiCX4YO8CT7PILtP/g0QG1v4ro7J" +
                                          "quxZno8NQz+TP8J0DyhQtwvMgM6kxGaERaGK5a6jazEWuxqmRsebJ6Ifa1qR" +
                                          "upBDU48GimOZ+ep+hhn8/5JLMulvbM6dg4Z57HRacGBEdXxH08Nb6u240Xrp" +
                                          "C7f+fO8oTA70BpAypL4Pqe+r0f4h9f0T1PfPoo6cO5cTfV3Gxc4ToB1tmBFg" +
                                          "rrz32fE7uu/6wFPnoQsGmwuZFZI8RB/Of5yHeM/ePX/TWfJg8oSpQn9++L8G" +
                                          "jvLev/+PnPOTKTg7cO+MmDmFL2Gf++Qj1M98N8e/CrMVkKF3wUTw+OnIvSPY" +
                                          "shA+rVGYhI/PLX3W/be9py796R5yWUJuqAcZfiI7sT7WYZa9ZkWHaR9WgTv2" +
                                          "78xQu3B87iATAOSx03ydIPvcYTrNhL940pJwnkFn82u5V9yXw9z/I/g5B5//" +
                                          "zZ7MEtnCLi4eoA6C88mj6AyC5Nw5gFws7RP7hQz/jZmNTys4Y+Cnx8Fv/M1f" +
                                          "/hO+h+wdp/jrJ4omVMJzJ9JKdtj1PIHcf+wyQqhnyvq7Twx/9WPfe//P5f4C" +
                                          "IZ4+i+DNbMw4hjUS1pr3fWX1t9/65qe+vnfkY+cBrKsx9FAVTqK85EFJoEfL" +
                                          "Tq6QpwDy0NJRbx5KPYElEDJ2c+kQuapeD4t+zlpmlf1d3cjDC3J08y7ueqLW" +
                                          "31I/+vXvv2by/T986WWeeqdiODl4bmehnKsEHv/Q6SjqyNECwpVf7P/8DefF" +
                                          "H8ITJXiiCitkNAhhQCd3qPEA+uLlb/zRHz/4rq+dR/Zo5JrjyxotZ2UZJlew" +
                                          "gJV8AXNBEvzs23fJcXMFDjfy2ERy+R/dsZOH9X3HimB9WD4/9A8f/epHnv4W" +
                                          "5KOLXFxnPgw5OKGtfpy9UfzK5z72hntuf/tDuU0Q5Nz4WeVf3p6dWssJPJOP" +
                                          "P5UN6M5i2fQt2fDWbNg/NNMjmZnGfhyqOitHgPM1C75RaLmlXjF1DEPLhd62" +
                                          "PiiX2PMPfMv+5D9+flcKT+eJU8D6B25/8Ef7H769d+IF5OmXvQOcxNm9hORM" +
                                          "v+bIlG98JSo5Bv2dLz7/+7/1/Pt3XD1wZzltwbfFz//V/3x1/xPf/rMzcvUF" +
                                          "xz90ymwsHZDNviqvblhwz292yhFDHn7Y4lwubdRJMkVjFOBYi7B4+HSjqmuD" +
                                          "fokvkBRPlhfLBVrc1EO9ZFft0I5wrWTEuqXrnuRxONuZsVZDpqTWtNFtyzbo" +
                                          "jrFCMFmNfWdkLzdk1Tf9Bt+wJ8Gk0JD4VqdGTiZtpWbJtW1ob6MtR+A2bjbT" +
                                          "dR/XHGK7xde1enFbJ5ww6LdLKdkU9Plq7arJYKlHtVFaUnoyB3NVgXa5dddJ" +
                                          "2EITMzAllhivyTvjqc6XAJcCzW2lS4HeBkx95Va2q2jNeS7NbfiCZNU9brqi" +
                                          "1b4xikoyIYvpRBBL04mQRL1RmRWKrZXQiVaVQJ9r29W81gi20XjOQZ00Wm3f" +
                                          "jptVrRuX0rm86VS2i2ZFbpt0T4wbbDcWiDUvxTbjLKqx7NASGDppKW2UXF8u" +
                                          "AHkkDSOhO/Q0caCn5bIrVGvpaNqcECFqDPpUNInLc2o90eYcW0M3FWmxliln" +
                                          "OA6oeN7RtHkqVDpDWxzLCuPwXNLl4gLriJTfaHXr8oZbFdhqsypWgmKj6ard" +
                                          "umCn7nIEeV+VJEv04+mwOZd8ob+RB22dmDLbKRvj81UxrIznQocAzdhbBlhc" +
                                          "XXcLi5njjQN0ma6YMjfuMLy9kduR09anQ5nxBc4ddxYlaqjWImcaruKFEcwc" +
                                          "oBUsB2eGKTrFm2NOsh2JlFFzaVGKNF+qtcHKpdURpc/qspX4GulExAhE2rik" +
                                          "bjr2JmoV6ETeUAtluwXLUbQiQiqd4nyHFxU7qTVJsJRn7V5NpvlWXzfFrm2t" +
                                          "3ZSRi5Ju66JZN0YO094UmRETC1gYcAVNdR3JCFoRWPC24nNxeSyyYo9HyakQ" +
                                          "Sp10NPIsuot1W6sFSqfKwFjRDYzvDsWK5bNDSiLxIr7pKQ2rp1QcqzEdbVeb" +
                                          "Pj43ls16Vwtxz+gnI79R1svCPDA8t1stG2t8aFbtKN7KZbnPDitRYesODCdd" +
                                          "rwcTXO43+aTn8z4ISpTfXteCVJyKklKalhWSpeq0CB2C7c2ITbWO9uoeXp2u" +
                                          "+YKnTAb2WJgXgg1fKVKc0p0MJ25HxAsVhx5MBu6YWgvOpJ0M7alcFkqgGqWa" +
                                          "Ny6ICid7Y4Zzg8DnajxQJyQ5rfaYkk4bRTNuY25lNEtma6nLjAqbQj9eoCqp" +
                                          "CpjlVvrOamqJbot3Vqu4ykzFiERLeFek1OHQKvUaouka7MC2cMmx0m6x3e4x" +
                                          "W9vhJRbMm7SIab05TNm0bBUSfSuvVyKw+r5IbA10HTe78hoXi7Q/JAmGoExz" +
                                          "PulPHZ8K+2nNnnnJcFms4BymOdwgrQnbdqp3Rh2/F/Q0e4BOWKE8tYNS0O0S" +
                                          "7XmL9ftgRm5JvVduMiZp9zdof4gldskYNNO52VDxScNPqKkk+Oy61lGYxO/V" +
                                          "miaDDV2ximH1oWpY3X7ZbACNUSlDwjdlp7dmoqJmSyJqJmWWbveb9dq6w/nl" +
                                          "uoaiqSWSjF8H6tjl+ITuMCIkQhJNbu3N1stJqa4ZVlEXlbRBFk1izirceLTu" +
                                          "k/Uu786G46nfigTgUzPCmSrrCDfa7AYjI6PfMD2c3kYdQ+zNXdRh7M220o3n" +
                                          "er/WLVEqNzJNNhkzxdai69gCXmRaCllGpx3WLftRAcW2mymFx6u0M9eEqhxh" +
                                          "KKoNRR/DUFstqqvepI1KWtsBi6kzUwd9Z9pLvNFaiPAOTAg2Fw4VfFwk+ma5" +
                                          "bnBleWQ1ZgJoRXrDn9qT1ZTkagxVnIqtSQmU4yRJeGNRayUA5oeZNxlQmDiM" +
                                          "pQjbct60HUSLaFgJ3Y4/ZxZgpCa92aoiD9URudYqrtBgtouEb89Ne1IbTtty" +
                                          "ZWIWUKlfRIPJqFqhBJbYlpTICLQiWmajroDP4ta41JPdaBBbeHO+jBOcZ0Bq" +
                                          "g4D2m6Cg6TKqxPiqqVPzxrycdthlKSRnZbFXXjEMWo0Mr0/g1TVR24QU3zOY" +
                                          "dgmmX7FrrdTavCmuR25/1GibgZvU6uyKKhmKSCdupdxaGsNyk25qtk8u1KRY" +
                                          "6uO64bCSUAtblW1jZNc4tUyQRoen3RZljspVPllM/QFZqNeqXXmQmPNhqYu3" +
                                          "m7Oq4gQDj8C9TTqodIx17JI9ZlrQGZKfTbwyX12SLbWfNvrF6qy5LDMMKbMM" +
                                          "TfNxSyLqOMM469mgsFW1tLERghFfmEYiW2O3kasF9QqBqhtstt4sF4OyLQvz" +
                                          "iNemQcNtKSuAVaxVGSqxuSWIvoytOgbWmQiDVctdCpPqsrZEw6GgTrCgsyQK" +
                                          "AJZ1ary1aDHx5ZVP+42iMAFtMqSbJcnv2n2UJbCS1jPKfr8/LFtCxdoGTlgY" +
                                          "WR2TtFx9MSCEetwi8ZkyHbhRveJzbJdYmTojdJqY16amxdUqkqUSSvJ2saZs" +
                                          "zEJr0GhXxZ7rSpxOFaatuNtcoKxXXszZzapEllh1URiOhxNsUx+RKhcqfmFM" +
                                          "F6lkIQmLcINbpNg2e7YrRMVoSxaHennGr1l3odMrk+Vje44vVBqtGBFd8Yjl" +
                                          "vAUEIwwCi14067qCWxvU5oLhdIFVvZS3Uja0aSxGZ3qdILBUqfH1wphi1ko8" +
                                          "7E+chdJlhtukK6B1e6mwcgclpX43kidU6Ooeo7MmJ5fL8sBQw4ZWlqvLLbGt" +
                                          "UOIiDNwK6lt2LwRebVkoO/S24ymBMwOJzqW1Gke0pv7SSQh3XjFVTupQ5kAX" +
                                          "ahN3pXToVPISbDMi5ILkBw0uoKN+FDWrLAxSoG+X6mA5Lzm1iYjTUl1mqoSy" +
                                          "nBWlbQ3MSwK3qasY2hQUM+o0VujaqkX9Abswp71Jb0yV0jAt417RECp9qr+1" +
                                          "YtAgqCYlFTd+rPernqQQM2voFFJ0EdI6VpcHSpLUpZiDwRY0vCCcg+Go4xZG" +
                                          "7ZLtJQuDX8+aRHUTrT23WKVx2rS50Qps0K5LUKjS9PiFhXqmUDFGWMqstlMQ" +
                                          "6QOrC6Z9nAZEZTHWZ1arWh8ucZPoDdZCsShhEUhUiV7Bu0zLGYnMcoUHKiwj" +
                                          "pj7AE60zUTdVxQQA7xYYI+HjWO16XnVO9Fh6g5I01+4Xi86cD6utdF1bbFK1" +
                                          "1ltzA7dVji2WbJHV7rynrMwYX0gBWLpBq78RN04KolKpshKShIjRtUzj0ahV" +
                                          "Z/hJxRekfh0McBszl2tKG5SbK8VpCZJiVFuhVwBtp1rUFjWnrk2GaDouN0de" +
                                          "NOesqhMtRVXbOEm9pqnozChYhhlGG7xZB5pUqhRmPUV1hVQfd1IVZSaLFEMb" +
                                          "xAqwcz5tbUgye1VnfrLb0v35pfaoMwovSdlG4Se4JSRnE7yQEwTIFVmJQAiv" +
                                          "kgC5etSqBci14xvujpUTLZ5zhzfqJ47viMfgJ67N2ZXpDXfrlObXpU+99/YL" +
                                          "2uDTxey6lB3ahFwAP3iro6915wRJJAHI685qVWUdhYdf1jLftXnVL7xw/cpD" +
                                          "L4h/vYdcONGKvcoiV4zYcU52V07MLwWhblg5N1d3N/kg/3onlPdVmmngjsZA" +
                                          "zv47dsgyQF57BjJU/+H0JDS8nF47hgbInnrHtgmQywfbADkPx5ObS7gEN7Op" +
                                          "nTV87lDiscc8cKfH3HvkMedf2bhNX41hfgS69ir3UnjC42eewOsA4h/2+F7O" +
                                          "QNahypsQ0LLEq3Zmsj909IPO22FH7hZ8s3pP/bEPfucbef/qSt6egxAZvSfu" +
                                          "1kqDlO/JGHkKPk8ftJjz72z3tUE2vi7z52fuwlJ2tz/uH94n/uAv3vXfX/7X" +
                                          "vKdy2Q+1o0bVo8edO+Tszt2bj7uHx2rDjtQ29B1LTffz/5gyAyM5b9tXivLj" +
                                          "tAKQC9lfVofZ5TIv9gWGax1a7OYrW2xHOoN9z7EnvfsVcs/BZy9HOXaMR88k" +
                                          "I2ShDe7mFdlyDPVf/olcggxDOb2l3nvP/Ad/8vx/IrumC/Sug7/b7rR/Rgt5" +
                                          "BD43D/i+eYb9nz7uzFG+4+hq7so3x5ZnOjrwvaxF/uZ/fvbG2z7z6x/PyV3W" +
                                          "d/zk3pcEObV1Nnxwp7j0VR3iTWc6xIGYWSo97Qwf/vGcIRt+6dAVLnEtoTNo" +
                                          "HproyTNNdIJmBnf72As+8mN6we3kMEEc5aSTLeHMpvn/pAdW5eLdP6W31C++" +
                                          "0O2/+6Xqp3ctaSjwdpudcgUq2PBD98ikJ5t0p087POtS59kf3velq88cVp37" +
                                          "dhnxuKie4O2Js+3dcgOQZrbe/t5Dv/O2z7zwzbwt+n9oXQKxwB4AAA==");
}
