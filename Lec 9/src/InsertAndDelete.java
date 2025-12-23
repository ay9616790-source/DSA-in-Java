import java.util.Scanner;

public class InsertAndDelete {

    // Insert function
    static int insertElement(int[] arr, int n, int pos, int value) {
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        return n + 1;
    }

    // Delete function
    static int deleteElement(int[] arr, int n, int pos) {
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, choice, pos, value;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("1. Insert\n2. Delete\nEnter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter position and value to insert: ");
            pos = sc.nextInt();
            value = sc.nextInt();
            n = insertElement(arr, n, pos, value);
        } else if (choice == 2) {
            System.out.print("Enter position to delete: ");
            pos = sc.nextInt();
            n = deleteElement(arr, n, pos);
        }

        System.out.println("Updated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
