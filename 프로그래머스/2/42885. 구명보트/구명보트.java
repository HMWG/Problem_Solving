import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<people.length; i++){
            arr.add(people[i]);
        }
        
        
        while(!arr.isEmpty()){
            if(arr.size()==1){
                arr.remove(0);
            }
            else{
                if(arr.get(0)+arr.get(arr.size()-1) > limit){
                arr.remove(arr.size()-1);
            }
            else{
                arr.remove(arr.size()-1);
                arr.remove(0);
            }
            }
            
            answer++;
        }
        
        return answer;
    }
}