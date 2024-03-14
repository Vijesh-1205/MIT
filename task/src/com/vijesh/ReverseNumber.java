package com.vijesh;
import java.util.Scanner;

public class ReverseNumber {

	    public static void main(String[] args) {
	        int a= 0, digit;
	        System.out.print("Enter number: ");
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        
	        while (number > 0) {
	            digit = number % 10;
	            a = a * 10 + digit;
	            number = number / 10;
	        }
	        
	        System.out.print("The reversed number is " + a);
	        sc.close();
	    }
	}