package com.vijesh;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
       
        
       
        double area=(length*breadth);
        double perimeter=(2*(length+breadth));
        
        System.out.print("AREA: "+area);
        System.out.print(" PERIMETER: "+perimeter);
        
        
        sc.close();
        
	}
	

}
