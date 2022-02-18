package com.company;
import java.io.*;
public class sumofdigitsofintegers {
    public static void main(String[] args)throws IOException {
        int num,i,j; String str;
        int sum=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        num =Integer.parseInt(br.readLine());
        str = Integer.toString(num);
        i = str.length();
        for (j=0; j<=i; j++){
          sum+=num%10;
          num = num/10;
        }
        System.out.println("sum of digits are "+sum);
    }
}
