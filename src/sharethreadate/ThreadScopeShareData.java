package sharethreadate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class ThreadScopeShareData {
    private static int data = 0;//定义一个成员变量
    private static Map<Thread,Integer> threadData = new HashMap<Thread, Integer>();//使用Map实现线程范围内的数据共享
    public static void main(String[] args){//启动两个线程
        for(int i = 0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int data = new Random().nextInt();//准备一个数据
                    System.out.println(Thread.currentThread().getName()+"has put data:"+data);
                    //将当前线程作为键，可以保证map对象的唯一，即保证线程内的数据唯一
                    threadData.put(Thread.currentThread(),data);
                        new A().get();
                        new B().get();
                    }
            }).start();
        }
    }
    //定义类模拟获取数据
    static class A{
        public void get(){
            int data = threadData.get(Thread.currentThread());
            System.out.println("A from"+Thread.currentThread().getName()+"getData:"+data);
        }
    }
    static class B{
        public void get(){
            int data = threadData.get(Thread.currentThread());
            System.out.println("B from"+Thread.currentThread().getName()+"getData:"+data);
        }
    }

}
