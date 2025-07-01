package BOJ;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2025.06.27
 * 최소, 최대 (Bronze 2)
 * Math
 */

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int mx = -1000000;
        int mn = 1000000;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp > mx) mx = tmp;
            if (tmp < mn) mn = tmp;
        }

        bw.write(mn + " " + mx);
        bw.close();
    }
}
