/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumcar;

/**
 *
 * @author Metro
 */
public class Car {

    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        engine.start();
    }

    public void stop() {
        speed = 0;
        engine.setSpeed(0);
        engine.stop();
    }

    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            if (speed > 200) speed = 200;

            engine.setSpeed(speed);
            System.out.println("Car Speed: " + speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            if (speed < 0) speed = 0;

            engine.setSpeed(speed);
            System.out.println("Car Speed: " + speed);
        }
    }
}
