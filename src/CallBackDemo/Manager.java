package CallBackDemo;

public class Manager implements CallBack{
    public Manager(Personnel pp){
        pp.doSomething(this,"整理文件");
    }

    @Override
    public void backResult(String result) {
        System.out.println("事情"+result);
    }
}
