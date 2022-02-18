package com.company;
import java.io.*;
public class productofdigitsinnumber {
    public static void main(String[] args)throws IOException {
        int p=1,i,j,num; String str;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        num= Integer.parseInt(br.readLine());
        str = Integer.toString(num);
        i=str.length();
        for (j=1;j<=i;j++){
           p*=num%10;
           num=num/10;
        }
        System.out.println("product of the number is "+p);
    }
}
