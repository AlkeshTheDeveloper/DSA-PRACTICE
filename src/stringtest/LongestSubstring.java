package stringtest;

import java.util.HashSet;
import java.util.Scanner;
// create a method to check given string for substring
// check length if it is 0 return 0
// take hashset  and two pointers left and right
// check left<=right and right<string length
//the add values in hash set and check if prv value was there

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         String s= sc.next();
        int result= longestString(s);
        System.out.println(result);


    }


     static int longestString(String s){
         if (s.length()==0) return 0;

         HashSet<Character> set= new HashSet<>();
         int left=0,right=0,max=1;

         while (left<=right && right<s.length()){
             if(!set.contains((s.charAt(right))) ){
                 set.add(s.charAt(right));
                 max=Math.max(max,right-left+1);
                 right++;
             }
             else{
                 set.remove(s.charAt(left));
                 left++;
             }

         }
         return max;

    }


}
