package conversor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsPage extends JFrame {
    private JPanel mainPanel;
    private JButton temperatureButton;
    private JButton currencyButton;
    private JButton distanceButton;
    private JTextField inputField;
    private JLabel infoLabel;
    private JLabel typeLabel;
    private JLabel TypeLabel1;
    private JComboBox<String> distanceComboBox;
    private JComboBox<String> temperatureComboBox;
    private JComboBox<String> currencyComboBox;
    private JLabel outputLabel;
    JPanel buttonPanel = new JPanel();
    private JPanel seconPanel;
    private JPanel firstPanel;

    public OptionsPage() {
        setTitle("Conversion App");
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,1));
        setResizable(false);
              
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        seconPanel = new JPanel();
        firstPanel = new JPanel();
        
       
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
     
        temperatureButton = new JButton("Temperature");   
        temperatureButton.setFont(new Font("Arial", Font.PLAIN, 20));
        temperatureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTemperatureConversion();
            }
        });
        
       
        
        
        currencyButton = new JButton("Currency");
        currencyButton.setFont(new Font("Arial", Font.PLAIN, 23));
        currencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCurrencyConversion();
            }
        });

        distanceButton = new JButton("Distance");
        distanceButton.setFont(new Font("Arial", Font.PLAIN, 23));
        distanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDistanceConversion();
            }
        });
        
        buttonPanel.add(temperatureButton); // Add the temperatureButton to the buttonPanel
        buttonPanel.add(currencyButton); // Add the currencyButton to the buttonPanel
        buttonPanel.add(distanceButton); // Add the distanceButton to the buttonPanel
    
       

        inputField = new JTextField(10);
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));
        infoLabel = new JLabel("¿What do you want to convert?");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setHorizontalTextPosition(JLabel.CENTER);
        infoLabel.setHorizontalAlignment(JLabel.CENTER);
        infoLabel.setVerticalAlignment(JLabel.CENTER);
        infoLabel.setFont(new Font("Arial",Font.PLAIN,30));
        infoLabel.setOpaque(true);

        typeLabel = new JLabel("Type:");
        typeLabel.setForeground(Color.RED);
     
        
        TypeLabel1 = new JLabel(" ");
        TypeLabel1.setFont(new Font("Arial",Font.PLAIN,20));
        TypeLabel1.setForeground(Color.BLUE);

       

        outputLabel = new JLabel("Result will be shown here");
        outputLabel.setForeground(Color.BLACK);
        outputLabel.setHorizontalAlignment(JLabel.CENTER);
        outputLabel.setFont(new Font("Arial",Font.PLAIN,20));
        this.add(firstPanel);
        this.add(mainPanel);
        this.add(seconPanel);
        this.add(buttonPanel);
        mainPanel.add(infoLabel);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void UpdateTypeLabelTemp() {
    	 String selectedOption= (String) temperatureComboBox.getSelectedItem();
    	 if (selectedOption.equals("Celsius (°C) to Kelvin (K)")) {
             
             TypeLabel1.setText("Kelvin");
         }else if (selectedOption.equals("Kelvin (K) to Celsius (°C)")) {
            
             TypeLabel1.setText("Celsius");
         }else if (selectedOption.equals("Celsius(°C) to Fahrenheit(F)")) {
            
             TypeLabel1.setText("Fahrenheit");
         }else if (selectedOption.equals("Fahrenheit(F) to Celsius (°C)")) {
            
             TypeLabel1.setText("Celsius");
         }else if (selectedOption.equals("Fahrenheit (°F) to Kelvin (K)")) {
            
             TypeLabel1.setText("Kelvin");
         }else if (selectedOption.equals("Kelvin (K) to Fahrenheit (°F)")) {
            
             TypeLabel1.setText("Fahrenheit");
         }
    }

    private void updateTypeLabel() {
        String selectedOption = (String) distanceComboBox.getSelectedItem();
       
        if (selectedOption.equals("Kms to Meters")) {
           
            TypeLabel1.setText("Mts");
        } else if (selectedOption.equals("Meters to Kms")) {
           
            TypeLabel1.setText("Kms");
        }else if (selectedOption.equals("Inches to Feet")) {
           
            TypeLabel1.setText("Feets");
        }else if (selectedOption.equals("Feet to Inches")) {
           
            TypeLabel1.setText("Inches");
        }else if (selectedOption.equals("Meter to Feet")) {
           
            TypeLabel1.setText("Feets");
        }else if (selectedOption.equals("Feet to Meter")) {
           
            TypeLabel1.setText("Meters");
        }else if (selectedOption.equals("Kms to Inches")) {
           
            TypeLabel1.setText("Inches");
        }else if (selectedOption.equals("Inches to Kms")) {
           
            TypeLabel1.setText("Kms");
        }else if (selectedOption.equals("Feet to Kms")) {
           
            TypeLabel1.setText("Kms");
        }else if (selectedOption.equals("Kms to Feet")) {
           
            TypeLabel1.setText("Feets");
        }else if (selectedOption.equals("Inches to Meter")) {
           
            TypeLabel1.setText("Mts");
        }else if (selectedOption.equals("Meter to Inches")) {
           
            TypeLabel1.setText("Inches");
        }
    }
    private void UpdateTypeLabelCurrency() {
   	 String selectedOption= (String) currencyComboBox.getSelectedItem();
   	 if (selectedOption.equals("Pesos to Korean Won ")) {
            
            TypeLabel1.setText("Wons");
        }else if (selectedOption.equals("Pesos to Euro ")) {
           
            TypeLabel1.setText("Euros");
        }else if (selectedOption.equals("Pesos to Japanese Yen")) {
           
            TypeLabel1.setText("Yens");
        }else if (selectedOption.equals("Pesos to Russian Ruble ")) {
           
            TypeLabel1.setText("Rubles");
        }else if (selectedOption.equals("Pesos to Pound Sterling")) {
           
            TypeLabel1.setText("Sterlings");
        }else if (selectedOption.equals("Pesos to US Dolar")) {
           
            TypeLabel1.setText("Dolars");
        }else if (selectedOption.equals("US Dolar to Pesos")) {
           
            TypeLabel1.setText("Pesos");
        }else if (selectedOption.equals("Korean Won to Pesos")) {
           
            TypeLabel1.setText("Pesos");
        }else if (selectedOption.equals("Euro to Pesos")) {
           
            TypeLabel1.setText("Pesos");
        }else if (selectedOption.equals("Japanese Yen to Pesos")) {
           
            TypeLabel1.setText("Pesos");
        }else if (selectedOption.equals("Russian Ruble to Pesos")) {
           
            TypeLabel1.setText("Pesos");
        }else if (selectedOption.equals("Pound Sterling to Pesos")) {
           
            TypeLabel1.setText("Pesos");
        }
   }

    private void showTemperatureConversion() {
        mainPanel.removeAll();
        mainPanel.setLayout(new FlowLayout());
        buttonPanel.removeAll();
        buttonPanel.setLayout(new FlowLayout());

        JLabel temperatureLabel = new JLabel("Value");
        temperatureLabel.setFont(new Font("arial", Font.PLAIN,16));
        mainPanel.add(temperatureLabel);
        mainPanel.add(inputField);
        
        temperatureComboBox = new JComboBox<>();
        temperatureComboBox.setFont(new Font("Arial",Font.PLAIN,16));
        temperatureComboBox.addItem("Celsius (°C) to Kelvin (K)");
        temperatureComboBox.addItem("Kelvin (K) to Celsius (°C)");
        temperatureComboBox.addItem("Celsius(°C) to Fahrenheit(F)");
        temperatureComboBox.addItem("Fahrenheit(F) to Celsius (°C)");
        temperatureComboBox.addItem("Fahrenheit (°F) to Kelvin (K)");
        temperatureComboBox.addItem("Kelvin (K) to Fahrenheit (°F)");
        temperatureComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	UpdateTypeLabelTemp();
            }
        });
        temperatureComboBox.setSelectedIndex(0);
        
        mainPanel.add(temperatureComboBox);

        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("arial", Font.PLAIN,20));
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	  convertTemperature(temperatureComboBox.getSelectedItem().toString());
            	  int choice = showConfirmationDialog();
                  if (choice == JOptionPane.YES_OPTION) {
                      showMainPanel();
                      inputField.setText("");
                      outputLabel.setText("Result will be shown here");
                      
                  } else {
                      System.exit(0);
                  }
              }
          });
          seconPanel.add(convertButton);
          buttonPanel.add(outputLabel);
          buttonPanel.add(TypeLabel1);
        

          mainPanel.revalidate();
          mainPanel.repaint();
          buttonPanel.revalidate();
          buttonPanel.repaint();
          seconPanel.revalidate();
          seconPanel.repaint();
    }

    private void showCurrencyConversion() {
    	mainPanel.removeAll();
        mainPanel.setLayout(new FlowLayout());
        buttonPanel.removeAll();
        buttonPanel.setLayout(new FlowLayout());

        JLabel currencyLabel = new JLabel("Value:");
        currencyLabel.setFont(new Font("arial", Font.PLAIN,16));
        mainPanel.add(currencyLabel);
        mainPanel.add(inputField);
        
        currencyComboBox = new JComboBox<>();
        currencyComboBox.setFont(new Font("Arial",Font.PLAIN,16));
        currencyComboBox.addItem("Pesos to US Dolar");
        currencyComboBox.addItem("Pesos to Korean Won ");
        currencyComboBox.addItem("Pesos to Euro ");
        currencyComboBox.addItem("Pesos to Japanese Yen");
        currencyComboBox.addItem("Pesos to Russian Ruble ");
        currencyComboBox.addItem("Pesos to Pound Sterling");
        currencyComboBox.addItem("US Dolar to Pesos");
        currencyComboBox.addItem("Korean Won to Pesos");
        currencyComboBox.addItem("Euro to Pesos");
        currencyComboBox.addItem("Japanese Yen to Pesos");
        currencyComboBox.addItem("Russian Ruble to Pesos");
        currencyComboBox.addItem("Pound Sterling to Pesos");
        currencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	UpdateTypeLabelCurrency();
            }
        });
        currencyComboBox.setSelectedIndex(0);
        
        mainPanel.add(currencyComboBox);

        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("arial", Font.PLAIN,20));
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 convertCurrency(currencyComboBox.getSelectedItem().toString());
                int choice = showConfirmationDialog();
                if (choice == JOptionPane.YES_OPTION) {
                    showMainPanel();
                    inputField.setText("");
                    outputLabel.setText("Result will be shown here");
                   
                } else {
                    System.exit(0);
                }
            }
        });
        seconPanel.add(convertButton);
        buttonPanel.add(outputLabel);  
        buttonPanel.add(TypeLabel1);
        mainPanel.revalidate();
        mainPanel.repaint();
        buttonPanel.revalidate();
        buttonPanel.repaint();
        seconPanel.revalidate();
        seconPanel.repaint();
    }

    private void showDistanceConversion() {
    	mainPanel.removeAll();
        mainPanel.setLayout(new FlowLayout());
        buttonPanel.removeAll();
        buttonPanel.setLayout(new FlowLayout());

        JLabel distanceLabel = new JLabel("Value:");
        distanceLabel.setFont(new Font("arial", Font.PLAIN,16));
        mainPanel.add(distanceLabel);
        mainPanel.add(inputField);
       
        
        distanceComboBox = new JComboBox<>();
        distanceComboBox.setFont(new Font("Arial",Font.PLAIN,16));
        distanceComboBox.addItem("Kms to Meters");
        distanceComboBox.addItem("Meters to Kms");
        distanceComboBox.addItem("Inches to Feet");
        distanceComboBox.addItem("Feet to Inches");
        distanceComboBox.addItem("Meter to Feet");
        distanceComboBox.addItem("Feet to Meter");
        distanceComboBox.addItem("Kms to Inches");
        distanceComboBox.addItem("Inches to Kms");
        distanceComboBox.addItem("Feet to Kms");
        distanceComboBox.addItem("Kms to Feet");
        distanceComboBox.addItem("Inches to Meter");
        distanceComboBox.addItem("Meter to Inches");
        distanceComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTypeLabel();
            }
        });

        distanceComboBox.setSelectedIndex(0); // Set default to "Kms to Meters"
        mainPanel.add(distanceComboBox);

        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("arial", Font.PLAIN,20));
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	convertDistance(distanceComboBox.getSelectedItem().toString());
                int choice = showConfirmationDialog();
                if (choice == JOptionPane.YES_OPTION) {
                    showMainPanel();
                    inputField.setText("");
                    outputLabel.setText("Result will be shown here");
                   

                } else {
                    System.exit(0);
                }
            }
        });   
        seconPanel.add(convertButton);
        buttonPanel.add(outputLabel);
        buttonPanel.add(TypeLabel1);
        

        mainPanel.revalidate();
        mainPanel.repaint();
        buttonPanel.revalidate();
        buttonPanel.repaint();
        seconPanel.revalidate();
        seconPanel.repaint();
    }
    
    private void convertTemperature(String selectedOption) {
       
    	
    	try {
    		double input = Double.parseDouble(inputField.getText());
    		
    		double result = TemperatureConverter.convertTemperature(selectedOption, input);
    		
    		       
            outputLabel.setText("Result: " + String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            outputLabel.setText("Please enter a valid Temperature.");
        }
    }

    private void convertCurrency(String selectedOption) {
        try {
            double input = Double.parseDouble(inputField.getText());
         
            double result = CurrencyConverter.convertCurrency(selectedOption, input);
            
            outputLabel.setText("Result: " + String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            outputLabel.setText("Please enter a valid currency.");
        }
    }

    private void convertDistance(String selectedOption) {
        try {
            double input = Double.parseDouble(inputField.getText());
            
            double result = DistanceConverter.convertDistance(selectedOption, input);
            
            outputLabel.setText("Result: " + String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            outputLabel.setText("Please enter a valid number for distance.");
        }
    }
    private int showConfirmationDialog() {
    	 JPanel panel = new JPanel();
         JLabel messageLabel = new JLabel("Do you want to continue or exit the program?");
         messageLabel.setForeground(Color.BLACK);
         messageLabel.setFont(new Font("Arial",Font.PLAIN,14));
         panel.add(messageLabel);

         int choice = JOptionPane.showOptionDialog(firstPanel,
                 panel,
                 "Confirmation",
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE,
                 null,
                 new Object[]{"Continue", "Exit"},
                 "Continue");
         
         return choice;
     }
    private void showMainPanel() {
        mainPanel.removeAll();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(infoLabel);
        buttonPanel.removeAll();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(temperatureButton); // Add the temperatureButton to the buttonPanel
        buttonPanel.add(currencyButton); // Add the currencyButton to the buttonPanel
        buttonPanel.add(distanceButton); // Add the distanceButton to the buttonPanel
        seconPanel.removeAll();
        seconPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.revalidate();
        mainPanel.repaint();
        buttonPanel.revalidate();
        buttonPanel.repaint();
        seconPanel.revalidate();
        seconPanel.repaint();
    }

    
}