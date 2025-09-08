package Recursion;

public class fibonacci {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int ans = fibo(n - 1) + fibo(n - 2);
        return ans;
    }

    public static void main(String[] args) {

        // System.out.println(fibo(5));
        int first_no = 0;
        int sec_no = 1;
        for (int next_no = 1; next_no <= 6; next_no++) {
            int ans = first_no + sec_no;
            first_no = sec_no;
            sec_no = ans;
            System.out.println(ans);
        }

    }

}
