public class Lesson4 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {i++;
            if (i == 4){
                /*break;*/
                continue;
            }
            System.out.println(i);

        }
        System.out.println("---------------------------------------------");
        int j = 11;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("---------------------------------------------");
        for (i = 20; i >= 10; i--) {
            System.out.println(i);
        }
    }
}
