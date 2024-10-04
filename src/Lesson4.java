public class Lesson4 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------------------------------");
        int j = 11;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("---------------------------------------------");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
