package com.vijesh;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
     int a=0,b=1,c,i=0;  
     System.out.println("Enter number of terms: "); 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     
      while(i <= n) 
    {
            System.out.println(a); 
            c=a+b;
            a=b;
            b=c;

            i++;
    }
    sc.close();
}       
}
