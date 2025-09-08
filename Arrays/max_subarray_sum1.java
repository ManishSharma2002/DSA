public class max_subarray_sum1 {
    public static void max_subarray_sum(int arr[]){
       int currsum = Integer.MIN_VALUE;
       int maxsum = arr[0];
       
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                currsum = 0;
                for(int k= i;k<=j;k++){
                   currsum = currsum +arr[k];
                }
                System.out.println( "sum of range " + i+  " to " + j+  " = " + currsum );
                maxsum= Math.max(maxsum,currsum);
                
            }
            System.out.println();
            
        }
        System.out.println("max sum of subarray : " + maxsum);
    }

    
    

    public static void main(String[] args) {
        // int arr[] = {1,-2,6,-1,3};
        int arr[] = {2,4,6,8,10};
        max_subarray_sum(arr);       


    }
}
