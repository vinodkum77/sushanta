package com.company;
import java.io.*;
public class TakingInputandusingconditions {
    public static void main(String[] args)throws IOException {
        float a,b;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 1st. number");
        a=Float.parseFloat(br.readLine());
        System.out.println("enter 2nd. number");
        b=Float.parseFloat(br.readLine());
        if (a>b)
            System.out.println("1st. number is bigger and there diffrence is " +(a-b));
        else
            System.out.println("2nd. number is greater and there diffrence is " + (b-a));
    }
}
