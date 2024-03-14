package com.vijesh;
import java.util.Scanner;

public class distance2points {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinates of first point");
		System.out.print("x1: ");
		int x1=sc.nextInt();
		System.out.print("y1: ");
		int y1=sc.nextInt();
		
		System.out.println("Enter co-ordinates of second point");
		System.out.print("x2: ");
		int x2=sc.nextInt();
		System.out.print("y2: ");
		int y2=sc.nextInt();
		
		System.out.print (Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2))));
		sc.close();
	}

}
