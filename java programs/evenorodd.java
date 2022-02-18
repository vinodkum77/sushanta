package com.company;
import java.io.*;
public class evenorodd {
    public static void main(String[] args)throws IOException {
int a;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number");
        a= Integer.parseInt(br.readLine());
                if(a%2 == 0)
                    System.out.println("even number");
                else
                    System.out.println("odd number");
    }
}
