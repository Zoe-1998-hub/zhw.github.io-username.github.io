package itcast;

public class Example08 {
    public static void main(String[] args){
        Worker w1 = new Worker("work-1");
        Worker w2 = new Worker("work-2");
        w1.start();
        System.out.println("启动线程1");
        try{
            w1.join();
            System.out.println("启动线程2");
            w2.start();
            w2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程继续执行");
    }
}
