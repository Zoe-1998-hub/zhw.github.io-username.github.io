package itcast;

public class Worker extends Thread{
    public Worker(String name){
        super(name);
    }
    @Override
    public void run(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work in"+getName());
    }
}
