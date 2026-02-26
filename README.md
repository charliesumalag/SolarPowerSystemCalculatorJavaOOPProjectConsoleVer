**☀️ Solar Power System Calculator (Java)**

A Java-based console application that calculates the required solar power system specifications based on user input.
This repository contains both:

📁 Full Java source code
📦 Compiled executable .jar file



**📌 Project Overview**

The Solar Power System Calculator helps users estimate the size of a solar energy system based on their appliance usage and system configuration.
The program calculates:
Total daily energy consumption (Wh/day)
Required solar panel power (W)
Required battery capacity (Wh and Ah)
Recommended inverter size (W)
Recommended charge controller rating (A)

This project demonstrates structured programming, basic object-oriented design, and practical engineering calculations using Java.


**🏗 How the System Works**

The program follows this flow:
User Input → Validation → Energy Calculation → System Sizing → Output Summary

1️⃣ Appliance Input

  The user enters:
    Appliance name
    Power rating (Watts)
    Quantity
    Hours used per day
    Energy consumption per appliance is calculated as:
    Energy (Wh/day) = Power (W) × Quantity × Hours per Day
    Total daily energy consumption is the sum of all appliances.

2️⃣ System Parameters Input

  The user provides:
    Peak Sun Hours (PSH)
    System Voltage (V)
    Depth of Discharge (DoD %)
    Days of Autonomy

3️⃣ Solar System Calculations

    Required Solar Panel Power
    Required Panel Power (W) = Total Daily Energy / PSH
    Required Battery Capacity (Wh)
    Battery Capacity (Wh) =
    (Total Daily Energy × Days of Autonomy) / (DoD / 100)
    Battery Capacity (Ah)
    Battery Capacity (Ah) = Battery Wh / System Voltage
    Recommended Inverter Size
    Inverter Size (W) = Required Panel Power × 1.25
    (25% safety margin included)
    Charge Controller Rating
    Charge Controller (A) = Required Panel Power / System Voltage


All results are rounded to two decimal places.

**▶️ How to Run the Program**
✅ Option 1: Run the Executable JAR (Recommended)

    Install Java JDK 8 or higher.
    Open terminal or command prompt.
    Navigate to the repository folder.
    Run:
      java -jar SolarPowerSystemCalculator.jar
      Follow the on-screen instructions.

✅ Option 2: Compile and Run from Source Code
    Navigate to the src folder and run:
      javac *.java
      java Main
    
    **🧪 Example Input**

      Number of appliances: 2
      
      Appliance #1
        Name: LED Bulb
        Power: 10 W
        Quantity: 5
        Hours/day: 6
        
      Appliance #2
        Name: Fan
        Power: 50 W
        Quantity: 2
        Hours/day: 4

      System Parameters:
        Peak Sun Hours: 5
        System Voltage: 12V
        Depth of Discharge: 50%
        Days of Autonomy: 2

    📊 **Example Output**

      Total Daily Energy Consumption: 700 Wh/day
      Required Solar Panel Power: 175 W
      Required Battery Capacity: 2800 Wh
      Battery Capacity: 233.33 Ah
      Recommended Inverter Size: 218.75 W
      Recommended Charge Controller: 18.23 A

    🛡** Input Validation**
      The program ensures:
      All numeric inputs must be positive numbers
      Depth of Discharge is entered as a percentage (e.g., 50 for 50%)
      No invalid or negative system values
      Prevents runtime crashes from incorrect input

**🎯 Project Objectives**

  This project demonstrates:
    
    Object-Oriented Programming (OOP)
    Console-based user interaction
    Mathematical modeling in software
    Structured program flow
    Real-world energy system calculations
    Clean and modular Java design

**🚀 Future Improvements**

  Potential enhancements include:
    
    Graphical User Interface (JavaFX or Swing)
    Solar efficiency loss calculations
    Surge power and peak load calculation
    Cost estimation module
    Export results to PDF
    Web-based implementation
    Real component selection (panels, batteries, inverters)

📄** License**

    This project is open-source and available for educational and personal use.
