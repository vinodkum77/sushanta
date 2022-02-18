package com.company;
import java.io.*;
public class convertingintegertostring {
    public static void main(String[] args)throws IOException {
        int num,i; String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number");
        num= Integer.parseInt(br.readLine());
        str= Integer.toString(num);
        i= str.length();
        System.out.println("total digits are "+i);
    }
}
