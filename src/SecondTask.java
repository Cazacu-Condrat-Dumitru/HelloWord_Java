import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        /*Scrieți un program care să permită alegerea unei opțiuni dintr-un
         anumit meniu afișat pe ecran: se afișează meniul:
            1.  suma
            2.  produs*/

        Scanner scanner = new Scanner(System.in);
        int option;
        double number1, number2, result;

        System.out.println("\nSelect one of the available options (1 or 2): ");
        System.out.println("1. Sum");
        System.out.println("2. Multiplication");
        option = scanner.nextInt();

        System.out.print("Write the first number: ");
        number1 = scanner.nextDouble();
        System.out.print("Write the second number: ");
        number2 = scanner.nextDouble();

        switch (option) {
            case 1:
                result = number1 + number2;
                System.out.println("The result of the sum is: " + result);
                break;
            case 2:
                result = number1 * number2;
                System.out.println("The result of the multiplication is: " + result);
                break;
            default:
                System.out.println("Error. Please choose option 1 or 2");
                break;
        }
    }
}
