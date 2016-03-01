package org.w3c.dom.events;
public interface CustomEvent extends org.w3c.dom.events.Event {
    public java.lang.Object getDetail();
    public void initCustomEventNS(java.lang.String namespaceURI, java.lang.String typeArg,
                                  boolean canBubbleArg,
                                  boolean cancelableArg,
                                  java.lang.Object detailArg);
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1445630120000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAALVXe2wcRxmfO78dJ7YvjROSxokTJyJpe6s0tKU4hTqOXTs5" +
                                          "24edBmGXnud25+yN93bHu7P22WnoQ4JGFURV40JBxH+l4qG+hKhAoEZBINqq" +
                                          "QNVQQR+iBfFHeUVq/iGgAOX7Zvbu9tZ2ioSwtOO5mW+++Z6/75unLpEazyU7" +
                                          "OLUNmhTznHnJNM7T1PWY0WNRzzsKqxn9kd+fuf/KrxoejJPaMbJuinqDOvVY" +
                                          "n8kswxsjW03bE9TWmTfEmIEn0i7zmDtLhenYY2SD6Q3kuWXqphh0DIYEx6ib" +
                                          "Iq1UCNfM+oINBAwE2ZaS0mhSGq07StCVIk26w+fLBzZXHOgJ7SFtvnyfJ0hL" +
                                          "6jidpZovTEtLmZ7oKrjkBu5Y85OWI5KsIJLHrVsCQxxO3bLMDDuea/7b1Uen" +
                                          "WqQZ1lPbdoRU0RthnmPNMiNFmsurvRbLezPk86QqRdaEiAXpTBUv1eBSDS4t" +
                                          "6lumAunXMtvP9zhSHVHkVMt1FEiQjkomnLo0H7BJS5mBQ70IdJeHQdvtJW2L" +
                                          "7o6o+PgN2uJX7235bhVpHiPNpj2K4ugghIBLxsCgLJ9lrtdtGMwYI602OHyU" +
                                          "uSa1zIXA2wnPnLSp8CEEimbBRZ8zV95ZthV4EnRzfV04bkm9nAyq4FdNzqKT" +
                                          "oGtbWVelYR+ug4KNJgjm5ijEXnCketq0DRlHlSdKOnYeAQI4WpdnYsopXVVt" +
                                          "U1ggCRUiFrUntVEIPnsSSGscCEFXxtoqTNHWnOrTdJJlBNkUpUurLaBqkIbA" +
                                          "I4JsiJJJTuClzREvhfxzaejA6RN2vx0nMZDZYLqF8q+BQ+2RQyMsx1wGeaAO" +
                                          "Nu1NfYW2vXAqTggQb4gQK5rv33f5zhvbL7ykaLasQDOcPc50kdHPZde9dn3P" +
                                          "nturUIx67ngmOr9Cc5ll6WCnq8ABadpKHHEzWdy8MPKzzz7wHfaXOGkcILW6" +
                                          "Y/l5iKNW3clz02LuXcxmLhXMGCANzDZ65P4AqYN5yrSZWh3O5TwmBki1JZdq" +
                                          "HfkbTJQDFmiiRpibds4pzjkVU3Je4ISQOvhIDL6PE/W3FQdBMtqUk2ca1alt" +
                                          "2o6Wdh3UHx0qMYd5MDdglztaFuJ/+qZ9yds0z/FdCEjNcSe1uf26Zjh5jc0y" +
                                          "yGGtx/eEk+/FH0kMNP7/v6KAWq6fi8XAAddH09+CzOl3LIO5GX3RP9h7+ZnM" +
                                          "Kyq0MB0C+wjSDvck4Z4k3JNU9yRD95BYTLK/Du9TvgXPTEOOA8g27Rn93OGJ" +
                                          "UzuqIKj4XDXatSCTbkvxBxyMyCXT+45RfvaNX/5pf5zEy0jQHILwUSa6QtGH" +
                                          "PBMyzlrLchx1GQO63z6RPvP4pYfHpRBAsXOlCztx7IGoAygFSPrCSzNvvvvO" +
                                          "udfjJcGrBMCvn4VKJkg9zQJ2UV0I0lACIaXYdR/AXwy+f+OHOuKCCqhETxDV" +
                                          "20thzXnIHDE53wSZtILJpbHRXltXAwgJbuceWlwyhp/cp9I4UZl0vVBTnv71" +
                                          "v36efOJ3L6/g6Qbh8JssuM8KCRWHKzuWdQmDEj+L1Taj33bxStXbj21qkv5q" +
                                          "ykKDUK7SnRVVWjUZrqMzA8rEavW6WLP2rl6hoyK8+NCfNx/95NSEFCFcc5FX" +
                                          "DZQLPJnGSlnivi1iyijLbw8+9fJdu/XH4rJIIOCuUFwqD3WFjQqXugyqoY1q" +
                                          "4craArZckTyM2iKj791On8+8cLIzTqqhakClFBSQDYpQe/TyCqDvKqYKXlUP" +
                                          "Rsg5bp5auFWsdI1iynXmyisSIFpV5IKzExioW+DrCKBQ/sfdNo7jRgUokr5d" +
                                          "jh04dKpIwekuHHZLso9C5OwuZyNgtwXghh7pvNsGZ5s5k2Ythjjxz+Zd+57/" +
                                          "6+kWFZQWrBRddOOHMyivf+QgeeCVe6+0SzYxHXuHMmKUyVRBWl/m3O26dB7l" +
                                          "KDx4cevXXqRnobRBOfHMBSYrBAnQCoU6KNW+Q47dkb1DONwOiTTJxCEGTrOK" +
                                          "Gd0iL8POIqnKKAjQuUpshxrBjP7o6++vPfb++ctSpcpOMgyHg5R3KV/i8AnE" +
                                          "iY1RQO6n3hTQfezC0D0t1oWrwHEMOOpQSrxhF6pAoQI8A+qaurd+/JO2ideq" +
                                          "SLyPNFoONfoo9mxQeSGUmDcFBaTAP3WnCpe5ehhapD3IMguh0bet7M7ePBfS" +
                                          "AQs/2Pi9A99cekfiruRwcyk41yCX/fDdGgTnzf9TcFa6sUZS1azgL9UJ4vpn" +
                                          "pNNCUIgvmlEfakHaNfNQh2aDfuvZtiszP61bOFTspVY6oiiPeIOv/rD/vYwE" +
                                          "rXrEzRJUhBCx250MpWuLlB9dvOca75dKibSTiXenv/HHp5VE0XYxQsxOLT7y" +
                                          "QfL0ospG1VPvXNbWhs+ovjoiXce1bpEn+t579uSPvnXy4XiQP0lB6rKOYzFq" +
                                          "lxwTC0ojdpAROyppa/ed/cf9X3xjGMBygNT7tjnjswGjEobrPD8bMmy5EVeg" +
                                          "HJIbqzX0NHs5l6vjOPTJ6bFrJL7sJj8tSKtpmyLUHA2NSvJ7ApvgvwlBqmcd" +
                                          "U709+nEYURtH/rskwoV0QZA1oWswszYte92pF4n+zFJz/calu38ji0np1dAE" +
                                          "4ZbzLStkpLDBarnLcqbUrUnhirIH1KDE8uYEWiM1keLOKFIfZAyRClIFY5gA" +
                                          "lKgLCGATxvDmCViCTZzeB76IVXaNJdtt+DDbhRrNnRXZIt/MxWDy1asZMnfp" +
                                          "8NCJy7c+qfpOeG0vLMg3FoSQKqal3qFjVW5FXrX9e66ue65hVzG6W5XAZZDa" +
                                          "EoqgNMQ4Rz9ujpQlr7NUnd48d+D8L07VXoS8HCcxKsj68dCLVdUVqG0+wOx4" +
                                          "aqVkgc5KVsyuxj9MvPr3t2IJCbNBerVf60RGP3P+7XSO86/HScMAqYHkZYUx" +
                                          "eIJ7h+btEabPuhW5V5t1fLv0vF6HQUcRRaVlAoOuLa1iByTIjuUIs7xJhAo0" +
                                          "x9yDyD3I5Ypuy+c8vCsta6jkUy14VSY1yHnQkjd8SVqec5lUX8aB/QfzkVPq" +
                                          "GBMAAA==");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1445630120000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAALU5eezkVnne396bkN1sIEkDCSTZoCYTfvYcnkPLNeM5bI/H" +
                                          "9ozn8AwtG59jezy+7bFNU1EEJSpSiNqEUgnyV1BbFA5VRa1UUaWqWkCgSlSo" +
                                          "l1RAVaUeFIn80UOlLX32/I7Z324Soaoj+c3ze9/77u97731++YfQWd+DCo5t" +
                                          "JkvTDvaVONg3THQ/SBzF3ycplBU8X5ExU/D9MRi7IT3y5cv/9uPntCt70LkF" +
                                          "dI9gWXYgBLpt+SPFt81IkSno8vFox1TWfgBdoQwhEuAw0E2Y0v3gOgXdsbM0" +
                                          "gK5RhyzAgAUYsADnLMDNYyiw6E2KFa6xbIVgBb4L/SJ0ioLOOVLGXgA9fDMS" +
                                          "R/CE9QEaNpcAYLiQvU+BUPni2IPecST7VuZbBH6hAD//6x+88junocsL6LJu" +
                                          "cRk7EmAiAEQW0J1rZS0qnt+UZUVeQHdbiiJziqcLpp7mfC+gq76+tIQg9JQj" +
                                          "JWWDoaN4Oc1jzd0pZbJ5oRTY3pF4qq6Y8uHbWdUUlkDWe49l3UrYzcaBgJd0" +
                                          "wJinCpJyuOTMSrfkAHr7yRVHMl7rAwCw9PxaCTT7iNQZSwAD0NWt7UzBWsJc" +
                                          "4OnWEoCetUNAJYAeeE2kma4dQVoJS+VGAN1/Eo7dTgGoi7kisiUB9JaTYDkm" +
                                          "YKUHTlhpxz4/pN/97Ics3NrLeZYVycz4vwAWPXRi0UhRFU+xJGW78M4nqE8J" +
                                          "9371mT0IAsBvOQG8hfm9X3j1/U8+9MrXtzBvvQ0MIxqKFNyQXhLv+vbbsMcb" +
                                          "pzM2Lji2r2fGv0ny3P3Zg5nrsQMi794jjNnk/uHkK6M/nX/488oP9qBLBHRO" +
                                          "ss1wDfzobsleO7qpeD3FUjwhUGQCuqhYMpbPE9B50Kd0S9mOMqrqKwEBnTHz" +
                                          "oXN2/g5UpAIUmYrOg75uqfZh3xECLe/HDgRB58EDnQJPHdr+HsyaALoBa/Za" +
                                          "gQVJsHTLhlnPzuTPDGrJAhwoPujLYNaxYRH4/+pdxf0a7NuhBxwStr0lvClL" +
                                          "sGyvYSVSQAzDWOgH9rqTvexnjub8/5OIMymvbE6dAgZ428nwN0Hk4LYpK94N" +
                                          "6fmw1Xn1ize+uXcUDgf6CaCHAJ19QGcf0Nnf0tnfoQOdOpWjf3NGb2tbYJkV" +
                                          "iHGQ/e58nPt58qlnHjkNnMrZnMn0GudBd3/+chqse/y1M3I3SwdEngIl4KH3" +
                                          "/ydjih/5u//IedxNqhnCvdtEwYn1C/jlzzyAvfcH+fqLIP8EAvAXENoPnYzF" +
                                          "m8InC8qTugNp9Rhv6fPrf9175Nyf7EHnF9AV6SBnTwUzVDgF5M1Lun+YyEFe" +
                                          "v2n+5pyzDbDrB7EdQG87ydcO2euHCTIT/uyuzUA/g876l3L735XD3P0T8DsF" +
                                          "nv/JnswS2cDW069iB+H2jqN4c5z41KkAOlvar+0j2fqHMxufVHDGwHs457N/" +
                                          "9Wf/VN6D9o6T9uWdbRAo4fpOosiQXc5Twt3HLjP2lExZf/tp9tde+OHHP5D7" +
                                          "C4B49HYEr2VtxjHY9cDu8bGvu3/9ve++9J29Ix87HYCdMhRNXQIdP9/EgCSq" +
                                          "bglmrpBHAug+w5SuHUo9BZsaYOyaYdZyVb0FbOM5a5lV9rc7QR5IgKNrr+Gu" +
                                          "O7v3Dem57/zoTdMf/eGrt3jqzYoZCM71rYVyrmKA/r6TUYQLvgbgKq/QP3fF" +
                                          "fOXHAOMCYJRA/PuMB0I3vkmNB9Bnz//NH/3xvU99+zS014UumbYgd4VsowXp" +
                                          "MtDA3qyBqI+d971/m+42F0BzJY9NKJf/rVt28rC+61gRlA02xE/8/XPf+uSj" +
                                          "3wN8kNDZKPNhwMGOtugwOyP88ssvPHjH89//RG4TkFzZT3WuvD/DWs8JPJa3" +
                                          "P5s1ha3Fsu6TWfOurNk/NNMDmZm4PN9Rgh8MbFkHZwQ5t9Trpg7W09fA26KD" +
                                          "DRB++ur3Vp/5xy9sN7eTeeIEsPLM87/yk/1nn9/bOVI8esuuvrtme6zImX7T" +
                                          "kSkffj0q+YruP3zp6T/4rac/vuXq6s0bZAec/77wF//9rf1Pf/8bt8nKZ0z7" +
                                          "0CmztnRANvtD39iwwR2v4BWfaB7+qCmvlDbSKF6rTK0uk7V5ZIwYLrZXYzIh" +
                                          "HaXqI0F/UtHGLsOPfbRUUeTWusdboVxCCwndKIt4WGNLpZllDytkrzsZTSsI" +
                                          "2YrxgllxewWtrzXtzqJF0K47pKfD4aigt9QurkymLqz3lk2Gry0iMWwEi5Ju" +
                                          "c5uAYdD1rFAoLKpwDQ0tyukIaTKpMdSEXmvjFJyBSHpQGxfZ2RyZ0aM09ftu" +
                                          "bDVWckENVbjvxbZikKwwEMlQt9w2E03nVn3lb2LfmCFlsdMYz9ZjtbMmOhai" +
                                          "19J1O6A0xZrPS1y7OiyvwhnvOpqGtIl5J67qIuEWJxitDgo2Qbeam05pIXDI" +
                                          "WuN6LlLjAmxKrErVTUGlWumCx5klWeO6QWQlKoloVNXQZWdhR+NOQK0XNbvv" +
                                          "GatWiM7rKDMj0L5PkBTuTX1sGMdMWaQG7XaoCHBNLE4Ua+YOF0WTFWV7NEFG" +
                                          "gWatWXqg0921H3rRSKSUlF3Vq0N3JAsdvck749YkKiotrs1Vgio4KTVDix8E" +
                                          "EdtINQ6f4qvpICh2O/rQWNlri7IRvNYiOXTdGtYQQiYVfChHATkrUTW7ahfY" +
                                          "JV0KSb5WKqOiNnVwnaUdo9SvhMulRrSo2MeWFNkwvUAOeoPNnKgiJQZPJiEn" +
                                          "FFOCb5Y2FmtRnFPHOh19LbZGi3o6baCLQJtWOtYoVadIRVytG1YzcStdmU7d" +
                                          "/tjuBeJsqpjzUSFcVvo0uTTWqG50eAtbKYGLtEcmbnJyn7HmSnNIVGaObM19" +
                                          "2+Gn02BSXC6x0UTvehOwuXYI1vI5rudLWKfLx4Htjml8ZjHeWCZJs0WvJs4k" +
                                          "9Cih5a4IsUlUSF8nSXIcYmY66kSaGqeCYjSrI7oUxYg1WLQXc8rt1t1Ca1go" +
                                          "jYbJwI+Lm54iNBk6LNLqfFaK+KY7Xi6HYmU57KNeVC6raKpFIlVLVgJIXsM2" +
                                          "I7ESiqxknF3ISkO2yqwFbkoTIq7WrOWa8RqYhJpmdYZZbr3ZEmSnj+OddCYn" +
                                          "9QHbT9O0tsFVgWd6K4mgZtU5bKJ6n56VJTNFSlTIS/Ga0vhBD2vSaXtRRdlK" +
                                          "053TaOJxi5lWZtDxZt1a6UVyIbu4uhLH5LDdXev6yNFF2a84qbGaTsqkUiG4" +
                                          "IRNpRJuqsh14Vu4O5dYgcCerkiQUBTMo2dWZrJUneIy4g7mMDtry0kwDoRuS" +
                                          "cMFdNBLZR1K4K2Mdg5Y4pRiqperC0FBDQpKk1wtiWOmsCnAXR1YDmq3BUbXf" +
                                          "nLlVVa/zTXCzxJFGAUsZs0wRDNrjyyO2odUKC2vQT1xk0EKwwsbg2pG0qiwq" +
                                          "qzJJTxrJqN1AW/Mx1YfbYWMcLXl23GGYZn1Zqo2sRpnpkZM0dIm+UeHbvBBw" +
                                          "2FhcRXErTgYJxo8LFXSkRgLNw6gDLNZJEGOIE9RmwgnVYdDD2dYgSU2PkrS4" +
                                          "2Bsy1XJaHbERW3HmKu6MWk2fZ0wsDeIa0bObybLLsR7GpXQEfkwoqwYp9bzW" +
                                          "AIusyrRPrpaNdEiWJlOEQMwmRgj8XB7BTX6TFNQCgzNhH8NcrTOO29MSEmgp" +
                                          "bxF4u4OWN9wiICjSEfERbwZ8c7MkxVBSZuYm0RxYchpEZbIwkWjaGltRrRiV" +
                                          "q4rKkGWqCi+rQ1Grk74fDup9bDTD+2k4k4frdscoUMWxYJTLYswFvGiUiu4q" +
                                          "Qt1k1W9P+jXOGk2nM2Oy8NxB2qx7HSGaVWcUW/LMqmYn/XqBxlQ6hhsozXW6" +
                                          "WFeS0C7fXgwplrR6nGnpkV7UE92gxE290FBJOYR5vOKRBMFg4aS7cdvlWdcY" +
                                          "uny4TFx7XnQrkic0vYW0GieDkt43ao0iY9ULdYki0rHrasIKM7stbtieO0MF" +
                                          "3JYxtx313XmfNyfsyF+iooMKYXfmywSga/HrRPc5outMUaKfdmLdnhXaHtZv" +
                                          "DWFflWm7ZoyWE3vlobKhIRW57xAbZRXi+ILy7QaGMptwkdDLYMMvNa3mRLTf" +
                                          "W6A+uirNA80w4rSwkAtoDa4WVrPuYjjzWiNZZhh8kOiRWhguFQWbKtUCwqXz" +
                                          "GOdDfLDuT5LpqDUz4XWZKVXlVs3st+OKpEQ8744sWxy1GBUftLi512paQ8ye" +
                                          "VEFoF4aVmrwSi22G3jD6eEzGWKc39ph+T0Z0qs4yhGv1+01jGE4cX4u9lsGC" +
                                          "zF0oRKwqFgpSwDmSwwyWCb5ER+X+FNbrTaujz4sj4MZWWRsPVSXFkDYSFO2Z" +
                                          "t8E7A4ZxhpwXa92q07SHRL1ZcIXQkwswyZR0WXE5KmHprs3Qqm031vFQ4XqT" +
                                          "dVvqtoRxky3PLMxRUEXTBKddJgbLUENEJagNagrbUrnm0IdLrN5oNhqSslJ1" +
                                          "LxxtpGRVKYIghNW23FuOrVRtjKWuUPUnC64opEuqMSErkWM5NI1NiGW0Njuq" +
                                          "sMIFWqWHWkloq2G0CHQ/ZatFkemOfWc6r9q6zioEE8FeG47mm47He510RE60" +
                                          "FhaXUGTgzELKbDXkiJGEGir3dZEb67xiRTCOO+i0g/DzeOjHDDWuJUOVQmzf" +
                                          "6RWnbMTT4kzzC3Zk2DovKUXR6ViFAK01Qo6NLD6p8PqQRcxW1esz87TrmvFm" +
                                          "jCG2ITvNEZM4jgArMiypDb4cG71BK1nS41pgWIa/6RkdW/TYdl0crBO0M1WW" +
                                          "OEmIbsojNO6jZjUyGHZMVsWuR1I1nzTqAdcPnHVCTfBmieYistZ0omW0MVvu" +
                                          "WpInNZBBrc58Mgpw2PNXG3uKDBdNYGJ/46fzQGmUnG7FKqRdMoUlcIAv1w0d" +
                                          "sZyi3OxUFmJKccHKodotwbMoyRUnYDvVdI/Ai/12px7OOzN9UFwpFNPvEuqi" +
                                          "mYwwk+jO0WXT7C8prNccx1F7jU11bLxIlVatSkx5gSblICi026I28mhrxC+I" +
                                          "AB7Es3ZSFPzFwFKdOo2RSU0quKrDKD0kogbLctfmhn1XMMtu15jOQHLx+IZS" +
                                          "rYZKFdWmaa86Q/nmYtEWOra7pAfDyihthIYzNL0aPbHkSl0utOsUUpvyNlfH" +
                                          "MSnu+0a1LmPUVAaHzh5S2DBxRXCnq6WE9qd+EsZGYxCxXjkoESQm0i1wLVSr" +
                                          "yKjHltlCjeeYehXGOWkA9lR8tZhPYoUga1pBDDqCyIbaDJ2iQVGlIiTqVvHh" +
                                          "RBqNhKnZtJmQEop6KxkTRjgh/FpMgpMwEjeSdgJiBJ07YVKQ6hEGbqlVYzVJ" +
                                          "ipUpNy8muDVcGXKdm7oKOBNM+LrQgodqupqybq81AAf297wnO8oTP91t6u78" +
                                          "0ntUCwWXqGwC+SluEfHrEQygC4LoBx64agbQxaPi7Jb6TtXn1OEl+/7bVJby" +
                                          "mlJ2fXrwteqg+dXppY88/6LMfK6YXZ0ybG1AMbCdd5kAjblDaw9geuK1r4mD" +
                                          "vAx8XMr52kf++YHxe7Wn8lrGLSUmCrqUrWSzavtRVf3tJ/g8ifK3By9/o/dO" +
                                          "6Vf3oNNHhZ1bCtQ3L7p+cznnkqeAc6I1PirqeNAjt9wtbUmRQ085pvvEO4Sv" +
                                          "3Pjq09f2oDO71a4Mw4Mnakd3qLa3FsyMwGFF/FKgefbmeGS3kATUejVzh7eC" +
                                          "5+GDkmn+n83e42Ttm+Njp7rFW/aO3HN04Bse9M7jGgZmm6Yi5Vq/NrHW+ZVf" +
                                          "EE0lqyf+1+XHil/5l2evbC/EJhg5NMOTb4zgePxnWtCHv/nBf38oR3NKyr4x" +
                                          "HFdljsG2het7jjE3PU9IMj7iX/rzB3/ja8JnT0OnCOiMr6dKXkmGDkqcGVNa" +
                                          "LraUt8sTc0bW3AAuu1SCtgIMY96m7rStBh7H5VNvdLvfpZIPfODIXndkg2Xw" +
                                          "VA/sVfo/2etmyc7mUGePcgmSz7xvJ5dgAXRetG1TEfLq3yZrtqW46HW09KGs" +
                                          "cUHa0i092Kk409ztCJyJbF0+1pb302grDqA7dghkVr//lo9l2w880hdfvHzh" +
                                          "vhcnf5nH1dFHmIsUdEENTXO3CrvTP+d4iqrnUl3chpKT/30sgK7emgQD6Ny2" +
                                          "kzP60S3oM4DHHdAAOg3aXYBPACUfAIBJ0O5OPguGwGTW/WRW2t1JkQfOkmvt" +
                                          "6htp7WjJbm02S6v5J8jDFBhuP0LekL70Ikl/6NXq57a1YckU0jTDcoGCzm9z" +
                                          "zlEaffg1sR3iOoc//uO7vnzxscOUf9eW4WPH3eHt7bfPBp21E+Txm/7+fb/7" +
                                          "7t988bt5ffJ/AdHzzQYbHgAA");
}