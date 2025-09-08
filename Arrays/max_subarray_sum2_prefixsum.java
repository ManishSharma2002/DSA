public class max_subarray_sum2_prefixsum {

    // public static void prefix_sum(int [] arr){
    //     int n =  arr.length;
    //     int pref[] = new int[n];
    //     pref[0] = arr[0];
    //     int currsum = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     // calculate prefix sum
    //     for(int i = 1; i<n;i++){
    //         pref[i] = pref[i-1] + arr[i];
    //     }

    //     for(int i = 0;i<n;i++){
    //         for(int j = i ;j<n;j++){
    //             currsum = i==0? pref[j]: pref[j]- pref[i-1];
    //             if(maxsum <currsum){
    //                 maxsum = currsum;
    //             }
    //         }

    //     }
        
    //     System.out.println("prefix sum : " + maxsum);

    // }

    public static void prefix_sum(int arr[]){
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        int max  = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j= i ;j<arr.length;j++){
                sum = i==0?pref[i] :pref[j]  - pref[i-1];
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};


        prefix_sum(arr);
    }
    
}
