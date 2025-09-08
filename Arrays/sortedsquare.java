public class sortedsquare {
     public static void sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        printarray(result);
    }

    public static void printarray(int arr[] ){
        for(int  i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }

        

    public static void main(String[] args) {
        int []nums = {-4,-1,0,3,10};
//         After squaring, the array becomes [16,1,0,9,100].
//         After sorting, it becomes [0,1,9,16,100].
       sortedSquares(nums);

    }
}
