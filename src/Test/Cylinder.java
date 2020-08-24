package Test;

public class Cylinder implements C{
    int radius;
    int height;
   String color;
    @Override
    public double area() {
        double s;
        s = radius*radius*PI;
        System.out.println("圆柱体的面积是："+s);
        return s;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
       System.out.println("圆柱体的color="+color);
    }

    @Override
    public void volume() {
        double v;
        v = height*PI*radius*radius;
        System.out.println("圆柱体的面积是："+v);
    }
}
