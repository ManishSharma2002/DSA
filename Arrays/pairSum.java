public class pairSum {
    public static int [] sumOFtar(int arr[], int tar){
        // brute force apporach
        int pair[] = new int[2];
        for(int i= 0; i<arr.length;i++){
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[i] + arr[j] == tar ){
                    pair[0] = i;
                    pair[1] = j;
                }
            }
        }
        return pair;

    }

    public static void ps(int arr[], int tar){
       
        //optimized approach
        int st= 0;
        int end = arr.length-1;
        int sum = 0;
        while(st<end){
            sum = arr[st] + arr[end];
            if(sum >tar){
                end--;
            }
            else if(sum <tar){
                st++;
            }
            else{
            System.out.println(arr[st] + " and "+arr[end]);
            break;
            }

            
        }
        
    }

    public static void main(String[] args) {
        int [] arr = {2,7,11,15,19};    // array is  already sorted
        // int [] result = sumOFtar(arr,22);
        //  for(int  i = 0; i<result.length;i++){
        //     System.out.print(result[i] + " " );
        // }
        ps(arr, 22);
    }
}
