import java.util.Scanner;

public class CombinedTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        String[] name = new String[size];
        int length = 0;

        for (int i = 0; i < size; i++) {
            name[i] = sc.nextLine();
            length = name[i].length();
        }

        System.out.println(length);
    }
}
