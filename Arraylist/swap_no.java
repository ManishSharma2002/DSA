package Arraylist;

import java.util.ArrayList;

public class swap_no {

    public static void main(String[] args) {
        int ind1 = 1;
        int ind2 = 4;

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println(ls);
        int temp = ls.get(ind1);
        ls.set(ind1, ls.get(ind2));
        ls.set(ind2, temp);
        System.out.println(ls);
    }
}
