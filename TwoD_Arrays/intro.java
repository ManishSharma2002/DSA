package TwoD_Arrays;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element :");

        int arr1[][] = new int[3][3];

        // input -- 1 2 3 4 5 6 7 8 9

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // arr1[i][j] = sc.nextInt();

        // }
        // }

        System.out.println("print the array : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);

            }
            System.out.println();
        }

    }
}
