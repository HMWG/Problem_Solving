import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int e = elements.length;
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<e; i++){
            for(int j=0; j<e; j++){
                int n = 0;
                for(int k=i; k<e; k++){
                    n+=elements[(j+k)%e];
                }
                set.add(n);
                    
            }
        }
        
        return set.size();
    }
}