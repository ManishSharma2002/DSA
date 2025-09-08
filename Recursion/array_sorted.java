package Recursion;

public class array_sorted {
    public static boolean sorted(int arr[], int ind) {
        int n = arr.length - 1;
        if (n == 0) {
            return true;
        }
        if (ind == n) {
            return true;
        }
        if (arr[ind] > arr[ind + 1]) {
            return false;
        } else {
            return sorted(arr, ind + 1);
        }

    }

    public static void main(String[] args) {
        // int[] arr = { 1, 6, 8, 9, 11, 13, 15 };
        int[] arr = {};
        System.out.println(sorted(arr, 0));
    }
}
