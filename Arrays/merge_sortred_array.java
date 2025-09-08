public class merge_sortred_array {
    public static void meargeSorted(int[] arr1, int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int arr3[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        while (j < m) {
            arr3[k++] = arr2[j++];
        }
        print(arr3);

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 6, 8 };
        int[] arr2 = { 1, 2, 2, 7, 8 };

        meargeSorted(arr1, arr2);
    }
}
