import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        /**
         * 1. 가장 많이 재생된 장르를 먼저 수록
         * 2. 장르 내에서 많이 재생된 노래를 먼저 수록
         * 3. 장르 내에서 재생 횟수가 같은 경우 고유 번호가 낮은 노래를 먼저 수록
         * 0, classic, 500 / 1, pop, 600 / 2, classic, 150 / 3, classic, 800 / 4, pop, 2500
         * pop : 3100, classic : 1450
         * result : [4, 1, 3, 0]
         */

        List<Integer> answer = new ArrayList<>();
        // 장르별 재생횟수 담기 위한 Map
        Map<String, Integer> genreNums = new HashMap<>();
        // 장르 내에서 고유 번호(인덱스)에 따른 재생 횟수를 담기 위한 Map
        Map<String, Map<Integer, Integer>> playNums = new HashMap<>();

        // 장르별 재생횟수 담기
        for (int i = 0; i < genres.length; i++) {
            genreNums.put(genres[i], genreNums.getOrDefault(genres[i], 0) + plays[i]);
        }

        for (int i = 0; i < plays.length; i++) {
            if (!playNums.containsKey(genres[i])) { // 장르가 없는 경우
                // 인덱스와 재생횟수를 담을 Map
                Map<Integer, Integer> play = new HashMap<>();
                // 인덱스와 재생 횟수 담기
                play.put(i, plays[i]);
                // playsNum에 담기
                playNums.put(genres[i], play);
            } else { // 장르가 있는 경우
                // 인덱스와 재생횟수 담기
                playNums.get(genres[i]).put(i, plays[i]);
            }
        }

        // List를 활용한 HashMap 내림차순 정렬
        List<String> list = new ArrayList<>(genreNums.keySet());
        list.sort((o1, o2) -> (genreNums.get(o2).compareTo(genreNums.get(o1))));

        for (String s : list) {
            Map<Integer, Integer> playMap = playNums.get(s);
            ArrayList<Integer> playIndex = new ArrayList<>(playMap.keySet());
            playIndex.sort((o1, o2) -> (playMap.get(o2).compareTo(playMap.get(o1))));

            answer.add(playIndex.get(0));
            if (playIndex.size() > 1) {
                answer.add(playIndex.get(1));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}