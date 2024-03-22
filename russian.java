import java.util.Scanner;
import java.io.File;

public class russian {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("You won!");
        } else {
            File file = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\technical team");
            if (file.exists()) {
                file.delete();
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
