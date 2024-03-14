package com.vijesh;

import java.util.Scanner;

public class sumofdigits {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a,sum=0;
        
        while(number!=0) {
        	a=number%10;
        	sum+=a;
        	number=number/10;
        }
        System.out.print("The sum of number is "+sum);
        sc.close();
	}

}
