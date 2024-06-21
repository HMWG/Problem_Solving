import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            String x = s.substring(i)+s.substring(0,i);
            
            st.clear();
            for(int j=0; j<x.length(); j++){
                if(st.isEmpty()){
                    st.push(x.charAt(j));
                }
                else if(x.charAt(j)==')'&&st.peek()=='('){
                    st.pop();
                    
                }
                else if(x.charAt(j)=='}'&&st.peek()=='{'){
                    st.pop();
                    
                }
                else if(x.charAt(j)==']'&&st.peek()=='['){
                    st.pop();
                    
                }
                else{
                    st.push(x.charAt(j));
                }
            }
            
            if(st.isEmpty()){
                answer++;
                
            }
            
        }
        return answer;
    }
}