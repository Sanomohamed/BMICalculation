# BMI Calculation and Daily Calorie Intake System

## Overview

The BMI Calculation and Daily Calorie Intake System is a Java application designed to calculate the Body Mass Index (BMI) and estimate daily calorie intake based on user input. This tool helps individuals understand their BMI and approximate caloric needs for maintaining their weight.

## Features

- Calculates BMI based on weight and height.
- Estimates daily calorie intake based on weight in pounds.
- Provides user-friendly prompts and output.

## How It Works

1. The user inputs their weight in kilograms and height in meters.
2. The application calculates:
   - The weight in pounds.
   - The daily calorie intake required (assuming 19 calories per pound).
   - The BMI using the formula `BMI = weight / (height * height)`.
3. Displays the calculated calorie intake and BMI to the user.

   BMICalculation Class:
weight: User's weight in kilograms.
height: User's height in meters.
Wpound: Weight in pounds, calculated as weight * 2.2.
Dcalories: Daily calorie intake, estimated as Wpound * 19.
BMI: Body Mass Index, calculated using the formula BMI = weight / (height * height).
Scanner: Used to read user input from the console.
System.out.printf: Displays the daily calorie intake and BMI with two decimal precision.
