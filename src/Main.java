import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Un robot se poate deplasa în 4 direcții (“S”-Sud, “N”-Nord, ”E”-Est, “V”-Vest)
    // și poate îndeplini 3 instrucțiuni: 0- continuă deplasarea,
    // 1 - la stânga, 2 - la dreapta.
    // De la tastieră se introduce simbolul direcției inițiale
    // a robotului și instrucțiunea ce trebuie îndeplinită.
    // Să se afișeze direcția de deplasare a robotului după îndeplinirea instrucțiunii
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the initial direction of the robot");
        String direction = String.valueOf(sc.next());

        switch (direction) {
            case "North":
                System.out.println("The initial direction is North");
                break;
            case "East":
                System.out.println("The initial direction is East");
                break;
            case "South":
                System.out.println("The initial direction is South");
                break;
            case "West":
                System.out.println("The initial direction is West");
                break;
            default:
                System.out.println("Invalid direction");
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Write in what direction the robot should move:");
        int x = input.nextInt();

        switch (x) {
            case 0:
                System.out.println("The robot will continue to move to" + direction);
                break;
            case 1:
                System.out.println("The robot turned to the Left");
                break;
            case 2:
                System.out.println("The robot turned to the Right");
                break;
            default:
                System.out.println("Error");
        }


    }
}