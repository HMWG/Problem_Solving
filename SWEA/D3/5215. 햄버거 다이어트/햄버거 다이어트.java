import java.util.Scanner;

public class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringBuilder sb = new StringBuilder();

            n = sc.nextInt();
            l = sc.nextInt();
            max=0;

            score = new int[n];
            kal = new int[n];
            visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
                kal[i] = sc.nextInt();
                visited[i] = false;
            }

            dfs(0, score[0], kal[0]);
            dfs(0, 0, 0);

            sb.append("#").append(test_case).append(" ").append(max);
            System.out.println(sb);
        }
    }
    static int[] score;
    static int[] kal;
    static boolean[] visited;
    static int max;
    static int l;
    static int n;

    static void dfs(int x, int sumS, int sumK){
        if(sumK <= l){
            max = Math.max(max, sumS);
            if(x < n-1){
                dfs(x+1,sumS + score[x+1],sumK + kal[x+1]);
                dfs(x+1, sumS, sumK);
            }
        }
    }
}
