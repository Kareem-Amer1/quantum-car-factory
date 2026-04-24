/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantumcar;

/**
 *
 * @author Metro
 */
public class QuantumCar {

    public static void main(String[] args) {
        System.out.println("=== Hybrid Car Test ===");
        Car car = CarFactory.createCar(EngineType.HYBRID);

        car.start();

        car.accelerate(); 
        car.accelerate(); 
        car.accelerate(); 

        car.brake();      

        car.stop();

        System.out.println("\n=== Replace Engine ===");

        CarFactory.replaceEngine(car, EngineType.GASOLINE);

        car.start();
        car.accelerate();
        car.accelerate();

        car.stop();

        System.out.println("\n=== Electric Car Test ===");

        Car electricCar = CarFactory.createCar(EngineType.ELECTRONIC);

        electricCar.start();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.stop();
    }
}
