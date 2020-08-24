package itcast;

public class Task07 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            try {
                if (i==3){
                    Thread.sleep(2000);
                }
                else {
                    Thread.sleep(500);
                }
                System.out.println("线程一正在输出："+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
