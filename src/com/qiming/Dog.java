package com.qiming;

import java.util.Arrays;
import java.util.Comparator;

public class Dog {
    public String name;
    public int price;

    public Dog(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ",price=" + price + '}';
    }

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("wc001", 1000),
                new Dog("wc002", 4000),
                new Dog("wc003", 2000),
                new Dog("wc004", 8300),
                new Dog("wc005", 9000),
                new Dog("wc006", 3500),
        };
        Comparator<Dog> dogComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.price-o2.price;
            }
        };
        Arrays.sort(dogs,dogComparator);
        Arrays.asList(dogs).forEach(System.out::println);
    }
}
