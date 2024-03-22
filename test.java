import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Choose sorting order:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Sorting in ascending order
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            // swap arr[j+1] and arr[j]
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted array in ascending order:");
                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }
                break;

            case 2:
                // Sorting in descending order
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (array[j] < array[j + 1]) {
                            // swap arr[j] and arr[j+1]
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted array in descending order:");
                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}