package auguest;

public interface A {
    public void show();
}

interface Z{
    public void show();
}
class Test implements A,Z{

    @Override
    public void show() {
        System.out.println("Test");
    }
}
class InterfaceDemo{
    public static void main(String[] args){
        Test t = new Test();
        t.show();
    }
}