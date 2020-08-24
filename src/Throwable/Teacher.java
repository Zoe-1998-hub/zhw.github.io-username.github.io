package Throwable;

public class Teacher {
    private String name;
    private Computer comp;
    Teacher(String name){
        this.name = name;
        comp = new Computer();
    }
    public void test(){
        System.out.println("大家练习");
    }
    public void prelect() throws NoPlanException{
        try {
            comp.run();
            System.out.println(name+"讲课");
        }
        catch (LanPingException e){
            System.out.println(e.toString());
            comp.reset();
            prelect();
        }
        catch (MaoYanException e){
            System.out.println(e.toString());
            test();
            throw new NoPlanException("课时进度无法完成，原因："+e.getMessage());
        }
    }
}
