package com.vijesh;
import java.util.Scanner;

public class LCM {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        int lcm = find(num1, num2);
	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

	        sc.close();
	    }
	    public static int find(int num1, int num2) {
	        int max = Math.max(num1, num2);
	        int min = Math.min(num1, num2);
	        int lcm = max;

	  
	        while (lcm % min != 0) {
	            lcm += max; 
	        }

	        return lcm;
	    }
	}
