package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class EvenSum1 {


        public static void main(String args[])
        {
            int sum=0;
            List<Integer> list=new ArrayList();

            for(int i=0;i<50;i++) {
                list.add((int) (Math.random() * 100));
            }
         System.out.println(list);
           Stream s=list.stream();
            System.out.println(s);
            System.out.println(s);
                /*if(list.get(i)%2==0)
                {
                    int doubleValue=list.get(i)*2;

                    sum+=doubleValue;

                }
            }
            System.out.println(list);
            System.out.println(sum);*/
        }}

