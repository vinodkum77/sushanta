package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapyear {
    public static void main(String args[])throws IOException{
        int year;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the year");
        year=Integer.parseInt(br.readLine());
        if(year%100==0 && year%400==0 || year%4==0) {
            System.out.println("leap year");
        }
            else{
                System.out.println("not a leap year");
            }
        }
    }
