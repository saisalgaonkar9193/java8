package com.sai.programs;

public class PallindromString {

    public static void main(String[] args) {

        String s = "AsdfQdsA";

        System.out.println(isPalindromeBruteForceInward(s));

        System.out.println(isPalindromeBruteForceOutward(s));


    }

    private static boolean isPalindromeBruteForceInward(String s) {
        int begin = 0;
        int end = s.length() - 1;

        int i = 0;
        while (begin < end) {
            System.out.println(++i);
            if (s.charAt(begin) != s.charAt(end)) return false;
            begin++;
            end--;
        }
        return true;
    }

    private static boolean isPalindromeBruteForceOutward(String s) {
        int left =( s.length() / 2 + s.length() % 2 )- 1;
        int right = s.length() % 2 == 0 ? left + 1 : left;
        int i = 0;
        while (left != -1) {
            System.out.println(++i);
            if (s.charAt(left) != s.charAt(right)) return false;
            left--;
            right++;
        }
        return true;
    }


}
