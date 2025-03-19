import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> aMap = new HashMap<>();
        Map<Integer, Integer> bMap = new HashMap<>();
        
        for(int i=0; i<topping.length; i++){
            aMap.put(topping[i], aMap.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i=0; i<topping.length; i++)
        {
            aMap.put(topping[i], aMap.getOrDefault(topping[i], 1) - 1);
            
            if(aMap.get(topping[i]) == 0){
                aMap.remove(topping[i]);
            }
            
            bMap.put(topping[i], bMap.getOrDefault(topping[i], 0) + 1);
            
            if(aMap.keySet().size() == bMap.keySet().size()){
                answer++;
            }
        }        
        
        return answer;
    }
}