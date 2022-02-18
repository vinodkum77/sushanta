package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class electricity {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int unit;
        System.out.println("input your unit");
        unit=Integer.parseInt(br.readLine());
        if (unit<=10){
            System.out.println("40$");
    }else if (unit>=11 && unit<=20){
            System.out.println(unit +"$");
        }
        else if (unit>=21 && unit<=40){
            System.out.println(2*unit +"$");}
        else{
            System.out.println(5*unit);}
}}
