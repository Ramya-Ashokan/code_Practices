package org.example.files;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoFiles {
    public static void main(String[] args)
    {
        System.out.println();
        InputStreamReader isr=new InputStreamReader(System.in);//console input as byte
        BufferedReader br=new BufferedReader(isr);
        try
        {
            byte n=(byte)isr.read();
            System.out.println((char)n);
            String arr=br.readLine();
            System.out.println(arr);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
