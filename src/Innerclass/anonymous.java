package Innerclass;
abstract class Demo{
    abstract void show();
}
public class anonymous {
    int num = 4;
    void method(){
        new Demo(){//匿名内部类
            void show(){
                System.out.println("show...."+num);
            }
        }.show();
    }
}

class InnerClassDemo1{
    public static void main(String[] args){
        new anonymous().method();
    };
}
