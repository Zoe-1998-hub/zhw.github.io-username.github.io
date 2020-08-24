package inheritance1;

public class Car extends Vehicles{
    int seats;
    public Car(String brand, String color,int seats) {
        super(brand, color);
        this.seats = seats;
    }
    public void showCar(){
        System.out.println("车的商标是："+brand+" 车的颜色是："+color+" 汽车的座位是"+seats);
    }
}
