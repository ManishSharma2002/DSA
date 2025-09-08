package Sorting;

public class Selection_sort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 2, 1, 3, 8 };
        int n = arr.length;
        System.out.println("original array : ");
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;

        }
        System.out.println("sorted array :");
        print(arr);

    }
}
