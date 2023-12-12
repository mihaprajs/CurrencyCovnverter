import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner valueReader = new Scanner(System.in);
        System.out.print("Select your currency (use ISO 4217 standard): ");
        String originalCurrency = valueReader.nextLine();

        Scanner newValue = new Scanner(System.in);
        System.out.print("Select the currency you want to convert your money (use ISO 4217 standard): ");
        String newCurrency = newValue.nextLine();

        if (originalCurrency.equalsIgnoreCase("eur")){
            if (newCurrency.equalsIgnoreCase("usd")){
                Scanner euroToDollar = new Scanner(System.in);
                System.out.print("Insert value: ");
                System.out.println();
                int convert = euroToDollar.nextInt();
                double value = convert * 1.08;
                System.out.println("$" + value);
            } else if (newCurrency.equalsIgnoreCase("gbp")) {
                Scanner euroToUKPound = new Scanner(System.in);
                System.out.print("Insert value: ");
                System.out.println();
                int convert = euroToUKPound.nextInt();
                double value = convert * .86;
                System.out.println("£" + value);
            }else System.out.println("We currently don't have data for this currency.");
        } else if (originalCurrency.equalsIgnoreCase("usd")) {
            if (newCurrency.equalsIgnoreCase("eur")){
                Scanner dollarToEuro = new Scanner(System.in);
                System.out.print("Insert value: ");
                System.out.println();
                int convert = dollarToEuro.nextInt();
                double value = convert * .92;
                System.out.println("€" + value);
            } else if (newCurrency.equalsIgnoreCase("gbp")) {
                Scanner dollarToUKPound = new Scanner(System.in);
                System.out.print("Insert value: ");
                System.out.println();
                int convert = dollarToUKPound.nextInt();
                double value = convert * .80;
                System.out.println("£" + value);
                System.out.println(convert*.80);
            }else System.out.println("We currently don't have data for this currency.");
        } else if (originalCurrency.equalsIgnoreCase("gbp")) {
            if (newCurrency.equalsIgnoreCase("eur")){
                Scanner UKPoundToEuro = new Scanner(System.in);
                System.out.print("Insert value: ");
                System.out.println();
                int convert = UKPoundToEuro.nextInt();
                double value = convert * 1.16;
                System.out.println("€" + value);
            } else if (newCurrency.equalsIgnoreCase("usd")) {
                Scanner UKPoundToDollar = new Scanner(System.in);
                System.out.print("Insert value: ");
                System.out.println();
                int convert = UKPoundToDollar.nextInt();
                double value = convert * 1.26;
                System.out.println("$" + value);
            }else System.out.println("We currently don't have data for this currency.");
        }

    }
}