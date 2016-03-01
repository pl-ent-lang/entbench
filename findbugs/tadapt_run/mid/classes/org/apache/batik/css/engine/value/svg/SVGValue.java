package org.apache.batik.css.engine.value.svg;
public interface SVGValue extends org.apache.batik.css.engine.value.Value {
    short getPaintType() throws org.w3c.dom.DOMException;
    java.lang.String getUri() throws org.w3c.dom.DOMException;
    short getColorType() throws org.w3c.dom.DOMException;
    java.lang.String getColorProfile() throws org.w3c.dom.DOMException;
    int getNumberOfColors() throws org.w3c.dom.DOMException;
    float getColor(int i) throws org.w3c.dom.DOMException;
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1445630120000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL0Ya2wUx3nujM8PDH4AhkAwGAytSbInStMkNSExxmDDGZ8w" +
                                          "IMW0HHO7c76Fvd1ld84+OyUhkZIgFKEokEcf8IuoSUVCFBU1ahpE1apJlKZR" +
                                          "aNTmoSat+iN9IYU/pRVt0++b2b3dWxucitCTdm539nu/Z09dINWuQ5bZ1NSo" +
                                          "wsdt5ippvE9Tx2Vaj0FddzvsZtTDfzh6/6Vf1z0QJ4lhMjtP3QGVumyjzgzN" +
                                          "HSaLddPl1FSZu5UxDTHSDnOZM0q5bpnDZJ7u9hdsQ1d1PmBpDAF2UidFminn" +
                                          "jp4tctbvEeBkSUpIkxTSJLujAF0p0qBa9niAsLACoSf0DmELAT+Xk6bUXjpK" +
                                          "k0WuG8mU7vKukkNusi1jfMSwuMJKXNlr3OoZYnPq1klmWPZi498vP5ZvEmaY" +
                                          "Q03T4kJFdxtzLWOUaSnSGOz2Gqzg7if3kaoUmRkC5qQj5TNNAtMkMPX1DaBA" +
                                          "+lnMLBZ6LKEO9yklbBUF4qS9kohNHVrwyKSFzEChlnu6C2TQdmlZW9/dERWf" +
                                          "uCl57KndTS9VkcZh0qibQyiOCkJwYDIMBmWFLHPcbk1j2jBpNsHhQ8zRqaFP" +
                                          "eN5ucfURk/IihIBvFtws2swRPANbgSdBN6eocsspq5cTQeU9VecMOgK6tga6" +
                                          "Sg034j4oWK+DYE6OQux5KDP26aYm4qgSo6xjxxYAANSaAuN5q8xqhklhg7TI" +
                                          "EDGoOZIcguAzRwC02oIQdESsXYEo2tqm6j46wjKcLIjCpeUrgKoThkAUTuZF" +
                                          "wQQl8NLCiJdC/rmwde2Re80+M05iILPGVAPlnwlIbRGkbSzHHAZ5IBEbVqWe" +
                                          "pK2vHooTAsDzIsAS5kffunj3zW3nXpcwi6aAGczuZSrPqCezs9+5safzjioU" +
                                          "o9a2XB2dX6G5yLK096arZEOlaS1TxJeK//Lctl/cc/AH7K9xUt9PEqplFAsQ" +
                                          "R82qVbB1gzmbmMkcypnWT+qYqfWI9/2kBu5Tusnk7mAu5zLeT2YYYithiWcw" +
                                          "UQ5IoInq4V43c5Z/b1OeF/clmxBSAxeJwXUXkb8luHBiJfNWgSWpSk3dtJJp" +
                                          "x0L90aGi5jAX7jV4a1vJLMT/vltWK7clXavoQEAmLWckSSEq8ky+TKqum2Tm" +
                                          "CEiYHKVGkSXdUYiynZt24oOCgWf//1mW0ApzxmIxcNCN0fJgQGb1WYbGnIx6" +
                                          "rLi+9+ILmTdl6GG6ePbjRAG+iuSrCL4K8FUkX0XwVYCv4vMlsZhgNxf5y1gA" +
                                          "T+6DmgBFuaFz6Jub9xxaVgVBaI/NQD+URJIu8h8AMSKnKAd3DtnH3/vVn9fE" +
                                          "STyoHI2hkj/EeFcoWpFmi4jL5kCO7Q5jAPe7p9NHn7jwyC4hBEAsn4phB649" +
                                          "EKVQeqGEPfT6/vc//ujku/Gy4FUcynUxC52Pk1qahVpHVc5JXbloScXmfga/" +
                                          "GFz/wQt1xA0ZgC09XhYsLaeBbYfMERP3Czj50vQuELZH8y2+Un0RtfHkg8dO" +
                                          "aIPPrJZVoKUyZ3uhJT3/m3//Unn6929MEQh13LJvMdgoM0IyJoBl+6QhY0CU" +
                                          "X79ZZ9Tbzl+q+vDxBQ3CfQ1ZmC+CJt9R0eTljOJYKtOgy1yp3fstb9WVG3xU" +
                                          "hNce/MvC7evye4QI4ZaNtKqh2yBmGhttmfqSiCmjJJ8bOPXGppXq43HRY7Be" +
                                          "T9GbKpG6wkYFpg6DZmqiWrgzq4QTWyRNo7bIqKuW0jOZVw90xMkMaDrQaDmF" +
                                          "QIAe1hZlXtEnuvzMQVa1YISc5RSoga/8RlnP8441FuyI+tEsAxmcXY9x2wpX" +
                                          "h1dJxT++bbVxnS/rjYBvE2s7Lh0iUuJ4uwKXlQLsyxA5K4PkhNJvQC1Ej3Ts" +
                                          "MMHZek6nWYNh2fhX44rVZ/52pEkGpQE7votunp5AsH/DenLwzd2X2gSZmIqj" +
                                          "R1BAAjDZz+YElLsdh46jHKUHzi/+9mv0OHRG6EauPsFEgyFe8UKh1gu17xRr" +
                                          "N+ZwZSYvwEweW6MqmlVQNgwO9JZUZiNTgbwBlzs4aRhhPA0+5cITDukIJxiO" +
                                          "2UNFKDhpRy9AsRv1hoDTrZf2/7xmYoPf4KdCkZBb3IG3f9z3SUakQi1mYzkA" +
                                          "Q3nW7YyEgqBJuAwLTOdVhupKiZIHWj7e970/PS8lis4wEWB26Njhz5Qjx6SP" +
                                          "5aC3fNKsFcaRw15EuvarcREYGz85feCVZw88Evc8pnA4KeUth0/yGQ41EStK" +
                                          "WROrj//z/offG4QE7Ce1RVPfX2T9WmVq17jFbMiswWwoEz0kNTYETmKrbLsk" +
                                          "fD21eUPHh4z62Lufztr56dmLwliV549wUxygtrRPMy5fR/Lzo225j7p5gPvq" +
                                          "ua3faDLOXQaKw0BRhYHDHXRgNihVtFAPurrmg5/+rHXPO1UkvpHUGxbVNlKc" +
                                          "9GFegwrCwJyGVrLvultWibFaWJpEipCykf2kwVxbMnUW9xZsLvJu4uX5P1z7" +
                                          "/RMfie4rKHylXJNmIpVmuDq9mtR5TTWpMnvDma1Nndn42CsAcrjACSEB2bvD" +
                                          "0f2UbxLK4aFDkYcO8WInLnvkjHDP5zMUbuyOaF+uyIqnvXKdtHem016U5IKs" +
                                          "XeBEqxzrmwN9zWvWV3h7IVxrPH3XXCd975tO34O4jEO++fpCo/bPI/lA5Ylr" +
                                          "VhkRyA1w3e6pfPt1UvnwdCo/istDnDSDyluL+K1gMCdUdwVOn1eE8W9L6H6Q" +
                                          "kyrdnFRe8XF7KbDUw19MMrTAtc6z1Lov0FIhqY8IgO9OZ67juDwJpwM/Qqaz" +
                                          "EkxnFp3WTk/973YqgRD++Qzr7YJJX4rk1w31hRONtfNP7PitmCzLXyAaYErI" +
                                          "FQ0j1N3CnS5hOyynC5UbZLexxd9znKz4XGdHiA9YhezPStRTnLRPiwoGE/9h" +
                                          "xNOcLLoKIhRneRPGeYmTuVPhgFiwhiHPQDWPQoIU4j8M9zIn9QEcMJU3YZBX" +
                                          "gDqA4O1PoPHHKk/BZWfPm87ZoYPz8orJQXwz9CeXovxqCEPiic1b7734tWfk" +
                                          "OVo16MQEUpkJ84o8DZQPP+1XpObTSvR1Xp79Yt0Kf5BqlgIHObYoVFx2QyTb" +
                                          "GHsLI3O121Eer98/ufbsW4cS52EG2UVilJM5u0Jf7OTnKRjOizAw7EpNNZnB" +
                                          "0VCM/F31f9zz9j8+iLWIgYHIWa7tahgZ9ejZD9M52/5OnNT1k2qYE1lpmNTr" +
                                          "7oZxcxtTR52KQS+RtYpm+fPibEwUiq1dWMYz6KzyLh7hOFk2eZidfMqFWWqM" +
                                          "OeuROpKZFTkuFm07/FZYdkgWEbQ0xFQmNWDb3ieGqi5hedsWVeAtUUj+C4lZ" +
                                          "g5oYGAAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1445630120000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL06e8zrVn2+33303tvSe1ugLYW2tNyylcDnOLGTWN0KTuIk" +
                                          "jp3EieM8zMat33b8jB+JY9YJkBhobIyNwkCCTpNAMFQemoZAQqCiPYCBJjGh" +
                                          "vaQBmibtAUj0jz00trFj53vkfve2d6hjkXxyYv/er3P8O3n6B9DZMIAKvmdv" +
                                          "dNuL9tUk2l/Y2H608dVwv8tgrBiEqtKwxTAcg3tX5Yc+c+lff/Qe4/IedE6A" +
                                          "Xiy6rheJkem54UgNPXulKgx06fguaatOGEGXmYW4EuE4Mm2YMcPoUQa6dQc1" +
                                          "gq4whyLAQAQYiADnIsDEMRRAepHqxk4jwxDdKFxCvwydYqBzvpyJF0EPXkvE" +
                                          "FwPROSDD5hoACuez3xOgVI6cBNArj3Tf6nydwu8rwE/+9psu//5p6JIAXTJd" +
                                          "LhNHBkJEgIkA3eaojqQGIaEoqiJAd7iqqnBqYIq2meZyC9Cdoam7YhQH6pGR" +
                                          "spuxrwY5z2PL3SZnugWxHHnBkXqaqdrK4a+zmi3qQNe7jnXdatjK7gMFL5pA" +
                                          "sEATZfUQ5YxlukoEPXAS40jHKzQAAKi3OGpkeEeszrgiuAHdufWdLbo6zEWB" +
                                          "6eoA9KwXAy4RdO9zEs1s7YuyJerq1Qi65yQcu30EoC7khshQIuilJ8FySsBL" +
                                          "957w0o5/ftD/uXe/2e24e7nMiirbmfznAdL9J5BGqqYGqiurW8TbXsO8X7zr" +
                                          "i+/cgyAA/NITwFuYz/3Ss2947f3PfHUL8/IbwAykhSpHV+WPSLd/8xWNR/DT" +
                                          "mRjnfS80M+dfo3ke/uzBk0cTH2TeXUcUs4f7hw+fGf3J/C2fUL+3B12koHOy" +
                                          "Z8cOiKM7ZM/xTVsN2qqrBmKkKhR0QXWVRv6cgm4Bc8Z01e3dgaaFakRBZ+z8" +
                                          "1jkv/w1MpAESmYluAXPT1bzDuS9GRj5PfAiCbgEXdApcr4e2nweyIYI82PAc" +
                                          "FRZl0TVdD2YDL9M/c6iriHCkhmCugKe+B0sg/q3XIftVOPTiAAQk7AU6LIKo" +
                                          "MNTtQ1gOQ1h1dSAhvBLtWIXDFYiySXuS/djPAs///2eZZFa4vD51CjjoFSfL" +
                                          "gw0yq+PZihpclZ+M6+Szn7r69b2jdDmwXwTtA777W777Od99wHd/y3c/57sP" +
                                          "+O4f8oVOncrZvSTjv40F4EkL1ARQLW97hPvF7uPvfOg0CEJ/fSbzQ5In6T35" +
                                          "j9MA75HnruCtrHxQecmUQUTf8x8DW3rb3/17LvNuEc4I7t0ga07gC/DTH7q3" +
                                          "8dj3cvwLoF5FIlAJlIL7T+buNemWJfFJW4IyfEy39AnnX/YeOvfHe9AtAnRZ" +
                                          "PqjxuXE4FdTZi2Z4WPjBOnDN82tr1DYhHz2oBRH0ipNy7bB99LCgZsqf3fUh" +
                                          "mGfQ2fxiHg+35zB3/Bh8ToHrv7Mr80R2Y5sZdzYO0vOVR/np+8mpUxF0trRf" +
                                          "3S9m+A9mPj5p4EyAn+f8D//Vn/1TeQ/aOy7yl3aWTWCER3cKS0bsUl5C7jgO" +
                                          "mXGgZsb62w+w733fD97xxjxeAMSrbsTwSjZmEoNVEqw2b//q8q+/8+2PfGvv" +
                                          "KMZOR2BljSXblMEkzBc9oIlmuqKdG+ShCLp7YctXDrWegEUQCHZlYVdzU70U" +
                                          "LPu5aJlX9rcrR55YQKIrzxGuO6v9Vfk93/rhiyY//NKz10XqtYbpif6jWw/l" +
                                          "UiWA/N0ns6gjhgaAQ5/p/8Jl+5kfAYoCoCiD+hAOApDKyTVmPIA+e8vffPkP" +
                                          "73r8m6ehvRZ00fZEpSVmCzMor5EB1nIDVIHEf/0btuVxfR4Ml/PchHL9X74V" +
                                          "J0/r248NwXhgAX3X37/nG7/xqu8AObrQ2bwaAAl2rNWPsz3Frzz9vvtuffK7" +
                                          "78p9Aoox+37y8hsyqrWcwcP5+LPZUNh6LJu+Nhtelw37h266N3MTl9dDRgyj" +
                                          "nqeYYE+h5J563tLBBqYDom11sGDCT9z5HetD//jJ7WJ4sk6cAFbf+eSv/nj/" +
                                          "3U/u7WxBXnXdLmAXZ7sNyYV+0ZErH3w+LjlG6x8+/cQXPv7EO7ZS3XntgkqC" +
                                          "/eIn/+K/vrH/ge9+7QZV+oztHQZlNpYO2GZf2M0dG932/Q4aUsThhynOxdKa" +
                                          "T8puvOjV2GYHJQyLWLeJTcRJFNg49qw+RyaJ02y2hdqa6k2Lnc6gKlcrrZWC" +
                                          "2EoNLQw2vGEJlN6iSc8iZa1GxR7HTxqtOo+Ihk8iot+1aWEk9seOx4lRwezj" +
                                          "1JyH/dEkKhYKUkkqK9Mkls2oMVYcrIy7MSwUcYXqT+MhJglIn/PWoRJhpu+v" +
                                          "SHyclCbiothSlHQVCtG4qaVGBa5MNCQtDruobfQWEVsetiexs1mketrvcCKj" +
                                          "KKyNtDghxvikOe5wTXcg9IpLTPLdptCtxrihhENEQVin7jeJVok3lZZjuu7C" +
                                          "RyM5klakWrc43qesZMx1mXhBtIp+cVkXcdckQoZoeJxWbDokQ4wLM6si8bOF" +
                                          "T1vFadyuOXx1RceW1Y9DE1loPW4d97r0rG8H5YEnzF12iVi2M2UFE8VrKxYT" +
                                          "VqQjzofF8hi1ui0liVJmOuBFzuXag7TUXqZ61dTKlujxzshqYMvhAhv3+wTw" +
                                          "U4+dIU2xThRst8fUhQpDkwN8Y9lSnW+hSw63PKPfmQTrDc21UrJh2G5caZTG" +
                                          "Q8WxhSkOK+RoqsUNG6vSrjLm8IklC0ZxaUrDjTloWN31vEn16s60xXRYWbKQ" +
                                          "RWlR9/thxxjW0tFSbLFqH4tljR9ZMGUaVH3VitZhKVyPWKIv6ZxS71dUD2wo" +
                                          "/CUmj4cqj09UuTfQ6UqkixVOL5bRBepN6UJzTlYGwzjB6CZbqohzB13qnFdJ" +
                                          "FkkyJ4g+JxJxH1vWkqVh2YZeHVNks+0NBErWYyIdrRvFkkcNFZILZ3PSK0VL" +
                                          "p7JAK+sFLTPUouGrfKDT3hjEOD+OhdZ6OLRrfaZhdpUGHDhrRS2N1Fqx0Cti" +
                                          "JsWw7QnB2u7apqRR25K4tNMhBIyqk9JkOVV9urTqeN6YCJspFRIcZmla7C7K" +
                                          "6bTsznx5bVZEoi2nscAF7LKhpiFewEJRSxemx3u4WJrVS8qs0sY2DF3EK2Ig" +
                                          "kANb5JBx0lVpGGbkyIZlGSY6VRpP+AhnyaVvt4hwOKqVlhOpjuipIzk9S974" +
                                          "7nRcWM6X2pTC4ZJVj7FxHLpW1SFiLGXUcWk+n5uRYU7lNT/EKI9yl+gELcuY" +
                                          "AEvIQG3Bsu0kdY5I1O56xs8sqWbHnbrZ1fpTnZv6nFVWom7XT4oMXhTbJrYg" +
                                          "ZtXFBBWRVZfpjeGVHU3pqmzPxJU3JAmHmcoWx5HLmrUpjOll7JTGToM05x16" +
                                          "0ra4mcLPzY0rRCXUGzT0qQbDiDMtEn6aOFQi9xv9otbVh20Jmc6ltksllYAx" +
                                          "C3iBYpyxYlfa7YrKSosR0S6YMRc0GJSutXhrVpytJ/PGCl317FAw9H6iYRtE" +
                                          "B+lYaTp6vRWLrbTSjSU8ScSJPqmLFNwfNgv8qEvFNaNG9DjapQml3IzcThle" +
                                          "TVxcI7nxxutQJcNawKTakr2pD0oCumAwqzGoDoEVWLXq4/2OW12sNw3UqJNE" +
                                          "6KK+Ua+gOElPhuqyTbLauAKvZBiOF1YMtzdoi5c3Lp80sBJrIUvRmPidiYx1" +
                                          "Z5LtcfLM0XQRbrdSeD2MkIQoCnqjiM+MeciIal2aaz1yxJYb6QIrroYxyQid" +
                                          "2qZU4N3iKNI6ll5TBiLFskFXmHg0vxHKsdEdl2GnDMO861bwEt4jhwZSZrqr" +
                                          "nqJ7vSK16Xp1u1AZGvNig59VcUHAx1JqF5aFVTOpD8sNbYgITqPQ6Eb4qKiO" +
                                          "7cWgO6ejgb5BNn5ZCyMJn07a5YQ3+rIK91aNqrraqOiQQgWxH9FLo7SpO20j" +
                                          "ihxtyZkNZ9Ht1qQBO2v7/myJljujebWujvG2RPvtytqat3y90hScpTkN9HSJ" +
                                          "DsfTzajvVSVqScfT4mIgTNZ4MQGlTmwGQ7HptIYUoSKGYM8isGqu0t5wIiJz" +
                                          "ipOxEecBU9ZGtsvWUBRpxRuqEJEhkTjybI4npbU/MxClm4zBAiRNEpeDg8W8" +
                                          "viJLYZUxiiYfd9F4Tc/sIRNuEgKjUdYy+t3VsIGQi/I47PU6gmpV3Om8b5Q0" +
                                          "Y4aiwUSAsZJPWm1/SFZXXhS7PkaEHbipusw6VUqzks4JDrVcjJA6QSyaQlqY" +
                                          "kzYTKgZaWXRovpOacAF3VsVBZ9SukGLMhi1S37TUGk8biB4j1WQU9AvCWuDm" +
                                          "qzW5VqeV3tKxJ8O+vh7gXYEXzP5Yl9Z1Ow1RcWQYLFEsYDI1bsYW1U3MQYnv" +
                                          "t+im4Y82OBGOVojhNceBoJXgauLMPVZDaaVhCXWpTLXLGp6WOV60hibizFOL" +
                                          "GJbdaXW+IfVlvRsTa2Y8UCZG7NOmQHWmi6qKV4swy9VsM0TX5LReqvQXRooN" +
                                          "F0mFYzGxUdb6dNiSxdEawch4JQbyiJy30xqmqY2JsK7VyJVc810CpVU+Morw" +
                                          "pj1EEZKL6OloECxgOIU9TWujwLANFRlNWG1WGuNTZ7JEqouW1DPD9XTtkWnR" +
                                          "6o/n5NihA4kJLa1ZQlSe7RhoWikxsZZGAVZRHGZtmxMMxcGmZ6NHwYjtbTBt" +
                                          "BDOpVyphi6qP6exqGYtlTWwyg9lQpNfF+siYd5qd2Ujvm8YkahFsHASOjsGF" +
                                          "oDNjBwhvrfwO306kSd+mZbzdUvV10Fh3N+1JwKxiUB9NqSVOuz5p+o2NpZWs" +
                                          "9SSRei4/xRMhZFbdGI1nGIukVXjUA9tcNKA7G3vW7TuUP3Hi5hJ3ohE2Hk/9" +
                                          "nrtqOiLSdxUXLTVCQg4WRIMj6yVp1SxqJV5KGBoVW01rLg9qU8pl3JW16DRZ" +
                                          "LO3xUrwZiK0CyISlu5rRStRRnSJS4TGKDmdqnVwmKVgB+3g6XU0nZaNKTZKA" +
                                          "7ZRns4aCV7FoUEYH6IIcFAqa3/BgiaVgm8DmdjAxrNGGQNZlteJrbITwK3et" +
                                          "AAgzjJpuk2tu7Jgp0Ijeayi8sp4MXEQla1OcqXQqQ2sTKG4LLLmzVpWWmvwa" +
                                          "wXu9YExEciVFGG9VbFHGcl6j9AE+ECrVRdxcd/11Dx4uxZS0Erfll6djC8ar" +
                                          "5flSHzULhWEaVOfd7gwNLCARYowG/Ujrs1XWjJxGysw2hDgnA6o1LC6Qfrnh" +
                                          "cpgx2GzcBsZLAqMmiYKnLp2is7bSMQl8bqgpy0WjscuMWHPttUkYN5L+QGYY" +
                                          "j6aMkauO2LY6d8bxhDX0lrk2zA47bE7ZoUfx6KLWw1PKxYek3Ovy5blQn+nN" +
                                          "JYEOENZjOx3aguvCVGOdWlXw5mxa84LucLZO8YY681bJskGypikjUrVaRqOp" +
                                          "Zg0mHlLpDUnet7o11Ks1hSHLFpCZP5DG3GoEJlV8HhVpDasvbZ3qDKS5N2kl" +
                                          "peFmLLU7IUOVB0gJIdUAr8GxJoVTVOawEtku8RPT7vawuNjVqoOxS48WAzMl" +
                                          "1lXS7/cFt16cNHpwq4yAmpDii1rBZKaUPu9QU7EaiYYu4OpCaOI9rARjA7c/" +
                                          "RqzSck4itu/0x0HVExI5icYjrEQPucIomvtOQWNNiVzz5hJRpr15WqHTDWNU" +
                                          "jUHLKqmCqWi9ZWs6XfYGajwa+LTQGltxyylW4ZYwVyx9SkrDYtIaOv1pUyqb" +
                                          "antpYoaqhNOJSkQ8vyg0UFvQMW/eBq832WsP9ZO9ed6RNwiO+szghTN7UPwJ" +
                                          "3riS52MYQedFKYwC8FoeQReOGt9b7jsdslOHDYmfuXlXLu8oZW+e9z1Xyzl/" +
                                          "6/zI2558Shl8FMneOjPiTSBA5Pmvs9WVau+wPgcovea537B7ecf9uAv2lbf9" +
                                          "873jx4zH8zbQdd05BrqYYbLZwcbRAcYDJ+Q8SfL3ek9/rf1q+bf2oNNHPbHr" +
                                          "zgKuRXr02k7YxUCN4sAdH/XDAuih617LPVlV4kA95vuaV4qfvfrFJ67sQWd2" +
                                          "G4UZhftOtN1u1bzAEe2MweHhw8XICLz18Z3dHhww68UsOu4C15WD7nT+nT19" +
                                          "sZ+NL0mOY+y64Nk7itbRQagE0KuP2z8Nz7ZVObf6Fd518m6JKNlq1or9z0sP" +
                                          "I5/9/rsvb3sJYImODt3w2psTOL7/sjr0lq+/6d/uz8mckrPjnOOG1jHY9ozg" +
                                          "xceUiSAQN5kcyVv//L4PfkX88GnoFAWdCc1UzZv20EF3OBPKyNWW81HPkuDa" +
                                          "VLgnS4V1Wd5XPGe/OeiRiaz6GdMceZENVyPoNl2NWOC36MgTr9/J2EYEnQ0N" +
                                          "L4iOc/nxm3VP9B0x8xtvPHLqrdnNbPLIgVMfeUFOvVb9XdNsbmya7KeVA7w5" +
                                          "G0BNOQfU5wMzL1rHOsYvQMejwN0/0HH/p6Tj22+m4zuy4S1bF4OQ84LD/HaP" +
                                          "NX3rC/XmveAqH2ha/ilp+ps30/S92fBrEXTpUFNQrQ4PwXbc+usvQNkMFHoZ" +
                                          "uGoHytZ+Ssp++GbK/k42fAAsvUDZbRt5oOVKhzdK39Omu5O8H3yhgX0nuB47" +
                                          "sMBj/4cW2NHyd3OAp29mhk9lw8fABuHQ5zcsXprtiTv6f/wn0T8BxA+P77Iy" +
                                          "fc91fyTYHn7Ln3rq0vm7n+L/Ml8Ijw6oLzDQeS227d0Tp535OT9QNTNX5cJ2" +
                                          "7fPzr89H0MP/q6NF4Fsw5lJ/bov6hQh68Kao0cF5xC7ilyLo5c+DCMrkdrKL" +
                                          "8+UIesmNcIBYYNyF/KMIunwSEkiRf+/CfSWCLh7DAabbyS7InwLqACSbfj07" +
                                          "etvZhx3Ea+7mO2/m5iOU3bOzbO+W/6XkcJ8Vb/9UclX+9FPd/pufrXx0e3Yn" +
                                          "22KaZlTOM9At243N0V7tweekdkjrXOeRH93+mQsPH+4rb98KfJw7O7I9cOMt" +
                                          "B+n4Ub5JSD9/9x/83Mee+nZ+fvQ/jWk3SusjAAA=");
}