package ArrayTekrar;

import java.util.ArrayList;
import java.util.List;

public class A04 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("tahta");
        list.add("sıra");
        list.add("silgi");
        list.add("kalem");
        list.add(0,"masa");
        System.out.println(list);
        List<String> list2=new ArrayList<>();
        list.add("perde");
        list2.addAll(list);
        System.out.println();

        System.out.println(list2);
        System.out.println();
        System.out.println(list2.get(3));
        list2.remove(1);
        System.out.println(list2);
        System.out.println(list.size());


    }

}
