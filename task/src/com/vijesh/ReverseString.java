package com.vijesh;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] c=str.toCharArray();
        int a = 0;
        int b = str.length() - 1;
        while (a < b) {
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
        
        a++;
        b--;
        }
        String reversed = new String(c);
        System.out.println("Reversed String is "+reversed);       
        sc.close();
    }
    
}