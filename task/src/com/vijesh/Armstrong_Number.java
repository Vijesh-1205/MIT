package com.vijesh;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println(isArmstrong(number));
           
        
        sc.close();
    }
    
    
    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += (digit * digit * digit);
            number /= 10;
        }
        return sum == temp;
    }
}
