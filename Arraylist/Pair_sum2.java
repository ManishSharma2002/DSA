package Arraylist;

import java.util.*;

public class Pair_sum2 {
    public static boolean Sorted_pair_sum(ArrayList<Integer> ls, int target) {
        int n = ls.size();
        int bp = -1;
        for (int i = 0; i < n; i++) {
            if (ls.get(i) > ls.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            if ((ls.get(lp) + ls.get(rp)) == target) {
                return true;
            } else if ((ls.get(lp) + ls.get(rp)) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(15);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        ls.add(9);
        System.out.println(Sorted_pair_sum(ls, 16));
    }
}
