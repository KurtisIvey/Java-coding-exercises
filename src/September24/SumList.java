package September24;

import java.util.*;

public class SumList {
    public static int sumNoDuplicates(int[] arr) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> elementCount = new HashMap<>();
        // Initialize the total sum to 0
        int total = 0;
        // Count the occurrences of each element in the array
        for (int num : arr) {
            // Check if the element is already in the map; if not, initialize its count to 0
            // Then, increment the count by 1
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        // Iterate through the input array again and sum unique elements (count == 1)
        for (int num : arr) {
            // Check if the element has a count of 1 (i.e., it's unique in the array)
            if (elementCount.get(num) == 1) {
                // If it's unique, add it to the 'total' sum
                total += num;
            }
        }
        // Return the total sum of unique elements
        return total;
    }
}
