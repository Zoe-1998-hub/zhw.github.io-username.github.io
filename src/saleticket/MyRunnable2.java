package saleticket;

public class MyRunnable2 implements Runnable{
    private ShareData2 data;
    public MyRunnable2(ShareData2 data){
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            data.decrement();
        }
    }
}

