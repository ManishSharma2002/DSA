package Recursion;

public class linear_search {
    public static boolean linear(int[] arr, int tar, int ind) {
        int n = arr.length - 1;
        if (ind == n) {
            return false;
        }
        if (arr[ind] == tar) {
            return true;
        } else {
            return linear(arr, tar, ind + 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 8, 9 };
        System.out.println(linear(arr, 7, 0));
    }
}
