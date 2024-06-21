import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.values());
        
        arr.sort(Comparator.reverseOrder());
        
        
        int x = 0;
        while(true){
            x+=arr.get(answer);
            answer++;
            
            if(x>=k){
                break;
            }
        }
        
        
        
        return answer;
    }
}