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
         char [] m= k.toCharArray();

        System.out.println(m);

        for (int i = 0; i <k.length(); i++) {
            System.out.print(k.charAt(k.length()-1-i));

        }

    }}

