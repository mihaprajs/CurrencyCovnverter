import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ogCurrency = new Scanner(System.in);
        System.out.print("Select your currency (use ISO 4217 standard): ");
        String originalCurrency = ogCurrency.nextLine();

        Scanner nCurrency = new Scanner(System.in);
        System.out.print("Select the currency you want to convert your money (use ISO 4217 standard): ");
        String newCurrency = nCurrency.nextLine();

        Scanner amount = new Scanner(System.in);
        System.out.print("Insert amount: ");
        double value = amount.nextDouble();

        if (originalCurrency.length() != 3 || newCurrency.length() != 3){
            System.out.println("Error: You selected wrong code. Please ensure that your input is 3 exactly letters long.");
        }else {
            double converted = API_Integration.Convert(originalCurrency, newCurrency, value);
            if (newCurrency.equalsIgnoreCase("EUR")){
                System.out.println("€" + String.format("%.2f", converted));
            } else if (newCurrency.equalsIgnoreCase("USD")) {
                System.out.println("$" + String.format("%.2f", converted));
            } else if (newCurrency.equalsIgnoreCase("GBP")) {
                System.out.println("£" + String.format("%.2f", converted));
            }else {
                System.out.println("(" + newCurrency.toUpperCase() + ")" + String.format("%.2f", converted));
            }
        }
    }
}