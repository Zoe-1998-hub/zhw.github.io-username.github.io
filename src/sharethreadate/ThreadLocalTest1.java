package sharethreadate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ThreadLocalTest1 {

    private static ThreadLocal<Integer> x = new ThreadLocal<Integer>();
    //创建一个存储封装类对象的ThreadLocal  
    private static ThreadLocal<MyThreadScopeData> myThreadScopeData = new  ThreadLocal<MyThreadScopeData>();
    private static int data = 0;

    public static void main(String[] args){

        //产生两个线程  
        for(int i=0;i<2;i++){
            new Thread(new Runnable(){

                @Override
                public void run() {
                    //共享单一的数据
                    int data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName()+"has put data : "+data);
                    x.set(data);

                    //共享多个数据
                    //将数据封装在myData对象中，并将myData作为myThreadScopeData的键
                    MyThreadScopeData myData = new MyThreadScopeData();
                    myData.setName("name "+data);
                    myData.setAge(data);
                    myThreadScopeData.set(myData);

                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }
//模拟获取数据
    static class A{
        public void get(){
            int data = x.get();
            System.out.println("A from "+Thread.currentThread().getName()+" get data :"+data);

            //从myData中取出数据，并获取当前线程名，数据  
            MyThreadScopeData myData = myThreadScopeData.get();
            System.out.println("A from "+Thread.currentThread().getName()+" getMyData: " +
                    myData.getName() + "," +myData.getAge());
        }
    }

    static class B{
        public void get(){
            int data = x.get();
            System.out.println("B from "+Thread.currentThread().getName()+" get data :"+data);
            MyThreadScopeData myData = myThreadScopeData.get();
            System.out.println("B from "+Thread.currentThread().getName()+" getMyData: " +
                    myData.getName() + "," +myData.getAge());
        }
    }
}
