package inheritance1;
public class Vehicles {
    String brand;
    String color;
    public Vehicles(String brand,String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public void run(){
        System.out.println("我已经开动了");
    }
    public void showInfo(){
        System.out.println("车的商标是："+brand+" 车的颜色是："+color);
    }


}
