import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "orange", "apple", "kiwi",
                "banana", "kiwi", "grape", "apple", "orange",
                "peach", "banana", "grape", "kiwi", "peach",
                "apple", "orange", "banana", "kiwi"
        };


        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());

        System.out.println("Уникальные слова и их количество:");

        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
