package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class City {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Kathmandu", 80000);
        map.put("Bhaktapur", 90000);
        map.put("Lalitpur", 1500000);

        // a. Print city and population
        System.out.println("\n---- List of City and Population ----");
        for (String key : map.keySet()) {
            System.out.println("City: " + key + ", Population: " + map.get(key));
        }

        // b. Total population
        int totalPopulation = 0;
        for (int population : map.values()) {
            totalPopulation += population;
        }
        System.out.println("\nTotal Population: " + totalPopulation);

        // c. Highest population
        String maxCity = "";
        int maxPopulation = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                maxPopulation = entry.getValue();
                maxCity = entry.getKey();
            }
        }
        System.out.println("Highest Population: " + maxCity + " (" + maxPopulation + ")");

        // d. Lowest population
        String minCity = "";
        int minPopulation = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minPopulation) {
                minPopulation = entry.getValue();
                minCity = entry.getKey();
            }
        }
        System.out.println("Lowest Population: " + minCity + " (" + minPopulation + ")");
    }
}