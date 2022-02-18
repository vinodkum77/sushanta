package com.company;
import java.io.*;
public class TAKINGINPUTFROMUSER {
    public static void main(String[] args)throws IOException {
        int a,b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number");
        a = Integer.parseInt(br.readLine());
        System.out.println("enter the second number");
        b = Integer.parseInt(br.readLine());
        System.out.println("sum of two numbers are "+ (a+b));

    }
}
