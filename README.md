# Solution - DVD Details Console Program

This project is a console-based Java application designed to display details of DVDs available for purchase. It demonstrates the use of an abstract class, an interface, inheritance, and encapsulation in Java, following Allman style.

## Project Structure

The program is organized within the `Solution` package and includes the following classes:

- **DVD (Abstract Class)**: Represents a generic DVD with properties like title, year of release, running time, and price. Contains an abstract `setPrice()` method and several getters.
- **iPrintable (Interface)**: Defines a `ShowDetails()` method for displaying DVD information.
- **InstructionalDVD (Subclass)**: Extends `DVD` and implements `iPrintable`, adding a `category` property with its own getter. Implements `setPrice()` and overrides `ShowDetails()` to format the DVD's details.
- **useDVD (Main Class)**: A demonstration class that creates and displays details for two `InstructionalDVD` instances.

## Installation and Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/dvd-collection.git
   ```

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Ensure the project has a Java Development Kit (JDK) installed.

4. Build and run the program through the `useDVD` class to see the sample output.

## Usage

The `useDVD` class demonstrates usage by creating two sample `InstructionalDVD` objects and outputting their details. This setup can be modified to add more DVDs or adjust their attributes.

## Example Output

Running the `useDVD` class displays:

```
Title: Learn Java
Year Released: 2021
Running Time: 120 mins
Category: Education
Price: $29.99

Title: Mastering AI
Year Released: 2022
Running Time: 150 mins
Category: Technology
Price: $39.99
```

## Project Files

- `DVD.java` - Defines the abstract `DVD` class.
- `iPrintable.java` - Interface for showing details.
- `InstructionalDVD.java` - Subclass implementing the interface.
- `useDVD.java` - Main class to test the implementation.

This README provides a quick overview of the program and can be extended for further customization or additional features.
