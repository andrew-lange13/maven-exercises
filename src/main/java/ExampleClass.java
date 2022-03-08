import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExampleClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = scan.nextLine();
        System.out.println("You Entered: " + userInput);
        try {
            System.out.println("You entered the number " + Integer.parseInt(userInput));
        } catch (NumberFormatException e) {
            System.out.println("\"" + userInput + "\"" + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

}
