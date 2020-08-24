package saleticket;
//增加的线程需要传入一个共享数据
public class MyRunnable1 implements Runnable{
    private ShareData2 data;
    public MyRunnable1(ShareData2 data){
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            data.increment();
        }
    }
}
