/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.stream.Collectors;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    public static void main(String args[]) throws Exception
    {
		
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		
        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringBuilder sb = new StringBuilder();
            w = 0;
            l = 0;
            a = new int[9];
            b = new int[9];
            visited = new boolean[9];
            result = new int[9];
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();

            for (int i = 0; i < 9; i++) {
                a[i] = sc.nextInt();
                arr1.add(a[i]);
                visited[i] =false;
            }

            for (int i = 0; i < 18; i++) {
                arr2.add(i+1);
            }

            b = arr2.stream().filter(integer -> !arr1.contains(integer)).mapToInt(Integer::intValue).toArray();

            perm(0);
            
            sb.append("#").append(test_case).append(" ").append(w).append(" ").append(l);
            System.out.println(sb);

        }
    }
    static int[] a;
    static int[] b;
    static int[] result;
    static int w;
    static int l;
    static boolean[] visited;

    static void perm(int idx){
        if(idx == 9){
            int m=0, n=0;
            for (int i = 0; i < 9; i++) {
                if(a[i]>result[i]){
                    m += a[i] + result[i];
                }
                else {
                    n += a[i] + result[i];
                }
            }
            if(m>n)
                w++;
            else if(n>m)
                l++;
            return;
        }
        for (int i = 0; i < 9; i++) {
            if (visited[i]){
                continue;
            }
            result[idx] = b[i];
            visited[i] = true;
            perm(idx+1);
            visited[i] =false;
        }
    }
}