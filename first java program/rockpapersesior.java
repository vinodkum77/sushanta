package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class rockpapersesior{
    public static void main(String args[])throws IOException {
        Random random = new Random();
        int min = 1, max = 2; int c;
        int a = (int) (Math.random() * (max - min + 1) + min);
        int b = (int) (Math.random() * (max - min + 1) + min);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your choise");
        c= Integer.parseInt(br.readLine());
        if (a == 1) {
            System.out.println("stone");
        } else if (b == 2) {
            System.out.println("paper");
        }

    }}
