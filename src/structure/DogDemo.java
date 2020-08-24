package structure;

import java.util.HashSet;

public class DogDemo {
    public static void main(String[] args){
        HashSet<Dog> hs = new HashSet<Dog>();

        //创建狗对象
        Dog d1 = new Dog("Mary",23,"red",'男');
        Dog d2 = new Dog("Tom",25,"black",'女');
        Dog d3 = new Dog("Lucy",26,"blue",'男');
        Dog d4 = new Dog("Kitty",20,"green",'女');

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);

        for (Dog d :hs){
            System.out.println(d.getName()+"----"+d.getAge()+"-----"+d.getColor()+"-----"+d.getSex());
        }
    }
}
