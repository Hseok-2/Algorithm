class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0; // 최소 기지국 설치 수
        int location = 1; // 현재 위치
        int idx = 0; // 기지국 인덱스

        while(location <= n) {
            if(idx < stations.length && location >= stations[idx]-w) { // 기지국이 설치된 위치에 도달한 경우
                location = stations[idx] + w + 1;
                idx++;
            } else { // 기지국 설치해야하는 경우
                location += 2 * w + 1;
                answer++;
            }
        }
        return answer;
    }
}