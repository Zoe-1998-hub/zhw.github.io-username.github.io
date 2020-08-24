package com.company;

public class Dog {
    String name;
    public static void main(String arg[]){
        Dog dog1 = new Dog();
        dog1.dark();
        dog1.name="Mary";
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Zoe";
        myDogs[1].name ="Kitty";
        System.out.println("One dog is "+myDogs[2].name);

        int x = 0;
        while (x<myDogs.length){
            myDogs[x].dark();
            x = x+1;
        }
    }
    public void dark(){
        System.out.println(name+" says Ruff");
    }
}
