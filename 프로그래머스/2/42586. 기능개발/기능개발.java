import java.util.*;
class Solution {
    static ArrayList<Integer> arr;
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qs = new LinkedList<>();
        arr = new ArrayList<>();
        
        for(int i:progresses){
            q.offer(i);
        }
        for(int i:speeds){
            qs.offer(i);
        }
        
        int n = 0;
        
        while(!q.isEmpty()){
            n++;
            check(q,qs,n,0);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
    static void check(Queue<Integer> q, Queue<Integer> qs, int n, int a){
        if(q.peek()+(qs.peek()*n)>=100){
            a++;
            q.poll();
            qs.poll();
            if(!q.isEmpty()){
                check(q, qs, n, a);
            }
            else{
                arr.add(a);
            }
        }
        else{
            if(a!=0){
                arr.add(a);
            }
        }
            
    }
}