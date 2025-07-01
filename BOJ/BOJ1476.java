package BOJ;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2025.07.01
 * 날짜 계산 (Silver 5)
 * Math, Brute Force
 */

public class BOJ1476 {

    static int E, S, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        E = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        if (E == 15) E = 0;
        if (M == 19) M = 0;

        int year = S;
        while (true) {
            if (year % 15 == E && year % 19 == M) break;
            year += 28;
        }

        bw.write(Integer.toString(year));
        bw.flush();
    }
}
