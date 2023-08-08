class Solution {
    public int[] solution(String[] park, String[] routes) {
        char[][] arr = new char[park.length][park[0].length()];
        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();
            
            if (park[i].contains("S")) {
                x = park[i].indexOf('S');
                y = i;
            }
        }

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            int nx = x;
            int ny = y;

            for (int i = 0; i < distance; i++) {
                switch (direction) {
                    case "E" -> nx++;
                    case "W" -> nx--;
                    case "S" -> ny++;
                    default -> ny--;
                }

                if (nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length) {
                    if (arr[ny][nx] == 'X') {
                        break;
                    }

                    if (i == distance - 1) {
                        x = nx;
                        y = ny;
                    }
                }
            }
        }

        return new int[]{y, x};
    }
}