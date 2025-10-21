import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // key: 신고당한 사람, value: {신고한 사람들 Set}
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();

        for (String s : report) {
            String[] names = s.split(" ");
            String reporter = names[0]; // 신고한 사람
            String reported = names[1]; // 신고 당한 사람
            
            // 해당 key가 없다면 초기화
            reportMap.putIfAbsent(reported, new HashSet<>());

            reportMap.get(reported).add(reporter);
        }

        int[] answer = new int[id_list.length];
        
        // id_list의 이름과 배열 인덱스를 매핑(순서 보장)
        HashMap<String, Integer> idIndexMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIndexMap.put(id_list[i], i);
        }
        
        // 신고 내역 순회하면서 정지 대상 확인, 메일 처리 결과 누적
        for (String reported : reportMap.keySet()) {
            
            // 신고한 사람들
            HashSet<String> reporters = reportMap.get(reported);

            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int idx = idIndexMap.get(reporter);
                    answer[idx]++;
                }
            }
        }

        return answer;
    }
}