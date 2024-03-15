import java.util.HashMap;
import java.util.Map;

public class hash_structure {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph for demonstrating a hash-based string search.";
        Map<Integer, String> hashTable = new HashMap<>();

        // Populate the hash table with the words from the paragraph
        for (String word : paragraph.split("\\s")) {
            int hashCode = word.hashCode();
            hashTable.put(hashCode, word);
        }

        // Look up a word in the hash table
        String target = "demonstrating";
        int targetHashCode = target.hashCode();
        if (hashTable.containsKey(targetHashCode)) {
            String foundWord = hashTable.get(targetHashCode);
            if (foundWord.equals(target)) {
                System.out.println("Found word: " + target);
            }
        }
    }
}