package conversor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TemperatureConverter {

 
public static double convertTemperature(String selectedOption, Double input) {
       
    
    
    		double result =0.0;
    		
    		switch(selectedOption) {
    		case "Celsius (°C) to Kelvin (K)":
    			result = input + 273.15; // Celsius to Kelvin conversion
    			break;
    		case "Kelvin (K) to Celsius (°C)":
    			result = input - 273.15; // kelvin to Celsius conversion
    			break;
    		case "Celsius(°C) to Fahrenheit(F)":
    			result = (input *9/5)+32; // Celsius to Farenheit 
    		case "Fahrenheit(F) to Celsius (°C)":
    			result = (input -32)*5/9;// Fahrenheit to Celsius
    		 case "Fahrenheit (°F) to Kelvin (K)":
                 result = (input + 459.67) * 5 / 9; // Fahrenheit to Kelvin conversion
                 break;
             case "Kelvin (K) to Fahrenheit (°F)":
                 result = (input * 9 / 5) - 459.67; // Kelvin to Fahrenheit conversion
                 break;	
    		}
             
    		 return result;
                    
       
    }

	
	

}
