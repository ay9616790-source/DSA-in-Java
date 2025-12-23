import java.util.ArrayList;
public class Arraylist {


    public static void main(String[] args) {
            // Create an ArrayList of Strings
            ArrayList<String> fruits = new ArrayList<>();

            // Adding elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");

            // Display the ArrayList
            System.out.println("Fruits List: " + fruits);

            // Accessing elements by index
            System.out.println("First fruit: " + fruits.get(0));

            // Modifying an element
            fruits.set(1, "Grapes");  // replace "Banana" with "Grapes"
            System.out.println("After modification: " + fruits);

            // Removing an element
            fruits.remove("Mango");
            System.out.println("After removing Mango: " + fruits);

            // Iterating through ArrayList
            System.out.println("Iterating using for-each loop:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            // Size of ArrayList
            System.out.println("Total fruits: " + fruits.size());
        }



}
