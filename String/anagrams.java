package String;
import java.util.*;
public class anagrams {
    
    public static void main(String[] args) {
        String str1 ="listen";
        String str2 = "isltne";
        if(str1.length()==str2.length()){     // check it both string length same 
            char [] arr1= str1.toCharArray();   // convert string into array like ("tom" = ['t','o','m'])
            char [] arr2= str2.toCharArray();
            Arrays.sort(arr1);       //both string are sorted for compared the each element
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println(str1 + " and "+ str2 + " anagrams to each other" );
            }
            else{

                System.out.println(str1 + " and "+ str2 + " are not anagrams " );
            }
        }
        else{
            System.out.println("not a anagrams");
        }

    }
}
