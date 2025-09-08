public class peakelement {
     public static int peakIndexInMountainArray(int[] arr) {
        int strt  = 0;
        int end = arr.length-1;
        int  mid = strt + (end - strt)/2;
        while(strt< end){
            mid = strt + (end - strt)/2;
            if(arr[mid]< arr[mid+1]){
                strt = mid +1;
                
            }
            else{
                end = mid;
            }
        }
        return strt;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        System.out.println("peak element index  "+peakIndexInMountainArray(arr));
    }
}
