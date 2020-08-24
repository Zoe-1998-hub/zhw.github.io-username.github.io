package Throwable;

public class Demo {
    public static int method(int[] arr,int index){
        if (arr == null){
            throw new NullPointerException("数组的引用不能为空");
        }
        if (index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("数组的角标越界："+index);
        }
        return arr[index];
    }

}
