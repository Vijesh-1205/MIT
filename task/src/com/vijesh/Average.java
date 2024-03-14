package com.vijesh;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total count of numbers: ");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = ((double) sum / numbers.length); 

        System.out.println("Average of the numbers: " + average);

        sc.close();
    }
}
