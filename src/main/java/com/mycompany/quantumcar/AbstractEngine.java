/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumcar;

/**
 *
 * @author Metro
 */
public abstract class AbstractEngine implements Engine {

    protected int engineSpeed = 0;

    protected void increase() {
        engineSpeed++;
    }

    protected void decrease() {
        engineSpeed--;
    }

    @Override
    public void start() {
        engineSpeed = 0;
        System.out.println(getName() + " Started");
    }

    @Override
    public void stop() {
        while (engineSpeed > 0) decrease();
        System.out.println(getName() + " Stopped");
    }

    @Override
    public void setSpeed(int speed) {
        while (engineSpeed < speed) increase();
        while (engineSpeed > speed) decrease();
        System.out.println(getName() + " Speed: " + engineSpeed);
    }

    protected abstract String getName();
}
