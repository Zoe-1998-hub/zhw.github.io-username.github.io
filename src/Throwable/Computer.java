package Throwable;

public class Computer {
    private int state = 1;
    public void run() throws LanPingException,MaoYanException{
        if (state == 1){
            throw new LanPingException("电脑蓝屏啦！");
        }
        if (state == 2){
            throw new MaoYanException("电脑冒烟啦！");
        }
        System.out.println("电脑运行");
    }
    public void reset(){
        state = 0;
        System.out.println("电脑重启");
    }
}
