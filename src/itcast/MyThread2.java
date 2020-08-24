package itcast;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        show();
    }
    public void show(){
        for (int x = 0;x<5;x++){
            System.out.println(Thread.currentThread().getName()+"..."+x);
        }
    }

}
