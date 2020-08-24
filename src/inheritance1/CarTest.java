package inheritance1;

public class CarTest {
    public static void main(String[] args){
        Vehicles v = new Vehicles("kk","blue");
        v.run();
        v.showInfo();
        Car c = new Car("dd","green",4);
        c.showCar();
    }
}
