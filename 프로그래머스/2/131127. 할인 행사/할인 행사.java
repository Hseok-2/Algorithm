import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();

        // 원하는 제품 hashMap에 초기화
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int register = 0; // 회원 등록 총 일수 계산

        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> discountMap = new HashMap<>();

            // 원하는 제품이 할인 품목에 있다면 discountMap에 저장
            for (int j = i; j < i + 10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
                }
            }

            // 원하는 제품과 마트 할인 품목이 같다면 일수 +1
            if (wantMap.equals(discountMap)) {
                register++;
            }
        }
        return register;
    }
} 