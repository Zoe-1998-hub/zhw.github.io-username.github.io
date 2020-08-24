package itcast;

public class MyThread extends Thread{
    private String name;
    MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int x = 0;x<5;x++){
            System.out.println(name+"...x="+x+"....ThreadName="+Thread.currentThread().getName());
        }
    }

}
//https://github.com/JackChan1999/Java_Basic_Introduction/blob/master/%E7%AC%AC5%E7%AB%A0%20%E5%A4%9A%E7%BA%BF%E7%A8%8B/%E5%A4%9A%E7%BA%BF%E7%A8%8B.md