package org.example.thread;

public class ThreadDemo extends Thread{




    @Override
    public  void run()
        {
            for(int i=0;i<5;i++)

            {
            System.out.println("java");
        }
            try{
                sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

    }
}
