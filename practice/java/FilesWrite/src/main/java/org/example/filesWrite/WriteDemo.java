package org.example.filesWrite;

import java.io.*;
import java.util.Scanner;

public class WriteDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //FileOutputStream fos;
        File file=new File("Index.txt");
        try(FileOutputStream fos=new FileOutputStream("Index.txt");
        BufferedOutputStream bis=new BufferedOutputStream(fos);)
        {
          String msg="Hi I am ramya";
          byte arr[]=msg.getBytes();
          bis.write(arr);
          System.out.println("data write successfully");
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e1){
            System.out.println(e1);
        }

    }
}
