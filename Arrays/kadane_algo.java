public class kadane_algo {
    public static void max_subarray_sum3(int arr[]) {
        int cs = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max, cs);

        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        // int arr[] = {1,-2,6,-1,3};
        int arr[] = { -1, -2, -6, -1, -3 };
        max_subarray_sum3(arr);

    }
}
