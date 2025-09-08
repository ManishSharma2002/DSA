public class swap_alternate {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapAlt(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if ((i + 1) < arr.length) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 6 };
        swapAlt(arr);
        printarr(arr);
    }
}
