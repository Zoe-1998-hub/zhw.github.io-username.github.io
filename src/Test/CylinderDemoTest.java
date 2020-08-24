package Test;

public class CylinderDemoTest {
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        c.radius = 4;
        c.height =  6;
        c.area();
        c.setColor("blue");
        c.volume();
    }
}
