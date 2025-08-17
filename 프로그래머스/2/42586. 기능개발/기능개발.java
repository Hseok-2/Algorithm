import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();

        // 기능별 각 배포 가능일 구하기
        int n = progresses.length;
        int[] canDeployDay = new int[n];
        for (int i = 0; i < n; i++) {
            canDeployDay[i] = (int) (Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        int cnt = 0; // 배포될 작업의 수 카운트
        int maxDay = canDeployDay[0]; // 현재 배포될 작업 중 가장 늦게 배포될 작업의 가능일

        for (int i = 0; i < n; i++) {
            if (canDeployDay[i] <= maxDay) { // 배포 가능일이 기준 배포일보다 빠른 경우
                cnt++;
            }else {
                answer.add(cnt);
                cnt = 1;
                maxDay = canDeployDay[i];
            }
        }

        answer.add(cnt);
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}