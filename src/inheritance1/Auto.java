package inheritance1;

public class Auto {
    int num;
    String color;
    int weight;
    int v;
    public Auto(int num,String color,int weight,int v){
        this.num = num;
        this.color = color;
        this.weight = weight;
        this.v = v;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getV() {
        return v;
    }

    public void accelerater(int acc){
        int sum = acc+v;
        System.out.println("小汽车现在的速度是："+sum);
    }
    public void decelerate(int subtract){
        int remain = v - subtract;
        System.out.println("小汽车现在的速度是："+remain);
    }
}
