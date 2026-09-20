# SDP-Assignment2
# Logistic App Assigment 2

## Project Purpose
This is my java console aplication for Assigment 2. It make delivery (road or sea) and also show ui buttons (windows or mac). I use Factory Method and Abstract Factory paterns here. 

## Requirements
- Java 17

## Package Structure
- `logistics` - Factory Method paterns (Transports, Trucks, Ships).
- `gui` - Abstract Factory classes (Buttons, Checkboxes and factorys).
- `app` - Main class and DeliveryApplication to run program.

## Input Values
When you start app, you need type:
- `ROAD` or `SEA` for delivery mode
- `WINDOWS` or `MACOS` for ui platform

If you write wrong input, program will show error message and stop.

## How to build and run
1. Open project in Intellij idea
2. Go to `src/main/java` folder
3. Find `Main.java` inside `app` package
4. Click run button near main method
5. Type answers in console

## Sample Run
```text
Delivery mode (ROAD, SEA): ROAD
UI platform (WINDOWS, MACOS): WINDOWS
--------------------------------------------------
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse by road.
