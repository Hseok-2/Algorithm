import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 완주한 사람을 hashMap에 저장
        for(String name : completion) {
            hashMap.put(name, hashMap.getOrDefault(name, 0)+1);
        }

        // hashMap과 참가자를 비교해서 값이 0이면 완주하지 못한 사람.
        for (String name : participant) {
            if (hashMap.getOrDefault(name, 0) == 0) {
                return name;
            }
            hashMap.put(name, hashMap.get(name) - 1);
        }

        return null;
    }
}