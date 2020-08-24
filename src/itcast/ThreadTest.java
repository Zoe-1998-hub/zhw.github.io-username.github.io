package itcast;

public class ThreadTest {
    public static void main(String[] args){
        MyThread d1 = new MyThread("黑马程序员");
        MyThread d2 = new MyThread("中关村在线");
        d1.start();
        d2.start();
        for (int x=0;x<5;x++){
            System.out.println("x = "+x+"...over..."+Thread.currentThread().getName());
        }
    }
}
