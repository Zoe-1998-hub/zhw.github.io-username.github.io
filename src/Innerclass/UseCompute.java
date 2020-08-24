package Innerclass;

public class UseCompute {
    private int n;
    private int m;
    public void useCom(Compute com, int one, int two){
        this.n = one;
        this.m = two;
        com.computer(n,m);
    }
}
