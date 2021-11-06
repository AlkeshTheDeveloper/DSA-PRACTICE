package stringtest;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // first method for reverse string
        StringBuilder s= new StringBuilder(sc.next());
        s.reverse();
        System.out.println(s);

       // second method  for reverse string

        String k= sc.next();

        System.out.println("original string: "+ k);
         char [] m= k.toCharArray();


        for (int i = 0; i <k.length(); i++) {
            System.out.print(k.charAt(k.length()-1-i));

        }

      // third method for reverse string
            String j= new String("ramu");
           char [] tempArray=j.toCharArray();
           int left,right=0;
             right=tempArray.length-1;
        for (left = 0; left <right ; left++,right--) {
            char temp= tempArray[left];
            tempArray[left]=tempArray[right];
            tempArray[right]=temp;
        }
        System.out.println();
     for(char c:tempArray)
         System.out.print(c);
    }}

