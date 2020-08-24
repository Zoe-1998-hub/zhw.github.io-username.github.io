package inheritance1;

public class Car2 extends Auto{
    String airConsitioner;
    public Car2(int num, String color, int weight, int v,String airConsitioner) {
        super(num, color, weight, v);
        this.airConsitioner = airConsitioner;
    }

}
