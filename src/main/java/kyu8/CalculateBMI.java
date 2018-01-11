/*
Write function bmi that calculates body mass index (bmi = weight / height ^ 2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
 */
package kyu8;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) return "Underweight";
        if (bmi > 18.5 && bmi <= 25.0) return "Normal";
        if (bmi > 25.0 && bmi <= 30.0) return "Overweight";
        if (bmi > 30) return "Obese";
        return null;
    }

    public static String bmi2(double weight, double height) {
        double bmi = weight/(height*height);
        return bmi>30.0 ? "Obese" : bmi<=30.0 && bmi>25.0 ? "Overweight" : bmi<=18.5 ? "Underweight" : "Normal";
    }
}
