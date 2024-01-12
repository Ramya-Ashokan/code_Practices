package org.example.thread;

public class ThreadTest extends Thread{


       @Override
        public synchronized void run()
        {
            for(int i=0;i<5;i++)

            {
            System.out.println("world");
        }

            try{
                sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
    }
}
