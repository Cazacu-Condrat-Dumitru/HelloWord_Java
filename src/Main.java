import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write the x number");
        int x = input.nextInt();

        /*System.out.println("Write the y number");
        int y = input.nextInt();*/

        double fx;

        if (x < -3) {
            fx = pow(x, 2) + 1;
        } else if ((x >= 0) && (x <= 3)) {
            fx = x - 2;
        } else {
            fx = (2 * pow(x, 2) - 5 * x + 1);
        }
        System.out.println("fx = " + fx);
    }


}