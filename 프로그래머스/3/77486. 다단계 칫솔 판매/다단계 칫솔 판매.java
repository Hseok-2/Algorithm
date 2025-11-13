import java.util.*;
class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> parent = new HashMap<>();
        // enroll - referral (자식-부모)관계 성립
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }

        // 각 판매원당 이익금 정리
        HashMap<String, Integer> total = new HashMap<>();

        for (int i = 0; i < seller.length; i++) {
            String curName = seller[i]; // 판매원
            int money = amount[i] * 100; // 판매 금액
            while (money > 0 && !curName.equals("-")) { // money가 0 초과이고 부모 노드가 있을때까지 반복
                total.put(curName, total.getOrDefault(curName, 0) + money - (money / 10));
                curName = parent.get(curName); // 다음 부모 노드로 이동
                money /= 10; // 다음 부모 노드의 수익금 10%
            } // total에 판매원, 이익금 정리
        }

        int[] answer = new int[enroll.length]; // 이익금 총합
        
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = total.getOrDefault(enroll[i], 0); // total 해쉬맵의 key의 값을 answer[i]에 넣음    
        }

        return answer;
    }
}