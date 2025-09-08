import java.util.Arrays;

public class majority_element {

     
    public static void main(String[] args) {
         int arr[] = {1,2,1,2,1,1};
         int n = arr.length;
        

        // brute force approach 
        //  for(int i = 0;i<arr.length;i++){
        //     int freq = 0;
        //     int val = arr[i];
        //     for(int j = 0;j<arr.length;j++){
        //         if(val  == arr[j]){
        //             freq++;
        //         }
        //     }
        //     if(freq> n/2){
        //         System.out.println(val);
        //         break;
        //     }

        //  }
        
            // optimized approach = T.C => O(nlogN)
            Arrays.sort( arr);
            int val  = arr[0];
            int freq  = 1;
           for(int i = 1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                freq++;
            }
            else{
                freq = 1;
                val= arr[i];
            }
            if(n/2<freq){
                System.out.println(val);
            }
           }
    }
}