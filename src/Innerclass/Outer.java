package Innerclass;

class Outer{
    private int num = 3;

    class Inner //内部类
    {
        void show(){
            System.out.println("show run..." + num);
        }
    }

    public void method(){
        Inner in = new Inner();
        in.show();
    }
}

class InnerClassDemo{
    public static void main(String[] args){
        Outer out = new Outer();
        out.method();
    }
}