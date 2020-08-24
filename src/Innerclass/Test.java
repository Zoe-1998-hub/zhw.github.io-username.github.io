package Innerclass;

public class Test {
    public static void main(String[] args){
        UseCompute use = new UseCompute();
        use.useCom(new Add(),8,2);
        use.useCom(new Div1(),8,2);
        use.useCom(new Multiply(),8,2);
        use.useCom(new Subteact(),8,2);
    }
}
