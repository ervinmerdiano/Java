import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0;
        int option;
        double number1, number2;
        
        while (true) {
            System.out.println("\nCalculator - Ervin 2702267086");
            System.out.println("================");
            System.out.println("Total = " + total);
            System.out.println("================\n\n");
            
            System.out.print("Input number: ");
            number1 = sc.nextDouble();
            
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Clear total");
            System.out.println("7. Exit");
            System.out.print("\nOperator [1..7]: ");
            
            option = sc.nextInt();
            
            if (option == 7) {
                System.out.println("\nExiting...");
                break;
            }
            
            if (option == 6) {
                total = 0;
                continue;
            }

            System.out.print("\nInput number: ");
            number2 = sc.nextDouble();
            

            switch (option) {
                case 1:
                    total = number1 + number2;
                    break;
                case 2:
                    total = number1 - number2;
                    break;
                case 3:
                    total = number1 * number2;
                    break;
                case 4:
                    if (number2 != 0) {
                        total = number1 / number2;
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 5:
                    total = number1 % number2;
                    break;
                default:
                    System.out.println("Error");
            }
        }
        sc.close();
    }
}