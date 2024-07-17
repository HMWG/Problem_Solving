import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> a = new ArrayList<>();
        
        int temp = -1;
        for(int i=0; i<arr.length; i++){
            q.offer(arr[i]);
        }
        while(!q.isEmpty()){
            int i = q.poll();
            if(i!=temp){
                temp = i;
                a.add(i);
            }
        }
        
        int[] answer = new int[a.size()];
        int count = 0;
        for(int i:a){
            answer[count++] = i;
        }
        
        return answer;
    }
}