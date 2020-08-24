package saleticket;

public class MultyThreadShareData {

    //共享数据作为外部类的成员变量
    //private static ShareData data = new ShareData();
    public static void main(String[] args){

        //也可以定义为final类型的局部变量
        final ShareData data = new ShareData();

        //开启4条线程
        for(int i=0;i<2;i++){

            //增加的线程
            new Thread(new Runnable(){
                @Override
                public void run() {
                    for(int i=0;i<100;i++){
                        data.increment();
                    }
                }
            }).start();
            //减少的线程
            new Thread(new Runnable(){
                @Override
                public void run() {
                    for(int i=0;i<100;i++){
                        data.decrement();
                    }
                }
            }).start();
        }
    }
}
//封装共享数据和操作共享数据方法的类
class ShareData{
    private int j = 0;
    public synchronized void increment() {
        j++;
        System.out.println(Thread.currentThread().getName()+" inc : "+j);
    }
    public synchronized void decrement() {
        j--;
        System.out.println(Thread.currentThread().getName()+" dec : "+j);
    }
}
