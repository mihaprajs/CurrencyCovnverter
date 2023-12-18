# Currency Converter    
### This is a simple command-line currency converter.

## Exchange rates
Exchange rates are updating daly. Only 1,500 API request per month as of limit on free 
plan from [ExchangeRate-API](https://www.exchangerate-api.com/) this program is using.

## How to run this program?
1. You need to have installed Java version 21 or newer on your computer. 
If you don't have it you can download and install it from [OpenJDK](https://openjdk.org/install/), [Oracle](https://www.oracle.com/java/technologies/downloads/) or any other sources.
2. Download Main.java and API_Integration.java files from ./src/java/ folder.
3. In Terminal or any other Command-line app and open the directory where you have the 
.java files located.
4. In the Command-line window type javac Main.java. This will compile the app.
5. Now you can type java Main in the Command-line window and start the program.

## Changelog



### V1.1.0-beta1 19/12/2023
Daly rate updates as of this update.

### V1.0.2 - 18/12/2023
Exchange rates update and build convert from IntelliJ build to Maven build.

### V1.0.1 - 13/12/2023
Very small update, mainly to clean code and to make easier updates to exchange rates.

### V1.0 - 12/12/2023 
1st version. It includes exchange rates for EUR, USD and GBP.
