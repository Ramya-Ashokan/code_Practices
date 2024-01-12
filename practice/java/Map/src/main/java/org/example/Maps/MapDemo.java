package org.example.Maps;
import java.util.*;
public class MapDemo {
    public static void main(String args[])
    {
        Map<String,String> phoneBook=new Hashtable<>();
        phoneBook.put("DDD","789057678670");
        phoneBook.put("AAA","234567890");
        phoneBook.put("BBB","9840174851");

        //phoneBook.putIfAbsent("CCC","78900000000");
        phoneBook.put("CCC","");
        phoneBook.put("CCC","7890543621");
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());
        phoneBook.remove("AAA");
        System.out.println(phoneBook.remove("BBB"));
        System.out.println(phoneBook.get("AAA"));


    }


}
