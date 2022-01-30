/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitconversion;

/**
 *
 * @author okey
 */
import java.util.Scanner;
public class UnitConversion {
    public static void main (String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.print("Convert from: ");
     String fromUnit = in.nextLine();
     System.out.print("Convert to: ");
     String toUnit = in.nextLine();
     UnitConversion from = new UnitConversion(fromUnit);
     UnitConversion to = new UnitConversion(toUnit);
     
     System.out.print("Value: ");
     double val = in.nextDouble();
     
     double milliliters = from.toMilliliters(val);
     
     
     double converted = to.fromMilliliters(milliliters);
      System.out.println (val + " " + fromUnit + " = " + converted + " " + toUnit);
    
    Temperature t = new Temperature();
    t.temperature_method();
    }
    final private double milliliters_to_centiliters = 1;
    final private double liters_to_milliliters = 1000;
    final private double deciliters_to_milliliters = 100;
    final private double centiliters_to_milliliters = 10;
    final private double gallons_to_milliliters = 3785.41;
    
    
    private double factor;
/**
 * Do a unit conversion between a unit and milliliters
 * 
 * @param unit 
 */
     UnitConversion(String unit)
    {
   
        if (unit.equals("ml"))
        {factor = milliliters_to_centiliters;}
        else if (unit.equals("l"))
        {
            factor = liters_to_milliliters;
        }
        else if (unit.equals("dl"))
        {
            factor = deciliters_to_milliliters;
        }
        else if (unit.equals("cl"))
        {
            factor = centiliters_to_milliliters;
        }
        else if (unit.equals("gal"))
        {
            factor = gallons_to_milliliters;
        }
        
    }
    
    
    
    
    /**
     * Do a unit conversion to milliliters
     * @param measurement
     * @return returns value to milliliters from the unit used
     */
    public double toMilliliters(double measurement)
    {
        return (measurement * factor);
    }
    /**
     * Do a unit conversion from milliliters to the unit used
     * @param measurement
     * @return returns value to the unit used
     */
    public double fromMilliliters(double measurement)
    {
        return (measurement/factor);
    }
    
     
}

class Temperature{
     void temperature_method()
     { 
         double f, c;
         Scanner sc=new Scanner(System.in);
         System.out.println("Choose type of conversion \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit");
         int ch=sc.nextInt();
         switch(ch)
         {
             case 1: System.out.println("Enter Fahrenheit temperature");
             f=sc.nextDouble();
             c=(f-32)*5/9;
             System.out.println("Celsius temperature is = "+c);
             break;
             case 2: System.out.println("Enter Celsius temperature");
             c=sc.nextDouble();
             f=((9*c)/5)+32;
             System.out.println("Fahrenheit temperature is = "+f);
             break;
             default: System.out.println("please choose valid choice");
         }
     }
 }