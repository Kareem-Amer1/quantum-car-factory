/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumcar;

/**
 *
 * @author Metro
 */
public class HybridEngine implements Engine {
    private GasEngine gasEngine = new GasEngine();
    private ElectronicEngine electricEngine = new ElectronicEngine();

    private Engine operatingEngine;
    private int currentSpeed = 0;

    @Override
    public void start() {
        operatingEngine = electricEngine;
        operatingEngine.start();
        System.out.println("Hybrid Engine Started (Electric Mode)");
    }

    @Override
    public void stop() {
        operatingEngine.stop();
        System.out.println("Hybrid Engine Stopped");
    }

    @Override
    public void setSpeed(int speed) {

        if (speed >= 50 && currentSpeed < 50) {
            operatingEngine.stop();
            operatingEngine = gasEngine;
            operatingEngine.start();
            System.out.println("Switched to Gas Engine");
        }

        else if (speed < 50 && currentSpeed >= 50) {
            operatingEngine.stop();
            operatingEngine = electricEngine;
            operatingEngine.start();
            System.out.println("Switched to Electric Engine");
        }

        currentSpeed = speed;
        operatingEngine.setSpeed(speed);
    }
}
