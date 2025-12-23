
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to input marks OR 0 to stop:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter marks (out of 100):");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Enter only 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program Stopped.");
    }
}

