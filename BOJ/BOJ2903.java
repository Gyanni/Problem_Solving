package BOJ;

import java.io.*;

/**
 * 2025.06.27
 * 중앙 이동 알고리즘 (Bronze 3)
 * Math
 */

public class BOJ2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = (int) Math.pow(Math.pow(2, n) + 1, 2);

        bw.write(ans + " ");
        bw.close();
//      System.out.println(ans);
    }
}