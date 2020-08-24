package Test;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("1!+2!+3!+……+20!=" + getSum(20));
    }

    public static long getSum(int n) {
//TODO: 完成
        long sum = 0;
        int m, j, i;
        for (j = 1; j <= n; j++) {
            m = 1;
            for (i = 1; i <= j; i++){
                m *= i;
            }
            sum += m;
        }
         return sum;
    }

}
