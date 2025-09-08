package String;

import java.util.Scanner;

public class lowercase_vowel {
    public static void lowcasevowel(String str){
        int count= 0;
        for(int i = 0;i<str.length();i++){
             char ch= str.charAt(i);
            if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
System.out.println(count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lower alphabet : " );
        String str = sc.nextLine(); 
        lowcasevowel(str);
    }
}
