package com.company;

public class fibonaci {
    public static void main(String[] args) {
        int ft=0,st=1;
        System.out.println(ft+"\n"+st);
        int nt,i;
        for (i = 0; i <= 10; i++) {
            int sum = ft+st;
            System.out.println(sum);
            ft=st;
            st=sum;

        }
    }
}