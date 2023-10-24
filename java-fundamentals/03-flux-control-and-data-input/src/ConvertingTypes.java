import java.util.Scanner;

public class ConvertingTypes {
    public static void main(String[] args) {
        short smallIntNumber = 10;
        int intNumber = smallIntNumber;
        long bigIntNumber = intNumber;
        float numberFloat = intNumber;
        double numberFloatDouble = intNumber;

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // String firstInput = scanner.next();
        // System.out.println("Enter the second number: ");
        // String secondInput = scanner.next();

        // int n1 = Integer.parseInt(firstInput);
        // int n2 = Integer.parseInt(secondInput);

        // int result = n1 + n2;
        // System.out.println("The result is: " + result);


        int number = 5;
        System.out.println(number == 5);

        String hello = "hello";
        System.out.println("Say hello: ");
        String input = scanner.next();

        if(hello == input) {
            System.out.println("This will not shown");
        }

        if(hello != input) {
            System.out.println("This will shown");
        }

        if(hello == hello) {
            System.out.println("This will also be shown");
        }

        if(hello.equals(input)) {
            System.out.println("This will also be shown if hello is put in the terminal");
        }

        scanner.close();
    }
}
