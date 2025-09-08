import java.util.ArrayList;

public class lastAndFirst_Occurance{
public static ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList <Integer> a = new ArrayList<>();
        int strt = 0;
        int end = arr.length-1;
        int first = -1;
        while(strt<=end){     // first occurance
            int mid = strt + (end -strt)/2;
            if(arr[mid]== x){
                first = mid;
                end = mid -1;
            }
            else if(arr[mid]>x){
                end = mid -1;
            }
            else if (arr[mid]<x){
                strt =  mid +1;
        }
            
        }
        a.add(first);
         strt = 0;
         end = arr.length-1;
        int last = -1;
        
         while(strt<=end){     // last  occurance
            int mid = strt + (end -strt)/2;
            if(arr[mid]== x){
                last = mid;
                strt = mid +1;
            }
            else if(arr[mid]>x){
                end = mid -1;
            }
            else if (arr[mid]<x){
                strt =  mid +1;
        }
             
         }
        a.add(last);
        
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,2,2,2,5,6,7};
        int arr1[] = {1, 2, 3};
        int nums = 2;
        System.out.println("firat and" + find(arr,nums));

        // Q: - fidn the total no of occurance  = (lasr index + first index) +1 
        // example = occurance of 2 = (5-2)+1 = 4
    }
}