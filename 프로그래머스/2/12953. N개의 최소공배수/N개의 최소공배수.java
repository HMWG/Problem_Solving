import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int n = 0;
        boolean check = false;
        while(!check){
            n++;
            check = true;
            int a = arr[arr.length-1]*n;
            for(int i=0; i<arr.length-1; i++){
                if(a%arr[i]!=0){
                    check = false;
                    break;
                }
            }
        }
        answer = arr[arr.length-1]*n;
        
        
        return answer;
    }
}