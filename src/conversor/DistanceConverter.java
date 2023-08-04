package conversor;

public class DistanceConverter {

	public static double convertDistance(String selectedOption, Double input) {
    
      
            double result = 0.0;
            
            switch (selectedOption) {
            case "Kms to Meters":
                result = input * 1000; // Kms to Meters conversion
                break;
            case "Meters to Kms":
                result = input / 1000; // Meters to Kms conversion
                break;
            case "Inches to Feet":
                result = input / 12; // Inches to Feet conversion
                break;
            case "Feet to Inches":
                result = input * 12; // Feet to Inches conversion
                break;
            case "Meter to Feet":
                result = input * 3.281; // Meter to Feet conversion
                break;
            case "Feet to Meter":
                result = input / 3.281; // Feet to Meter conversion
                break;
            case "Kms to Inches":
                result = input * 39370.1; // Kms to Inches conversion
                break;
            case "Inches to Kms":
                result = input / 39370.1; // Inches to Kms conversion
                break;
            case "Feet to Kms":
                result = input / 3280.84; // Feet to Kms conversion
                break;
            case "Kms to Feet":
                result = input * 3280.84; // Kms to Feet conversion
                break;
            case "Inches to Meter":
                result = input / 39.37; // Inches to Meter conversion
                break;
            case "Meter to Inches":
                result = input * 39.37; // Meter to Inches conversion
                break;
        }
           return result;
           
    }
}
