public class moves_zeros {

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 6, 0, 0, 3, 0 };
        int move_0 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[move_0];
                arr[move_0] = arr[i];
                arr[i] = temp;
                move_0++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
