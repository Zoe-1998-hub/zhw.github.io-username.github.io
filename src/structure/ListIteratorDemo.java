package structure;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorDemo {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        //迭代器遍历
       /* Iterator it = list.iterator();
        while (it.hasNext()){
            String s = (String) it.next();
            if ("world".equals(s)){
                list.add("javaee");
            }
        }*/
        ListIterator lit = list.listIterator();
        while (lit.hasNext()){
            String s =(String) lit.next();
            if ("world".equals(s)){
                lit.add("javaee");
            }
        }

    }


}
