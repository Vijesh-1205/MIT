package com.vijesh;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();
        
        double s=((side1+side2+side3)/2);
        double area=(Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))));
        double perimeter=(side1+side2+side3);
        
        System.out.print("AREA: "+area);
        System.out.print(" PERIMETER: "+perimeter);
        
        
        sc.close();
        
	}
	

}
