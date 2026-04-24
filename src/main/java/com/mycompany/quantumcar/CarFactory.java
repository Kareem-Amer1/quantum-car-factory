/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumcar;

/**
 *
 * @author Metro
 */
public class CarFactory {

    public static Car createCar(EngineType type) {
        return new Car(createEngine(type));
    }

    public static void replaceEngine(Car car, EngineType type) {
        car.setEngine(createEngine(type));
    }

    private static Engine createEngine(EngineType type) {
        switch (type) {
            case GASOLINE:
                return new GasEngine();
            case ELECTRONIC:
                return new ElectronicEngine();
            case HYBRID:
                return new HybridEngine();
            default:
                throw new IllegalArgumentException("Invalid Engine Type");
        }
    }
}