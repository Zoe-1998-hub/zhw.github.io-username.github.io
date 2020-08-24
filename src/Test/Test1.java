package Test;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("请输入");
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("一共"+words.length);
    }
}
