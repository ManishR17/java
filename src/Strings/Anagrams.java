package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a,String b)
    {
        a=a.toLowerCase();
        b=b.toLowerCase();
         char[] chrr=a.toCharArray();
         char[] chrr1=b.toCharArray();
        Arrays.sort(chrr);
        Arrays.sort(chrr1);
        return Arrays.equals(chrr,chrr1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        boolean A=isAnagram(a,b);
        System.out.println((A)?"anagram":"not anagram");
    }
}
