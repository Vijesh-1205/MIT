package com.vijesh;
import java.util.Scanner;
public class Isosceles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        
        
        double area=(0.5*height*base);
        double perimeter=((2*side)+base);

        System.out.print("AREA: "+area);
        System.out.print(" PERIMETER: "+perimeter);
        
        
        sc.close();
        
	}
	

}
