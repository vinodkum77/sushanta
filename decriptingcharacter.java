
package com.company;
import java.io.*;
public class decriptingcharacter {
    public static void main(String[] args)throws IOException {
        char ch,s;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any alphabet");
        ch=(char)(br.read());
        s=(char)(ch+1);
        System.out.println(s);
    }
}