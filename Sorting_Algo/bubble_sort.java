package Sorting_Algo;

public class bubble_sort {
    
    public static void main(String[] args) {
        int arr[] = {5,6,4,2,9,7};
        // int arr[] = {1,2,2,4,5,6};
        int swap =0;
        for(int turn= 0 ; turn<arr.length-1;turn++){
           
            for(int j= 0 ;j<arr.length-1-turn ;j++){
               if(arr[j]>arr[j+1]){

                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swap++;
                }
            } 
             if(swap ==0){
                System.out.println("array is aleardy sorted");
                break;
            }
        }

    

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
