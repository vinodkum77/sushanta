package com.company;
import java.io.*;
import java.math.*;
public class armstron {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int num,j; String str; int sum=0;
        System.out.println("enter your number");
        num = Integer.parseInt(br.readLine());
        int temp=num;
        str= Integer.toString(num);
        int i = str.length();
        for (j=1; j<=i; j++){
            int l= num%10;
            double p= Math.pow(l,i);
            sum+= p;
            num=num/10;
        }
        if (sum==temp)
            System.out.println("armstong number");
        else System.out.println("not a armstong number");

    }
}
