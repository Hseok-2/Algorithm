import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstWord = br.readLine();
        String secondWord = br.readLine();

        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();

        mapInit(firstWord, firstMap);
        mapInit(secondWord, secondMap);

        int count = getCount(firstMap, secondMap);

        System.out.println(count);
    }

    private static void mapInit(String secondWord, HashMap<Character, Integer> secondMap) {
        for (int i = 0; i < secondWord.length(); i++) {
            char ch = secondWord.charAt(i);
            secondMap.put(ch, secondMap.getOrDefault(ch, 0) + 1);
        }
    }

    private static int getCount(HashMap<Character, Integer> firstMap, HashMap<Character, Integer> secondMap) {
        HashMap<Character, Integer> bigMap = (firstMap.size() >= secondMap.size() ? firstMap : secondMap);
        HashMap<Character, Integer> smallMap = (firstMap.size() >= secondMap.size() ? secondMap : firstMap);

        HashSet<Character> allKeys = new HashSet<>(bigMap.keySet());
        allKeys.addAll(smallMap.keySet());

        int count = 0;
        for (char key : allKeys) {
            int countBig = bigMap.getOrDefault(key, 0);
            int countSmall = smallMap.getOrDefault(key, 0);
            count += Math.abs(countBig - countSmall);
        }

        return count;
    }
}
