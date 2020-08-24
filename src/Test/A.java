package Test;

public interface A {
    double PI = 3.14;
    double area();
}
interface B{
    void setColor(String c);
}
interface C extends A,B{
    void volume();
}