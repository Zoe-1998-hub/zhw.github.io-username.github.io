package com.company;

public class NextDog {
    private int size;
    private int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }
    void dark(){
        if (size > 60){
            System.out.println(" yooyoo");
        }
        if (size > 15){
            System.out.println(" Ruff Ruff");
        }
        else {
            System.out.println(" Luu Luu");
        }
    }
}
class DogTestTrip {
    public static void main(String arg[]){
        NextDog one = new NextDog();
        one.setSize(8);
        one.dark();
        NextDog two = new NextDog();
        two.setSize(88);
        two.dark();
        NextDog three = new NextDog();;
        three.setSize(44);
        three.dark();
    }
}