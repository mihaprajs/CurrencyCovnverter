import java.io.IOException;
import java.util.Scanner;

public class Converter {
    String currency1;
    String currency2;
    String value;
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
    Converter() throws IOException {
        currency1 = input("Select your currency (use ISO 4217 standard): ");
        currency2 = input("Select the currency you want to convert your money (use ISO 4217 standard): ");
        value = input("Insert amount: ");
        int amount = Integer.parseInt(value);
        if (check(currency1) && check(currency2)){
            double converted = API_Integration.Convert(currency1, currency2, amount);
            if (currency2.equalsIgnoreCase("EUR")){
                System.out.println("€" + String.format("%.2f", converted));
            } else if (currency2.equalsIgnoreCase("USD")) {
                System.out.println("$" + String.format("%.2f", converted));
            } else if (currency2.equalsIgnoreCase("GBP")) {
                System.out.println("£" + String.format("%.2f", converted));
            }else {
                System.out.println("(" + currency2.toUpperCase() + ")" + String.format("%.2f", converted));
            }
        }else {
            System.out.println("Error: You typed wrong code.");
        }
    }
    String input(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        return sc.nextLine();
    }
    boolean check(String currency){
        boolean found = false;
        for (String code : isoCurrencyCodes){
            if (code.equalsIgnoreCase(currency)){
                found = true;
                break;
            }
        }
        return found;
    }
}
