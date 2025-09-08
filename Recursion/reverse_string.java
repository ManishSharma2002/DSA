package Recursion;

public class reverse_string {

    public static void print(char[] arr) {
        for (char i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void solve(char[] arr, int i, int j) {
        if (i > j) {
            return;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        solve(arr, i + 1, j - 1);
    }

    public static void reverse(String s) {
        char arr[] = s.toCharArray();
        int st = 0;
        int end = s.length() - 1;
        solve(arr, st, end);
        print(arr);
    }

    public static void main(String[] args) {

        String s = "manish";
        reverse(s);
    }

}
