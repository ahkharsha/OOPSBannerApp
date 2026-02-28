# OOPS Banner Application

A console-based application that prints a stylized "OOPS" banner. This project evolves through various Java concepts, from basic output to data structures like HashMaps.

## Features Implemented

### UC1: OOPS Banner Display
* Prints the "OOPS" acronym to the console upon execution.
* Demonstrates basic Java class structure and the main method entry point.

### UC2: OOPS Banner Display (ASCII Art)
* Prints a stylized "OOPS" banner to the console using ASCII characters.
* Demonstrates string concatenation to form complex patterns line by line.
* Displays the banner in 7 lines with consistent spacing and alignment.

### UC3: OOPS Banner Display with String.join
* Displays the stylized "OOPS" banner using ASCII art.
* Utilizes `String.join` for cleaner and more efficient string concatenation.
* Maintains the 7-line banner structure with improved code readability.

### UC4: OOPS Banner Display with Arrays and Loops
* Stores the stylized "OOPS" banner lines in a String array.
* Iterates through the array using a for-each loop to print the banner.
* Demonstrates basic data structures and control flow in Java.

### UC5: Inline Array Initialization
* Initializes the banner data directly within the array declaration.
* Simplifies code structure by combining declaration and assignment.
* Iterates through the array to display the banner line by line.

### UC6: Modular Pattern Generation
* Defines dedicated methods (`getOPattern`, `getPPattern`, `getSPattern`) to return ASCII art arrays for each letter.
* Assembles the "OOPS" banner by combining corresponding lines from each letter's pattern array.
* Demonstrates functional decomposition and array manipulation in Java.

### UC7: Inner Class for Character Mapping
* Defines a static inner class `CharacterPatternMap` to associate characters with their ASCII art patterns.
* Dynamically retrieves patterns based on the input character.
* Demonstrates encapsulation and the use of inner classes in Java for structural organization.

### UC8: Pattern Storage with HashMap
* Implements `HashMap<Character, String[]>` to map characters to their ASCII art representations.
* Enables efficient O(1) lookup for character patterns.
* Dynamically constructs the banner line-by-line using `StringBuilder`.
* Demonstrates the use of the Java Collections Framework.

## Tech Stack
* Java

## How to Run
1. Open your terminal or command prompt.
2. Navigate to the project folder.
3. Compile all Java files:
```bash
javac *.java
```

4. Run the application:
```bash
java OOPSBannerApp
```
