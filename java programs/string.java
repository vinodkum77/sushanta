package com.company;
import java.io.*;


public class string {
    public static void main(String[] args) throws IOException {
        String str;
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        str = br.readLine();
        // System.out.println(str.substring(2,7));
        //System.out.println(str.substring(2));
        //System.out.println(str.toLowerCase());
        //System.out.println(str.toUpperCase());
        // System.out.println(str.replace('s','a'));
        //System.out.println(str.startsWith("su"));
        //System.out.println(str.endsWith("skj"));
        //System.out.println(str.equalsIgnoreCase("sushant"));
        j = str.length();
        for (i = 0; i <= j - 1; i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                System.out.println("contain vowels");
            else
                System.out.println("doesnot cointain vowels");
        }
    }
}