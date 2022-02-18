package com.company;
import java.io.*;
public class bookproblem {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        float u;
        System.out.println("enter unit consumed");
        u= Integer.parseInt(br.readLine());
        if (u<=100){
            System.out.println("your bill is "+ u*80/100);}
        else if (u>100 && u<=200){
            System.out.println("your bill is "+ u*1);}
        else {
            System.out.println("your bill is "+ u*1.2);}
        }
    }

