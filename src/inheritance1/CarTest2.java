package inheritance1;

public class CarTest2 {
    public static void main(String[] args){
        Auto a = new Auto(30,"BLUE",3,70);
        a.accelerater(20);
        Auto b = new Auto(30,"BLUE",3,90);
        b.decelerate(20);
        Car2 c = new Car2(22,"red",34,300,"343w");
        c.accelerater(20);
    }
}
