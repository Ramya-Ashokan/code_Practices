package org.example.thread;

public class MainClass {
    //int id;
    //String name;
    static  int i=5;
    public static void main(String args[])
    {

        ThreadDemo d=new ThreadDemo();
        ThreadTest t=new ThreadTest();
        d.start();
        t.start();
        t.setPriority(10);
        //t.setDaemon(true);
        //d.run();
        //t.run();
        try
        {
            d.join();
            t.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(d.getId());
        System.out.println(d.getName());
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(i);
        System.out.println(   t.getPriority());
    }
}
