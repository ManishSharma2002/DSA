public class revision6 {
    public static void reverse(int[] arr, int st) {
        int s = st + 1;
        int e = arr.length - 1;
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;

        }
        print(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 3, 8, 9, 7 };
        reverse(arr, 2);
    }
}
