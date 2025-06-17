import java.util.LinkedHashSet;

public class CityExample {

    public static void main(String[] args) {
            // LinkedHashSet of Strings
            LinkedHashSet<String> cities = new LinkedHashSet<>();

            // Add elements
            cities.add("Delhi");
            cities.add("Mumbai");
            cities.add("Chennai");
            cities.add("Mumbai"); // Duplicate, will not be added
            cities.add("Kolkata");

            // Display elements
            System.out.println("Cities in LinkedHashSet:");
            for (String city : cities) {
                System.out.println(city);
            }
        }
    }

