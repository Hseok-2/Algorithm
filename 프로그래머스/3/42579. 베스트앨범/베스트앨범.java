import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>(); // <장르, {고유번호, 재생횟수}>
        HashMap<String, Integer> playMap = new HashMap<>(); // <장르, 총 재생 횟수>

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // Map 초기화
            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
                playMap.put(genre, 0);
            }

            // {고유 번호, 재생횟수}를 int[]에 저장
            genreMap.get(genre).add(new int[]{i, play});
            playMap.put(genre, playMap.get(genre) + play);
        }

        // 장르 정렬 (총 재생 횟수 기준 내림차순)
        List<String> sortedGenres = new ArrayList<>(playMap.keySet()); // playMap의 Key들을 list로 변환
        Collections.sort(sortedGenres, (g1, g2) -> playMap.get(g2).compareTo(playMap.get(g1)));

        ArrayList<Integer> answerList = new ArrayList<>(); // 정렬된 장르 순서대로, 각 장르 내에서 노래를 선택

        for (String genre : sortedGenres) {
            // 현재 장르의 노래 리스트를 가져옴 {id, play}
            ArrayList<int[]> songs = genreMap.get(genre);

            Collections.sort(songs, (o1, o2) -> {
                // 재생 횟수가 다르다면 내림차순 정렬 (1순위)
                if(o1[1] != o2[1]) {
                    return Integer.compare(o2[1], o1[1]);
                }
                return Integer.compare(o1[0], o2[0]); // 재생 횟수가 같다면 고유번호 낮은 순으로 정렬 (2순위)
            });

            for (int i = 0; i < songs.size() && i < 2; i++) {
                answerList.add(songs.get(i)[0]);
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}