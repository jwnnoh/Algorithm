import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tmp;

        ArrayList<BigInteger> arrayList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            tmp = "";

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    if (!tmp.isEmpty()) {
                        arrayList.add(new BigInteger(tmp));
                        tmp = "";
                    }
                    continue;
                }
                tmp += s.charAt(j);
                if (j == s.length() - 1) {
                    arrayList.add(new BigInteger(tmp));
                }
            }

        }
        Collections.sort(arrayList);

        for (BigInteger i :
                arrayList) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

}