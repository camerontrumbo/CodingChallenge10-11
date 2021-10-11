package CodingChallengeNumber2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comparing 'dabc' and 'abcd' -> " + isRotation("dabc", "abcd"));
        System.out.println("Comparing 'dabc' and 'dbac' -> " + isRotation("dabc", "dbac"));
    }

    public static Boolean isRotation(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        for (int i = 0; i < sb1.length(); i++) {
            sb2.append(sb2.charAt(0));
            sb2 = new StringBuilder(sb2.substring(1, sb2.length()));

            if (sb1.toString().equals(sb2.toString()))
                return true;
        }

        return false;
    }
}
