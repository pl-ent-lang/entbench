package org.apache.batik.dom.svg;
public abstract class AbstractSVGNumber implements org.w3c.dom.svg.SVGNumber {
    protected float value;
    public float getValue() { return value; }
    public void setValue(float f) { value = f; }
    public AbstractSVGNumber() { super(); }
    public static final java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1445630120000L;
    public static final java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL1Ye2wUxxmfO7+NwQ/AGAcMGEPK67aUJKgyeRgHg8kZn2xC" +
                                                              "W5PkmNudsxfv7S67s/bh1CGgtKBIRWlwEpoE/ilRW0Qgqhq1ahVK1UcSpSmC" +
                                                              "Rm0IatI2fyRtghT+aJyWtuk3s++980X5p5Z2brzzzfee3/fNnrmGKkwDtetY" +
                                                              "lXCC7teJmUixeQobJpG6FWyaO+FtWnz0L8cOTP++5mAcVQ6hOSPY7BOxSXpk" +
                                                              "okjmEFosqybFqkjMHYRIbEfKICYxxjCVNXUIzZfN3pyuyKJM+zSJMIJd2Eii" +
                                                              "RkypIWcsSnodBhQtSXJtBK6N0BUl6EyiOlHT9/sbWkMbugNrjDbnyzMpakju" +
                                                              "xWNYsKisCEnZpJ15A63RNWX/sKLRBMnTxF7lVscR25O3Frih/YX6j288NtLA" +
                                                              "3TAXq6pGuYnmADE1ZYxISVTvv92ikJy5Dz2EypJoVoCYoo6kK1QAoQIIde31" +
                                                              "qUD72US1ct0aN4e6nCp1kSlE0bIwEx0bOOewSXGdgUM1dWznm8HapZ61brgj" +
                                                              "Jj6xRph66oGGH5ah+iFUL6uDTB0RlKAgZAgcSnIZYphdkkSkIdSoQsAHiSFj" +
                                                              "RZ5wot1kysMqphakgOsW9tLSicFl+r6CSIJthiVSzfDMy/Kkcv6ryCp4GGxt" +
                                                              "9m21Lexh78HAWhkUM7IYcs/ZUj4qqxLPo/AOz8aOe4AAtlblCB3RPFHlKoYX" +
                                                              "qMlOEQWrw8IgJJ86DKQVGqSgwXNtBqbM1zoWR/EwSVPUEqVL2UtAVcMdwbZQ" +
                                                              "ND9KxjlBlFojUQrE59qOTUcfVLepcRQDnSUiKkz/WbCpLbJpgGSJQeAc2Bvr" +
                                                              "ViefxM0vHYkjBMTzI8Q2zY+/fv2utW0XXrFpbipC05/ZS0SaFk9l5lxa1L3q" +
                                                              "y2VMjWpdM2UW/JDl/JSlnJXOvA5I0+xxZIsJd/HCwG++9vBp8kEc1faiSlFT" +
                                                              "rBzkUaOo5XRZIcZWohIDUyL1ohqiSt18vRdVwTwpq8R+25/NmoT2onKFv6rU" +
                                                              "+P/goiywYC6qhbmsZjV3rmM6wud5HSHUAA/aBM9iZP/xX4pGhREtRwQsYlVW" +
                                                              "NSFlaMx+FlCOOcSEuQSruiZkIP9H161PbBRMzTIgIQXNGBYwZMUIsRcFScsJ" +
                                                              "5tiw0JWBtMciHdy1dYfFzlOCJZ3+/xWXZ9bPHY/FIDCLorCgwInapikSMdLi" +
                                                              "lLV5y/Wz6dfslGPHxPEbRatBZsKWmeAyEyAzATITBTJRLMZFzWOy7fhD9EYB" +
                                                              "BwCI61YN3r99z5H2Mkg8fbwcXM9IVxYUpm4fMFyUT4tnLg1MX3y99nQcxQFT" +
                                                              "MlCY/OrQEaoOdnEzNJFIAE8z1QkXK4WZK0NRPdCF4+MHdx34ItcjCPiMYQVg" +
                                                              "FdueYjDtieiIHvRifOsPv//xuScnNf/IhyqIW/gKdjIkaY8GNmp8Wly9FL+Y" +
                                                              "fmmyI47KAZ4AkimGIwRo1xaVEUKUThedmS3VYHBWM3JYYUsupNbSEUMb99/w" +
                                                              "jGtkw3w7+Vg6RBTkwH77oH7izd/9bQP3pFsD6gPFe5DQzgDuMGZNHGEa/eza" +
                                                              "aRACdH86njr2xLXDu3lqAcXyYgI72NgNeAPRAQ9+45V9V955+9QbcT8dKRRe" +
                                                              "KwM9TJ7bMu9T+IvB81/2MKxgL2zMaOp2gGuph1w6k7zS1w0wTIGDzZKj414V" +
                                                              "kk/OyjijEHYW/l2/Yv2LHx5tsMOtwBs3W9Z+NgP//cLN6OHXHphu42xiIquh" +
                                                              "vv98MhuY5/qcuwwD72d65A9eXvydl/EJgHiAVVOeIBwpEfcH4gG8hftC4OOG" +
                                                              "yNptbOgwgzkePkaBXictPvbGR7N3fXT+Otc23CwF496H9U47i+wogLDbkTOE" +
                                                              "kJutNutsXJAHHRZEQWcbNkeA2S0XdtzXoFy4AWKHQKwIMGr2G4B6+VAqOdQV" +
                                                              "VW/94pfNey6VoXgPqlU0LPVgfuBQDWQ6MUcAMPP6nXfZeoxXu3Ulj0r46U7m" +
                                                              "/yXFI7slp1Mei4mfLPjRpu+dfJsnpJ2BN3kwubQAJnlj7p/wD68+8+7Pp79b" +
                                                              "ZZf1VTPDWmRfy7/6lcyhv35SEBQOaEVajsj+IeHMs63dd3zA9/vIwnYvzxcW" +
                                                              "HcBef++XTuf+EW+v/HUcVQ2hBtFpgndhxWKHeggaP9PtjKFRDq2Hmzi7Y+n0" +
                                                              "kHNRFNUCYqOY5hc7mDNqNp8dScA5LJSt8LQ7CdgeTcAY4pNevmUFH7/AhjUu" +
                                                              "tNTohkZBSyLlPbY8Q2aXYEtRxRgzlx+xQAawK9agBeU3Zcg5gMcxpwE81zy9" +
                                                              "71dVE3e7zV2xLTblPWbfxZ9uey/N4beaFdSdru2BUtllDAdgvYEN69hZK5Ff" +
                                                              "EY2EyaZ3Rp99/3lbo2gyRYjJkalHP00cnbJh0W7ylxf02cE9dqMf0W5ZKSl8" +
                                                              "R8975yZ/9v3Jw7ZWTeGWdQvcyJ7/w39+mzj+51eL9EOQPRqm3jmPeWe0Oepu" +
                                                              "26jK9Sf+eeCbb/ZD7e1F1ZYq77NIrxROvCrTygT8718g/GR0zGMliKLYal13" +
                                                              "yisbN7Jhu51XncWwKV88LeNsupaiaux0cn5q8r/6EpAbAig2b6FoIWsVxzeI" +
                                                              "XofodYYsLItnuvHwkJw6NHVS6n9ufdzBzK/CkaGavk4hY0QJCIvzAEfRsI/f" +
                                                              "83xo2Xh5uuzq4y11hf0i49Q2Qze4eua0jgp4+dDfW3feMbLnczSCSyL2R1n+" +
                                                              "oO/Mq1tXio/H+VXVRrKCK254U2c4jWoNAndyNZw47V5MG1kIF8JzsxPTm6Mo" +
                                                              "5qdUIYTxXIlgV20JZiXq4ViJNT7AMaseJjbUs/8H/DTfVyLNCxhyTbr4a8XT" +
                                                              "fBZbWgZPwtE8UcINbDALjZ5pa8SwmO+6Ac71UAnLH2HDJFhuOpZzqkEH1tjP" +
                                                              "VygqH9NkyffGQ5/fG3mKGgtubqxBaSn4bmR/6xDPnqyvXnDy3j/y24P3PaIO" +
                                                              "6kbWUpRg/QzMK3WDZGVuWJ1dTW3EOkpRy0w3SorKYOR6f8um/jZF84pRAyWM" +
                                                              "QcopihqilADW/DdI9xRFtT4dtPz2JEjyNHAHEjZ9RnexrYG3b6zdSNjtRj4W" +
                                                              "QCUHYXlM5n9WTLwtwZsKQxz+fc9FB8v+wgdF/eT2HQ9ev+05+6YkKnhignGZ" +
                                                              "BWXDvo95CLNsRm4ur8ptq27MeaFmhYuyoZtaUDeeKpC6/FbTGrk6mB3eDeLK" +
                                                              "qU3nXz9SeRkK5W4UwxTN3V3YmOV1C+Bvd7JYgQT85beaztp391z85K1YE+9/" +
                                                              "nZLaVmpHWjx2/moqq+tPx1FNL6qAIkLyvGu8e786QMQxI1RvKzOapXqfAuew" +
                                                              "NMbs2x/3jOPQ2d5bdommqL2w+Sj8sAC3hHFibGbcnfodwmRL14Or3LP32Yea" +
                                                              "eRpyLZ3s03Xnbll2hXte1/lhPcuG+/8HbSeN3MQXAAA=");
    public static final java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    public static final long jlc$SourceLastModified$jl5 =
      1445630120000L;
    public static final java.lang.String jlc$ClassType$jl5 =
      ("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" +
       "+/f97pt+87mvFxnD/wb+M39+KSIAAA==");
}
