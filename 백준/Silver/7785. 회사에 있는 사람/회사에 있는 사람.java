import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> logMap = new HashMap<String, String>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            logMap.put(name, status);
        }

        ArrayList<String> ans = new ArrayList<>();

        int count = 0;
        for (String s :
                logMap.keySet()) {
            if (logMap.get(s).equals("enter")) {
                ans.add(s);
            }
        }

        ans.sort(Collections.reverseOrder());

        for (String s : ans) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}