package Recursion;

public class binary_seach {
    public static boolean solve(int arr[], int s, int e, int tar) {
        if (s > e) {
            return false;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == tar) {
            return true;
        }

        if (arr[mid] > tar) {
            return solve(arr, s, mid - 1, tar);
        } else {
            return solve(arr, s + 1, e, tar);

        }
    }

    public static boolean binary(int[] arr, int tar) {
        int end = arr.length;
        int st = 0;
        return solve(arr, st, end - 1, tar);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 8, 9, 11 };
        int tar = 11;
        System.out.println(binary(arr, tar));
    }
}
