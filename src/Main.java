import java.util.HashMap;
import java.util.Map;

 public class Main {
    public static void main(String[] args) {

        Map<Integer, String> firstHashMap = new HashMap<>();
        firstHashMap.put(1, "One");
        firstHashMap.put(2, "Two");
        firstHashMap.put(3, "Three");
        firstHashMap.put(4, "Four");
        firstHashMap.put(5, "Five");


        Map<Integer, String> secondHashMap = new HashMap<>();
        secondHashMap.put(1, "Uno");
        secondHashMap.put(3, "Tre");
        secondHashMap.put(5, "Cinque");
        secondHashMap.put(7, "Sette");
        secondHashMap.put(9, "Nove");


        firstHashMap.putAll(secondHashMap);


        System.out.println("Modified HashMap:");
        for (Map.Entry<Integer, String> entry : firstHashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


        int[] keysToCheck = {5, 6, 7, 8, 9};
        System.out.println("\nValues for specified keys:");
        for (int key : keysToCheck) {
            String value = firstHashMap.get(key);
            if (value != null) {
                System.out.println(key + " => " + value);
            } else {
                System.out.println(key + " => No associated value");
            }
        }
    }
}
