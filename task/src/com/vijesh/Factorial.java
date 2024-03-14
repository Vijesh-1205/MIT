package com.vijesh;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger factorial = BigInteger.ONE;

            for (int i = number; i >= 1; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        sc.close();
    }
}
