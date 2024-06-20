import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        int[] x = A;
        int[] y = B;
        Arrays.sort(x);
        Arrays.sort(y);
        int z = x.length;
        
        for(int i=0; i<z; i++){
            answer += x[i]*y[z-i-1];
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}