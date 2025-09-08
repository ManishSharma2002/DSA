package Arraylist;

import java.util.ArrayList;

public class max_number {

    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ls.size(); i++) {
            if (max < ls.get(i)) {
                max = ls.get(i);
            }
            // max = Math.max(max, ls.get(i));
        }
        System.out.println("max number of arraylist " + max);
    }
}
