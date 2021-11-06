package Arrays;

import java.util.Scanner;

// create a method which takes array and end as argument
// inside method  run a loop upto arraylength
//  within loop create a temp variable compare left most value with right most value.
// if left < right then swap it
// create a method to print the reverse array
public class ReverseValues {

    // method to  reverse the given array
    static void reverseArray(int m[],int end){
    int start=0;

      while(start<end){
          int temp=m[start];
          m[start]=m[end];
          m[end]=temp;
          start++;
          end--;
      }



    }




//print method to print the reverse array
   static void printArray(int m[],int size){
       System.out.print("Reverse array :  ");
       for (int i = 0; i <size ; i++) {
           System.out.print(m[i]+" ");
       }
   }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int [] m=new int[n];
        System.out.println("enter values of array");
        for (int i = 0; i <n ; i++) {
         m[i]=sc.nextInt();
        }
        int end=n-1;
        reverseArray(m,end);
        printArray(m,n);

    }
}
