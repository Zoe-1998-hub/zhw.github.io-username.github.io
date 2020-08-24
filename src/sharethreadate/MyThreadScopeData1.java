package sharethreadate;

public class MyThreadScopeData1 {
    private MyThreadScopeData1(){}
    private static ThreadLocal<MyThreadScopeData1> map = new ThreadLocal<MyThreadScopeData1>();
    //定义一个静态方法，返回各线程自己的实例
    //不必同步，每个线程都要创建自己的实例，所以没有线程安全问题
    public static MyThreadScopeData1 getThreadInstance(){
        MyThreadScopeData1 instance = map.get();//获取当前线程绑定的实例
        if (instance ==null){
            instance = new MyThreadScopeData1();
            map.set(instance);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
}
