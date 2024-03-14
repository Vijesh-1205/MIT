package com.vijesh;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double number = sc.nextDouble();
        System.out.print("Enter power: ");
        double power = sc.nextDouble();
        System.out.print(number+ " to the power of "+power +" is " +(Math.pow(number,power)) );
        sc.close();
	}

}
