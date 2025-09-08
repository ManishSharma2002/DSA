package Arraylist;

import java.util.ArrayList;

public class strore_water {

    // public static int strore_water_Container(ArrayList<Integer> ls) { // [T.C =
    // O(n2)]
    // int curr_water = 0;
    // for (int i = 0; i < ls.size(); i++) {
    // for (int j = i + 1; j < ls.size(); j++) {
    // int h = Math.min(ls.get(i), ls.get(j));
    // int w = j - i;
    // int water = h * w;
    // curr_water = Math.max(curr_water, water);
    // }
    // }
    // return curr_water;
    // }

    // two pointerr apporach [T.C = O(n)]
    public static int strore_water_Container(ArrayList<Integer> ls) {
        int curr_water = 0;
        int lp = 0;
        int rp = ls.size() - 1;
        while (lp < rp) {
            int h = Math.min(ls.get(lp), ls.get(rp));
            int w = rp - lp;
            int water = h * w;
            curr_water = Math.max(curr_water, water);

            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }

        return curr_water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(8);
        ls.add(6);
        ls.add(2);
        ls.add(5);
        ls.add(4);
        ls.add(8);
        ls.add(3);
        ls.add(7);
        System.out.println(strore_water_Container(ls));
    }
}
