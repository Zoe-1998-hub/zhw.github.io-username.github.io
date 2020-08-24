package itcast;

public class Excample07 {
    public static void main(String[] args)throws Exception{
        new Thread(new Task07()).start();
        for (int i = 0;i<10;i++){
            if (i==5){
                Thread.sleep(2000);
            }
            else {
                Thread.sleep(500);
            }
            System.out.println("main主线程正在输出："+i);
        }
    }
}
