package structure;

import java.util.LinkedList;

public class MyStack {
    private LinkedList link;
    public MyStack(){
        link = new LinkedList();
    }
    public void add(Object obj){
            link.addFirst(obj);
        }
    public Object get(){
        return link.removeFirst();
    }
    public boolean isEmpty(){
        return  link.isEmpty();
    }

}

class MyStackDemo{
    public static void main(String[] args){
        MyStack ms = new MyStack();
        ms.add("hello");
        while (!ms.isEmpty()){
            System.out.println(ms.get());
        }
    }
}
