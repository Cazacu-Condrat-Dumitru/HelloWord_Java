import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write the x number");
        int x = input.nextInt();

        System.out.println("Write the y number");
        int y = input.nextInt();

        int fx;

        if (y > 0) {
            fx = x + 2;
        } else {
            fx = 2 * x + 7;
        }
        System.out.println("fx = " + fx);
    }


}