# Currency Converter    
### This is a simple command-line currency converter.
   
## Exchange rates
Exchange rates are updating daly. Only 1,500 API requests per month as of limit on free 
plan from [ExchangeRate-API](https://www.exchangerate-api.com/) this program is using.

## How to run this program?
### Using UI (main usage)
1.  You need to have installed Java version 21 or newer on your computer. If you don't have it, you can download and
install it from [OpenJDK](https://openjdk.org/install/), [Oracle](https://www.oracle.com/java/technologies/downloads/) or any other sources.
You also need internet connection, otherwise the exchange rates CANNOT be obtained!
2. Download .jar file form "Releases" tab.
3. In the Terminal or any other Command-line app type or copy this command:
   ```cmd
   java -jar /PATH/TO/JAR_FILE/
   ```
   and replace /PATH/TO/JAR_FILE/ with an actual path to .jar file.
4. Now you can start using the program.

### Without using UI (alternative usage)
1. You need to have installed Java version 21 or newer on your computer. If you don't have it, you can download and 
install it from [OpenJDK](https://openjdk.org/install/), [Oracle](https://www.oracle.com/java/technologies/downloads/) or any other sources. 
You also need internet connection, otherwise the exchange rates CANNOT be obtained!
2. Download .jar file form "Releases" tab.
3. In the Terminal or any other Command-line app type or copy this command:
   ```cmd
   java -jar -no-gui /PATH/TO/JAR_FILE/
   ```
   and replace /PATH/TO/JAR_FILE/ with an actual path to .jar file.
4. Now you can start using the program.

**You may run into problems using Command Prompt (cmd) on Windows. They are related to the character encoding used by default.**

## Changelog

### V2.0.0 21/03/2024
Full release of the program. 
Convert button is now working using its own ActionListener.
Code in the command-line version is modified consistency.

### V2.0.0-beta2 20/03/2024
Changes to MANIFEST.MF so that the .jar works now.

### V2.0.0-beta1 20/03/2024
**GUI** is now part of the program.   

### V1.1.2 05/01/2024
Refactored code to be more readable and a few small changes to code.

### V1.1.1 26/12/2023
Added check for correct currency code (ISO 4217 standard).
It replaces previously used check for length.
Now you can download and run .jar file.

### V1.1.0 20/12/2023
Added check for invalid currency code length.

### V1.1.0-beta1 19/12/2023
API implementation in this update.
Daly rate updates as of this update.
You can use more currencies for calculations. 
If the selected currency hasn't got assigned symbol,
you will see selected [ISO 4217 code](https://en.wikipedia.org/wiki/ISO_4217)
in brackets.

### V1.0.2 - 18/12/2023
Exchange rates update and build convert from IntelliJ build to Maven build.

### V1.0.1 - 13/12/2023
Tiny update, mainly to clean code and to make easier updates to exchange rates.

### V1.0.0 - 12/12/2023 
First version. It includes exchange rates for EUR, USD and GBP.