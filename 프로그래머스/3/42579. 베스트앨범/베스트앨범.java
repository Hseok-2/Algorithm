import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>(); // <장르,{고유번호, 재생횟수}>, 장르 내에서 가장 많이 재생하고 고유번호가 낮은 순
        HashMap<String, Integer> playMap = new HashMap<>(); // <장르, 재생횟수>, 각 장르의 노래 재생횟수 계산

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // 해당 키가 없다면
            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
                playMap.put(genre, 0);
            }
            genreMap.get(genre).add(new int[]{i, play});
            playMap.put(genre, playMap.get(genre) + play);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        // 각 장르별 총 노래 재생 횟수가 많은 순으로 내림차순
        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        sortedGenre.forEach(entry -> { // 각 장르 내에서 노래를 재생 횟수 순으로 정렬해 최대 2곡까지
            Stream<int[]> sortedSongs = genreMap.get(entry.getKey()).stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);
            sortedSongs.forEach(song -> answer.add(song[0])); // answer에 고유번호 add
        });

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}