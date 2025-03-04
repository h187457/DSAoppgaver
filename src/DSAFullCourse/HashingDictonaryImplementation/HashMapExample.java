package DSAFullCourse.HashingDictonaryImplementation;

import java.util.HashMap; // Import HashMap from Java's collections framework

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Retrieving values from the map using keys
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Bob"));

        // Checking if a key exists
        if (map.containsKey("Charlie")) {
            System.out.println("Charlie's age: " + map.get("Charlie"));
        }

        // Removing a key-value pair
        map.remove("Alice");

        // Printing the final map
        System.out.println("Final HashMap: " + map);
    }
}

/*
  Explanation of HashMap:

  - A HashMap is a dictionary-like data structure that stores key-value pairs.
  - Hashing uses a hash function to map keys to specific locations in an internal array.
  - The `put()` method adds a key-value pair, `get()` retrieves a value by its key, and `remove()` deletes a key-value pair.

  - Time Complexity for basic operations (`put()`, `get()`, `remove()`) is O(1) on average, but it can degrade to O(n) in the worst case (when many collisions happen).
  - HashMaps are efficient for fast lookups but require a good hash function to minimize collisions.
*/
