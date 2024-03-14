package com.vijesh;

class Vehicl{
    String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicl {
    String modelName = "Mustang";
}

public class Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk(); 
        System.out.println(myCar.brand + " " + myCar.modelName); 
    }
}
