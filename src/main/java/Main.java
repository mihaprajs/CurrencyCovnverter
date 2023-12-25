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

        String[] isoCurrencyCodes = {
                "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN",
                "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BOV",
                "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHE", "CHF",
                "CHW", "CLF", "CLP", "CNY", "COP", "COU", "CRC", "CUC", "CUP", "CVE",
                "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD",
                "FKP", "FOK", "GBP", "GEL", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD",
                "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD", "IRR",
                "ISK", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW",
                "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD",
                "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK",
                "MXN", "MXV", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD",
                "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON",
                "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP",
                "SLL", "SOS", "SRD", "SSP", "STN", "SVC", "SYP", "SZL", "THB", "TJS",
                "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD",
                "USN", "UYI", "UYU", "UZS", "VES", "VND", "VUV", "WST", "XAF", "XCD",
                "XDR", "XOF", "XPF", "XSU", "XUA", "YER", "ZAR", "ZMW", "ZWL"
        };

        boolean found1 = false;
        for (String code : isoCurrencyCodes) {
            if (code.equalsIgnoreCase(originalCurrency)){
                found1 = true;
                break;
            }
        }

        boolean found2 = false;
        for (String code : isoCurrencyCodes) {
            if (code.equalsIgnoreCase(newCurrency)){
                found2 = true;
                break;
            }
        }

        if (found1 && found2){
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
        }else {
            System.out.println("Error: You typed wrong code.");
        }
    }
}