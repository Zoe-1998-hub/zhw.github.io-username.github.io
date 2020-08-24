package Innerclass;
interface Inter1{
    void show1();
    void show2();
}
public class Outera2 {
    public void methond(){
        Inter1 in = new Inter1() {
            @Override
            public void show1() {
                System.out.println("...show1...." );
            }

            @Override
            public void show2() {
                System.out.println("...show2...." );
            }
        };
        in.show1();
        in.show2();
    }
}
class InnerClassDemo2{
    public static void main(String[] args){
        new Outera2().methond();
    }
}
