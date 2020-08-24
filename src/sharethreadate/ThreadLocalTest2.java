package sharethreadate;

import java.util.Random;

public class ThreadLocalTest2 {
    //创建一个ThreadLocal对象
    public static ThreadLocal<Integer> X = new ThreadLocal<Integer>();
    public static void main(String[] args){
        //产生两个线程
        for (int i =0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //准备一个数据
                    int data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName()+"has put data:"+data);
                    X.set(data);//往当前线程存入一条数据

                    //获取与当前线程绑定的实例并设置值
                    MyThreadScopeData1.getThreadInstance().setAge(data);
                    MyThreadScopeData1.getThreadInstance().setName("name:"+data);
                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }
    static class A{
        public void get(){
            int data = X.get();
            System.out.println("A from"+Thread.currentThread().getName()+" get data:"+data);

            //获取与当前线程绑定的实例
            MyThreadScopeData1 myData = MyThreadScopeData1.getThreadInstance();
            System.out.println("A from "+Thread.currentThread().getName()+" getMyData:"+myData.getName()+","+myData.getAge());
        }
    }

    static class B{
        public void get(){
            int data = X.get();
            System.out.println("B from"+Thread.currentThread().getName()+" get data:"+data);

            //获取与当前线程绑定的实例
            MyThreadScopeData1 myData = MyThreadScopeData1.getThreadInstance();
            System.out.println("B from "+Thread.currentThread().getName()+" getMyData:"+myData.getName()+","+myData.getAge());
        }
    }
}
