import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i:priorities){
            set.add(i);
            arr.add(i);
        }
        for(int i:set){
            pq.offer(i);
        }
        
        int j = 0;
        
        while(!pq.isEmpty()){
            int a = pq.poll();
            int temp = j;
            for(int i=temp; i<temp+arr.size(); i++){
                if(arr.get(i%arr.size())==a){
                    answer++;
                    j = i%arr.size();
                    System.out.println(j);
                    if(j==location){
                        break;
                    }
                }
            }
            if(j==location){
                        break;
                    }
        }
        
        return answer;
    }
}