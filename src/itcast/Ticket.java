package itcast;

public class Ticket implements Runnable{
    private  int num = 10;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (num > 0){
                    System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
                }
            }
        }
    }
}
