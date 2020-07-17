package Strings;

import java.util.Scanner;

public class SplitNewWords {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();

            System.out.println(s.split("[A-Z]").length);
        }
    }


