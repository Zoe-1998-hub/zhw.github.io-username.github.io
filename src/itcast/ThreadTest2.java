package itcast;

public class ThreadTest2 {
    public static void main(String[] args){
        MyThread2 d = new MyThread2();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }
}
