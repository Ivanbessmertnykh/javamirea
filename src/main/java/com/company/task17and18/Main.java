package task17_18;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        ///task 1
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());
        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());
        str  = "123abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        ///task 2
        Pattern p2 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        str = "aE:dC:cA:56:76:54";
        System.out.println(str + ": " + p2.matcher(str).matches());
        str  = "aE:dC:cA:56:76:aB";
        System.out.println(str + ": " + p2.matcher(str).matches());
        str  = "aE:dC:56:56:76:54";
        System.out.println(str + ": " + p2.matcher(str).matches());

        ///task 3
        Pattern p3 = Pattern.compile("([0-9.]+) (USD|RUR|EU)");
        str = "0.0000001 EU";
        System.out.println(str + ": " + p3.matcher(str).find());
        str  = "22.6854 RUR";
        System.out.println(str + ": " + p3.matcher(str).find());
        str  = "0.2 UDD, 25 RUR";
        System.out.println(str + ": " + p3.matcher(str).find());
    }
}
