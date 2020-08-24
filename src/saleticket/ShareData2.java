package saleticket;
//封装共享数据和操作共享数据方法的类
public class
ShareData2 {
    private int j = 0;
    public synchronized void increment(){
        j++;
        System.out.println(Thread.currentThread().getName()+"inc:"+j);
    }
    public  synchronized void decrement(){
        j--;
        System.out.println(Thread.currentThread().getName()+"dec:"+j);
    }
}
