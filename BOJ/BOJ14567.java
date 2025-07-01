package BOJ;

import java.io.*;
import java.util.*;

/**
 * 2025.07.01
 * 선수과목 (Gold 5)
 * Topological Sort
 *
 * 한양대학교 알고리즘 실습 강의에서 배운 위상정렬 알고리즘을
 * 백준 문제를 통해 연습해보았습니다.
 */

public class BOJ14567 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] pre = new ArrayList[1001];
        for (int i = 0; i < 1001; i++) pre[i] = new ArrayList<Integer>();
        int[] in = new int[1001];
        int[] sem = new int [1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            pre[a].add(b);
            in[b]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int semester = 1;
        for (int i = 1; i <= N; i++) {
            if (in[i] == 0) {
                q.add(i);
                sem[i] = semester;
            }
        }

        while (!q.isEmpty()) {
            int tmp = q.peek(); q.poll();
            for (int i = 0; i < pre[tmp].size(); i++) {
                int nxt = pre[tmp].get(i);
                in[nxt]--;
                if (in[nxt] == 0) {
                    q.add(nxt);
                    sem[nxt] = sem[tmp] + 1;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            bw.write(sem[i] + " ");
        }
        bw.flush();
    }
}
