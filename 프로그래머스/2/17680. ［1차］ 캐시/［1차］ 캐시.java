import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> cache = new LinkedList<>();
        
        for(String city: cities){
            String lowCity = city.toLowerCase();
            
            if(cache.contains(lowCity)){
                answer++;
                cache.remove(lowCity);
                cache.add(lowCity);
            }
            else{
                answer+=5;
                cache.add(lowCity);
                if(cache.size()>cacheSize){
                    cache.poll();
                }
            }
        }
        
        
        
        return answer;
    }
}