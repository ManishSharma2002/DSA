package Arraylist;

import java.util.ArrayList;

public class Pair_sum1 {
    // public static boolean Pair_sum(ArrayList<Integer> ls, int target) {
    // for (int i = 0; i < ls.size(); i++) {
    // for (int j = i + 1; j < ls.size(); j++) {
    // if ((ls.get(i) + ls.get(j)) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static boolean Pair_sum(ArrayList<Integer> ls, int target) {
        int lp = 0;
        int rp = ls.size() - 1;
        while (lp < rp) {
            if ((ls.get(lp) + ls.get(rp)) == target) {
                return true;
            } else if ((ls.get(lp) + ls.get(rp)) < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // arraylist is aleady sorted
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        System.out.println(Pair_sum(ls, 5));
    }
}
