import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int n, m;
    static int[][] arr;
    static boolean[][] check;
    static ArrayList<Point> wallList = new ArrayList<>();
    static ArrayList<Point> virusList = new ArrayList<>();
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    virusList.add(new Point(i, j));
                }
                if (arr[i][j] == 0) {
                    wallList.add(new Point(i, j));
                }
            }
        }

        for (int i = 0; i < wallList.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    arr[wallList.get(i).x][wallList.get(i).y] = 1;
                    arr[wallList.get(j).x][wallList.get(j).y] = 1;
                    arr[wallList.get(k).x][wallList.get(k).y] = 1;
                    answer = Math.max(answer, solve());
                    arr[wallList.get(i).x][wallList.get(i).y] = 0;
                    arr[wallList.get(j).x][wallList.get(j).y] = 0;
                    arr[wallList.get(k).x][wallList.get(k).y] = 0;
                }
            }
        }

        System.out.println(answer);
    }

    static int solve() {
        check = new boolean[n][m]; //벽이 3개 세워지는 새로운 경우의 수마다 방문한 배열(바이러스 퍼지는 경로)를 초기화시키도록 함
        for (Point p :
                virusList) {
            dfs(p.x, p.y);
        }

        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 && !check[i][j]) { //바이러스가 퍼질 때, 2를 입력하는 대신, 방문함으로 표시한다. 따라서 방문하지 않고, 0인 곳은 안전지역
                    tmp++;
                }
            }
        }
        return tmp;
    }

    static void dfs(int y, int x) {
        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(ny < 0 || ny >= n || nx < 0 || nx >= m || check[ny][nx] || arr[ny][nx] == 1) continue;
            check[ny][nx] = true;
            dfs(ny, nx);
        }
    }
}