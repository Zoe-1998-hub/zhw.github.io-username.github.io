package inheritance;
import java.util.*;
public class ManagerTest {
    public static void main(String[] args){
        Manager boss = new Manager("Rose",9000,1987,12,3);
        boss.setBonus(5000);
       ArrayList<Employee> staff = new ArrayList<>();
        staff.add(boss);
        staff.add(new Employee("ee",5000,1999,12,2));
        staff.add(new Employee("kk",5000,1966,5,3));
        for (Employee e : staff){
            System.out.println("name="+" "+e.getName()+" "+e.getSalary());
        }
    }
}
