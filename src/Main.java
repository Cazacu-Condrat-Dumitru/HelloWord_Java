import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write an integer number");
        int number = input.nextInt();
        System.out.println("The integer number is: " + number);

        System.out.println("Write an float number");
        float numFloat = input.nextFloat();
        System.out.println("The float number is: " + numFloat);

    }


}