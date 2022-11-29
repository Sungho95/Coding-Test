class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        // -5 ~ 5 크기와 같은 2차원 배열
        boolean[][][][] visited = new boolean[11][11][11][11];
        
        // UDRL
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        // 이동하기 전 위치
        int x = 0;
        int y = 0;
        
        // 시작 위치
        int nx = 5;
        int ny = 5;
        
        // 다음 위치 인덱스
        int idx = 0;
        
        for (int i = 0; i < dirs.length(); i++) {
            // 현재 위치
            x = nx;
            y = ny;
            
            char ch = dirs.charAt(i);
            if (ch == 'U') idx = 0;
            else if (ch == 'D') idx = 1;
            else if (ch == 'R') idx = 2;
            else idx = 3;
            
            // 다음 위치
            nx += dx[idx];
            ny += dy[idx];
            
            // 범위를 벗어났을 경우
            if (nx < 0 || nx > 10 || ny < 0 || ny > 10) {
                nx -= dx[idx];
                ny -= dy[idx];
                continue;   
            }
            
            // 갔던 길이 아닌 경우
            if (!visited[nx][ny][x][y] && !visited[x][y][nx][ny]) {
                visited[nx][ny][x][y] = true;
                visited[x][y][nx][ny] = true;
                answer++;
            }
        }
        return answer;
    }
}