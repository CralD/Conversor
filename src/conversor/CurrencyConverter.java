package conversor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CurrencyConverter{
	 
	

	public static double convertCurrency(String selectedOption,Double input) {
		
		
      
            
          
            double result = 0.0;

            switch (selectedOption) {
                case "Pesos to US Dolar":
                     result = input * 0.00024387595;
                     break;
                case "Pesos to Korean Won ":
                    result = input * 0.31810795;
                    break;
                case "Pesos to Euro ":
                    result = input * 0.00022133751 ; 
                    break;
                case "Pesos to Japanese Yen":
                    result = input * 0.034568927; 
                    break;
                case "Pesos to Russian Ruble ":
                    result = input * 0.023385644; 
                    break;
                case "Pesos to Pound Sterling":
                    result = input * 0.00019167991; 
                    break;
                case "US Dolar to Pesos":
                    result = input * 4099; 
                    break;
                case "Korean Won to Pesos":
                    result = input * 3129; 
                    break;
                case "Euro to Pesos":
                    result = input * 4496; 
                    break;
                case "Japanese Yen to Pesos":
                    result = input * 28.79777; 
                    break;
                case "Russian Ruble to Pesos":
                    result = input * 42.573966;
                    break;
                case "Pound Sterling to Pesos":
                    result = input * 5225;
                    break;
            }
            
             return result;
            
        
    }
	
	

}
