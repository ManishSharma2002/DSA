package Recursion;

public class Says_number {
    public static void say_no(int n, String arr[]) {
        if (n == 0) {
            return;
        }
        int ld = n % 10;
        n = n / 10;
        say_no(n, arr);

        System.out.print(arr[ld] + " ");
    }

    public static void main(String args[]) {
        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int n = 412;
        say_no(n, arr);
    }

}
