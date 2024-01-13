package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class challenge5 {

    public static void main(String[] args) {
        String[] input = {"akka", "akak", "baab", "baba", "bbaa"};

        Map<String, List<String>> anagramBuckets = createAnagramBuckets(input);

        // Print the anagram buckets
        for (List<String> bucket : anagramBuckets.values()) {
            System.out.println("Anagram Bucket: " + bucket);
        }
    }

    private static Map<String, List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> anagramBuckets = new HashMap<>();

        for (String word : words) {
            // Sort the characters in the word to create a key for the anagram bucket
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            // If the key is already in the map, add the word to the corresponding bucket
            if (anagramBuckets.containsKey(key)) {
                anagramBuckets.get(key).add(word);
            } else {
                // If the key is not in the map, create a new bucket with the current word
                List<String> bucket = new ArrayList<>();
                bucket.add(word);
                anagramBuckets.put(key, bucket);
            }
        }

        return anagramBuckets;
    }
}

// Create anagram buckets from a given input array of words:input is {"akka", "akak", "baab", "baba", "bbaa"}