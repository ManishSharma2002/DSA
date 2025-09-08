package Recursion;

public class array_sum {
    public static int sum(int arr[], int ind) {
        int n = arr.length - 1;

        // base case
        if (ind == n) {
            return arr[ind];
        }

        // current element + recursive sum of rest
        return arr[ind] + sum(arr, ind + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 8, 9 };
        int result = sum(arr, 0);
        System.out.println("Sum = " + result);
    }
}
