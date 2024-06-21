import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);
        
        int a=0;
        int b=0;
        
        for(int i=1; i<words.length; i++){
            if(arr.contains(words[i])){
                a = (i%n)+1;
                b = i/n+1;
                break;
            }
            else{
                arr.add(words[i]);
            }
            if(words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)){
                a = (i%n)+1;
                b = i/n+1;
                break;
            }
        }
        
        answer[0] = a;
        answer[1] = b;
        

        return answer;
    }
}