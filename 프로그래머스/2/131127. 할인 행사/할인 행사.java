import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int cnt = 0; // 회원 등록 날짜 일수 반환
        HashMap<String, Integer> hope = new HashMap<>();
        // 원하는 제품 HashMap으로 초기화
        for (int i = 0; i < number.length; i++) {
            hope.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> eventProduct = new HashMap<>();
            // 10일간 할인 행사 하는 제품 저장하는 HashMap
            for (int j = i; j < i + 10; j++) {
                eventProduct.put(discount[j], eventProduct.getOrDefault(discount[j], 0) + 1);
            }

            if (hope.equals(eventProduct)) {
                cnt++;
            }
        }

        return cnt;
    }
}