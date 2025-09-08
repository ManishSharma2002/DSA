public class binary_search{
    public static int bin_search (int arr[] , int key ){
        int strt =0, end= arr.length-1;

        while(strt<=end){
            int mid =strt +  (end - strt)/2;
            if(arr[mid] == key ){
                return mid ;
            }
            if(arr[mid] > key ){
                end = mid-1 ;
            }
            else{
                strt = mid +1;
            }


        }
        return -1;

    }
    
    
    public static void  main(String[] args) {


        int [] arr = {2,4,6,6,7,7,8,8,8,10,11,14};
        int num = 8;
        System.out.println("the index of key is :"+ bin_search(arr, num));



        
}

     
}
