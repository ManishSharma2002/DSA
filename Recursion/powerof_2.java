package Recursion;

public class powerof_2 {
    public static int power(int n) {
        if (n == 0) {
            return 1;
        }

        // 2^n => 2 * 2^4 => 2*f(n-1);
        int small_prob = 2;
        int big_prob = power(n - 1);
        int prob = small_prob * big_prob;

        return prob;

    }

    public static void main(String[] args) {
        System.out.println(power(5));
    }
}
