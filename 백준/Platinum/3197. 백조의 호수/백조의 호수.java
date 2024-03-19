import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] arr = new char[r][c];
        boolean[][] visited = new boolean[r][c];
        boolean[][] swanVisited = new boolean[r][c];

        Queue<Point> swanQueue = new LinkedList<>();
        Queue<Point> waterQueue = new LinkedList<>();
        Queue<Point> swanTemp = new LinkedList<>();
        Queue<Point> waterTemp = new LinkedList<>();

        Point swan = new Point();

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.charAt(j);

                if (arr[i][j] == '.' || arr[i][j] == 'L') {
                    if (arr[i][j] == 'L') {
                        swan = new Point(i, j);
                    }
                    visited[i][j] = true;
                    waterQueue.add(new Point(i, j));
                }
            }
        }

        int count = 0;
        swanQueue.add(swan);
        swanVisited[swan.x][swan.y] = true;

        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};

        boolean flag = false;

        while (true) {
            // 백조 이동
            while (!swanQueue.isEmpty()) {
                Point now = swanQueue.poll();
                for (int i = 0; i < 4; i++) {
                    int ny = now.x + dy[i];
                    int nx = now.y + dx[i];

                    if (ny < 0 || nx < 0 || ny >= r || nx >= c || swanVisited[ny][nx]) {
                        continue;
                    }
                    swanVisited[ny][nx] = true;
                    if (arr[ny][nx] == 'X') {
                        swanTemp.add(new Point(ny, nx));
                        continue;
                    }
                    if (arr[ny][nx] == '.') {
                        swanQueue.add(new Point(ny, nx));
                        continue;
                    }
                    flag = true;
                    break;
                }
                if (flag) {
                    break;
                }
            }

            if (flag) {
                break;
            }

            // 얼음 녹음
            while (!waterQueue.isEmpty()) {
                Point now = waterQueue.poll();
                visited[now.x][now.y] = true;

                for (int i = 0; i < 4; i++) {
                    int ny = now.x + dy[i];
                    int nx = now.y + dx[i];

                    if (ny < 0 || nx < 0 || ny >= r || nx >= c || visited[ny][nx]) {
                        continue;
                    }
                    if (arr[ny][nx] == 'X') {
                        visited[ny][nx] = true;
                        waterTemp.add(new Point(ny, nx));
                        arr[ny][nx] = '.';
                    }
                }
            }
            waterQueue = new LinkedList<>(waterTemp);
            swanQueue = new LinkedList<>(swanTemp);
            waterTemp.clear();
            swanTemp.clear();
            count++;
        }
        System.out.println(count);
    }

}