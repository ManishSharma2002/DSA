package Arraylist;

import java.util.ArrayList;

public class multidim_arraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(10);
        ls1.add(20);
        main.add(ls1);

        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(30);
        ls2.add(40);
        main.add(ls2);

        System.out.println(main);

        for (int i = 0; i < main.size(); i++) {
            ArrayList<Integer> curr = main.get(i);
            System.out.println(curr);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }

    }
}
