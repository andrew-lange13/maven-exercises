import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExampleClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = scan.nextLine();
        System.out.println("You Entered: " + userInput);
        System.out.println(StringUtils.reverse(userInput));
    }

}
