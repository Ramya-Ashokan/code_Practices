package org.example.thread;

public class Demo extends HitCount implements Runnable{
    HitCount hc=new HitCount();
    public static void main(String args[])
    {

        Demo d=new Demo();
        Thread t1=new Thread(d);
        Thread t2=new Thread(d);
    }
    @Override
    public  void run()
    {

        for(int i=0;i<1000;i++)
        {
            hc.getCount();
        }

    }
    public HitCount getObject()
    {
        return hc;
    }

}
