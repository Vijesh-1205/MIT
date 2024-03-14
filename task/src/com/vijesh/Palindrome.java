package com.vijesh;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println(isPalindrome(str));
           
        
        sc.close();
    }
    
   
    public static boolean isPalindrome(String str) {
        int a = 0;
        int b = str.length() - 1;
        
        while (a < b) {
            if (str.charAt(a) != str.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }
}
