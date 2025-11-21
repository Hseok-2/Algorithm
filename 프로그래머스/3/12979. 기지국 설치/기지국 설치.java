class Solution {
    public int solution(int n, int[] stations, int w) {
        int location = 1; // 현재 위치
        int idx = 0; // 설치된 기지국 인덱스
        int answer = 0; // 증설할 기지국 개수

        while (location <= n) { // 현재 위치가 설치된 아파트의 개수까지 반복
            if (idx < stations.length && location >= stations[idx] - w) {
                // idx가 stations길이보다 작고, 현재 위치가 전파 도달범위 보다 크다면
                // 증설 필요 x
                location = stations[idx] + w + 1; // 기지국 전파 도달 범위 밖으로 위치 갱신
                idx++;
            } else { // 전파 도달 범위가 아니라면
                answer++; // 기지국 증설
                location += 2 * w + 1; // 새로 증설한 기지국 전파 도달 범위보다 +1 로 위치 갱신
            }
        }
        return answer;
    }
}