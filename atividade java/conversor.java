import java.util.Locale;
import java.util.Scanner;

public class conversor {

   
    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe a temperatura em Celsius: ");
            String entrada = sc.nextLine().trim();

        

            double celsius = Double.parseDouble(entrada);
            double fahrenheit = celsiusParaFahrenheit(celsius);

            System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
        } 
        }
    }

    
