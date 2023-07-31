package ss10_DSA_stack_queue.bai_tap;
import java.util.TreeMap;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        String str = "This is a sentence. This is another sentence.";


        TreeMap<String, Integer> wordCount = new TreeMap<>();


        String[] words = str.split("[\\s.,;:!?()]+");
        for (String word : words) {

            word = word.toLowerCase();


            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }

            else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + " : " + count);
        }
    }
}
