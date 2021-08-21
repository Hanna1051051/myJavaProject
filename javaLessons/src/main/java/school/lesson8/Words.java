package school.lesson8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {
    public static void main(String[] args) {

        String[] words = new String[]{"cat", "dog", "bat", "lion", "elephant", "monkey",
                "cat", "dog", "bat", "lion", "elephant", "monkey", "tiger", "cat", "dog",
                "giraffe", "golden fish", "owl", "snake"};

        Map<String, Integer> wordsNew = new HashMap<>();
        List<String> wordsUniq = new ArrayList<>();

        for (String elem : words) {
            if (!wordsNew.containsKey(elem)) {
                wordsNew.put(elem, 1);
                wordsUniq.add(elem);
            } else {
                int count = wordsNew.get(elem);
                wordsNew.put(elem, count + 1);
            }
        }


        for (Map.Entry<String, Integer> o : wordsNew.entrySet()) {
            System.out.println("The word " + o.getKey() + " was mentioned - " + o.getValue() + "times");
        }
        System.out.print("The unique words are  ");
        for (String o : wordsUniq) {
            System.out.print(o + ", ");
        }
    }
}