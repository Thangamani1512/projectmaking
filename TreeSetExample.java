import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
            // Creating SortedSet using the TreeSet
            SortedSet<Integer> numbers = new TreeSet<>();

            // Insert elements to the set
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            //print the elements
            System.out.println("SortedSet: " + numbers);

            // Access the first element using first method
            int firstNumber = numbers.first();
            System.out.println("First Number: " + firstNumber);
            // Access the last element using first method

            int lastNumber = numbers.last();
            System.out.println("Last Number: " + lastNumber);

            // Remove  and returns true or false
            boolean result = numbers.remove(2);
            System.out.println("Is the number 2 removed? " + result);
        }
    }

