package com.vijesh;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();
        
        
        for (int i = 1; i <= height; i++) {
           
            for (int j = 1; j <= i; j++) {
                if (i == height || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
