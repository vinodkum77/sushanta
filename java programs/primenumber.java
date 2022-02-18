package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primenumber {
    public static void main(String[] args)throws IOException {
        int i,num,c=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number to check weather prime or not");
        num=Integer.parseInt(br.readLine());
       for(i=2;i<num;i++){
if(num%i==0){
    c=c+1;}}
if(c!=0){
    System.out.println("prime");}
else{
    System.out.println("not prime");}
}}
