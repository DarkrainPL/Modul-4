import java.util.HashMap;

public class Zadanie3 {

        public HashMap<String, Integer> countWords(String word) {

        HashMap<String, Integer> wordMap = new HashMap<>();

        word = word.replaceAll(",", "");
        word = word.replaceAll("\\.", "");
        String[] stringToArray = word.split("\\s+");

        for (int i = 0; i < stringToArray.length; i++) {
            if (wordMap.containsKey(stringToArray[i])) {
                wordMap.merge(stringToArray[i], 1, Integer::sum);

            } else {
                wordMap.put(stringToArray[i], 1);
            }
        }
        System.out.println(wordMap);
        return wordMap;
    }
}







