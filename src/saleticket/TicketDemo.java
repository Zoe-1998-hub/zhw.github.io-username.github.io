package saleticket;
import java.util.*;
class Ticket implements Runnable{
    private int tick = 50;
    Object obj = new Object();

    public void run(){
        while(true){
            synchronized(obj){
                if(tick>0){
                    //只能try，因为run是复写了Runnable接口的run,接口的run没有抛
                    //try{Thread.sleep(10);}catch(Exception e){}
                    System.out.println(Thread.currentThread().getName()+"....sale : "+ tick--);
                }
            }
        }
    }
}

public class TicketDemo {
    public static void main(String[] args){
        //只建立了一个Ticket对象，内存中只有一个tick成员变量，所以是共享数据
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
