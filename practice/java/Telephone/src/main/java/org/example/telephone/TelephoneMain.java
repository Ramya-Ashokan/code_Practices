package org.example.telephone;

import java.util.ArrayList;
import java.util.*;
public class TelephoneMain {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Telephone t1=new Telephone("Ram","7865456872");
        Telephone t2=new Telephone("Ramya","5467677829");
        Telephone t3=new Telephone("Raji","984174851");

        ArrayList<Telephone> tele=new ArrayList<>();
        tele.add(t1);
        tele.add(t2);
        tele.add(t3);
        System.out.println("Enter the name to search");
        String s_name=sc.next();
        Iterator<Telephone> i=tele.iterator();
        while(i.hasNext())
        {
           Telephone iname=i.next();
           if(iname.getName().equals(s_name))
           {
               System.out.println(iname);
           }

        }

    }
}
