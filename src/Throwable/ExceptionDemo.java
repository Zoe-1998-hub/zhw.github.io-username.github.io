package Throwable;

public class ExceptionDemo{
    public static void main(String[] args){
        Teacher t = new Teacher("毕老师");
        try{
            t.prelect();
        } catch (NoPlanException e) {
            System.out.println(e.toString()+"......");
            System.out.println("换人");
        }
    }
}