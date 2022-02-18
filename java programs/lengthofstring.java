package com.company;
import java.io.*;
public class lengthofstring {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str; int len;
        System.out.println("enter your name");
        str= br.readLine();
        len = str.length();
        System.out.println("length is "+len);
    }
}
