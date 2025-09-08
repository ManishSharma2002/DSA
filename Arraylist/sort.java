package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sort {

    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(9);
        ls.add(12);
        ls.add(15);
        ls.add(4);
        ls.add(50);

        System.out.println(ls);
        Collections.sort(ls, Collections.reverseOrder());
        System.out.println(ls);

    }
}
