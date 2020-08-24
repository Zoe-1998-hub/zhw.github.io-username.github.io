package saleticket;

public class MultyThreadShareMethod1 {
    public static void main(String[] args){
        //将数据封装到一个对象上
        ShareData2 data1 = new ShareData2();
        //在Runnable的构造函数中直接传入去操作
        for(int i = 0;i<2;i++){
            new Thread(new MyRunnable1(data1)).start();
            new Thread(new MyRunnable2(data1)).start();

        }
    }
}
