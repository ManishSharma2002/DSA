public class only_one_unique_element {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 5, 8, 1, 1, 5 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}

/*
 * dry run
 * xor (^) => 0+0 = 0 | 1+1= 0 | 1+ 0 = 1
 * a) ans = 0 ^ 2= 2
 * b) ans = 2 ^ 2= 0
 * c) ans = 0 ^ 5= 5
 * d) ans = 5 ^ 8= 13
 * e) ans = 13 ^ 1= 14
 * e) ans = 14 ^ 1= 13
 * e) ans = 13 ^ 5= 8
 * 
 * 
 */