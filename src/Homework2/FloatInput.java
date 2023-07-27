package Homework2;

import java.util.Scanner;

public class FloatInput {
    public float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        Float number = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a float number: ");
                String input = scanner.nextLine().replace(',', '.');
                number = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error. Please enter a float number.");
            }
        }

        return number;
    }
}
