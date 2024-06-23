import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i:scoville){
            pq.offer(i);
        }
        
        
        while(pq.size()>1){
            int n = pq.poll();
            
            //System.out.println(arr.toString());
            if(n<K){
                mix(pq, n);
                answer++;
            }else{
                return answer;
            }
        }
        if(pq.poll()>=K){
            return answer;
        }
        
        return -1;
    }
    static void mix(PriorityQueue<Integer> pq, int n){
        int a = n+(pq.poll()*2);
        pq.offer(a);
    }
}