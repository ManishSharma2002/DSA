
import java.util.Arrays;
import java.util.Scanner;

public class revision1 {

    public static int ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reversearr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print(arr);
    }

    public static void pairofarr(int arr[]) {
        int tp = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    public static void majorityelement(int[] arr) {

        Arrays.sort(arr);
        int cnt = 1;
        int val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
                val = arr[i];

            }
            if (arr.length / 2 < cnt) {
                System.out.println(val);
            }

        }
    }

    public static void maxsub(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = {3,-4,5,4,-1,7,-8};
        // int key = 11;
        // System.out.println(ls(arr, key));
        // reversearr(arr);
        // pairofarr(arr);
        // int a;
        // System.out.println(a);
        // int max= Integer.MIN_VALUE;
        // for(int i = 0 ;i<arr.length;i++){
        // int currsum = 0;
        // for(int j = i;j<arr.length;j++){
        // currsum += arr[j];
        // max= Math.max(max,currsum);
        // }
        // }
        // System.out.println(max);
        // int arr[] = {2,2,1,1,1,2,1,1,2};
        // int arr[] = { 1, 2, 3, 4, 5 };
        // maxsub(arr);
        // majorityelement(arr);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char ch[] = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(i + " " + ch[i] + " ");
        }

    }
}
