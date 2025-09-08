public class revision {

    public static int max_sum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 3, -4, 5, 4, -1, 7, -8 };
        System.out.println(max_sum(arr));
    }
}
