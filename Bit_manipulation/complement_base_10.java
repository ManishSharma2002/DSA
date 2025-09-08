package Bit_manipulation;

import java.util.Arrays;

public class complement_base_10 {

    public static void main(String[] args) {
        int n = 5;
        int mask = 0;
        int m = n;
        while (m > 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;

        }
        int ans = (~n) & (mask);
        System.out.println(ans);

    }

}
