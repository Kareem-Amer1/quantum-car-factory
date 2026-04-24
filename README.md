# 🚗 Quantum Car Factory

A simple Object-Oriented Design project that simulates a car factory system with multiple engine types and dynamic engine replacement.

---

## 📌 Project Overview

This project demonstrates a modular and extensible design for a car system where:
- A car can have different types of engines
- Engines can be replaced dynamically
- Hybrid engines intelligently switch between electric and gasoline modes based on speed
- The system follows clean OOP principles and design patterns

---

## ⚙️ Features

### 🚘 Car Operations:
- Start the car (engine starts at speed 0)
- Stop the car (engine speed resets to 0 before stopping)
- Accelerate (increase speed by 20 km/h up to 200 km/h)
- Brake (decrease speed by 20 km/h)

---

### 🔋 Engine Types:

#### 1. Gasoline Engine
- Traditional fuel-based engine

#### 2. Electronic Engine
- Fully electric engine

#### 3. Mixed Hybrid Engine
- Combines both Gasoline and Electronic engines
- Automatically switches:
  - Electric engine → speeds below 50 km/h
  - Gasoline engine → speeds 50 km/h and above
- Ensures cost-efficient operation (only one engine runs at a time)

---

## 🏭 Car Factory

The factory is responsible for:
- Creating cars based on engine type
- Replacing engines in existing cars dynamically

---

## 🧠 Design Concepts Used

- Object-Oriented Programming (OOP)
- Encapsulation
- Polymorphism
- Inheritance
- Abstraction
- Factory Design Pattern
- Strategy-like behavior in Hybrid Engine

---

## 🚀 How It Works

1. Create a car using the factory
2. Assign an engine type (Gasoline / Electronic / Hybrid)
3. Perform car operations (start, accelerate, brake, stop)
4. Replace engine dynamically if needed

---

## 🧪 Example Usage

```java
Car car = CarFactory.createCar(EngineType.HYBRID);

car.start();
car.accelerate();
car.accelerate();
car.brake();
car.stop();

CarFactory.replaceEngine(car, EngineType.GASOLINE);
car.start();
