package Recursion;

public class print_number {
    public static void print_no(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print_no(n - 1);
    }

    public static void main(String[] args) {
        print_no(10);
    }
}
