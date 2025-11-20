class Solution {
    public int solution(int n, int[] stations, int w) {
        int idx = 0; // 기지국 설치 위치 인덱스
        int location = 1; // 현재 위치
        int count = 0; // 기지국 증설 수

        while (location <= n) {
            if (idx < stations.length && location >= stations[idx] - w) { // 해당 기지국 인덱스 도달 범위보다 크거나 같다면
                location = stations[idx] + w + 1;
                idx++;
            } else { // 그렇지 않고 증설해야 한다면
                count++; // 증설 +1
                location += 2 * w + 1; // 해당 기지국 인덱스 도달 범위보다 +1
            }
        }
        return count;
    }
}