package Innerclass;

public class Add implements Compute{
    int m;
    int n;
    int result;

    @Override
    public int computer(int n, int m) {
        this.m = m;
        this.n = n;
        result = m+n;
        System.out.println("n+m= "+result);
        return result;
    }
}
class Div1 implements Compute{
    int m;
    int n;
    int result;

    @Override
    public int computer(int n, int m) {
        this.m = m;
        this.n = n;
        result = n-m;
        System.out.println("n-m="+result);
        return result;
    }
}
class  Multiply implements Compute{
    int m;
    int n;
    int result;

    @Override
    public int computer(int n, int m) {
        this.m = m;
        this.n = n;
        result = n*m;
        System.out.println("n*m= "+result);
        return result;
    }
}

class  Subteact implements Compute{
    int m;
    int n;
    int result;

    @Override
    public int computer(int n, int m) {
        this.m = m;
        this.n = n;
        result = n/m;
        System.out.println("n/m= "+result);
        return result;
    }
}
