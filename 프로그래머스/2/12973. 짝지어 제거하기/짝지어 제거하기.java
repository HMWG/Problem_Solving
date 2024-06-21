import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<String> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(st.empty()){
                st.push(Character.toString(s.charAt(i)));
            }
            else{
                if(st.peek().equals(Character.toString(s.charAt(i)))){
                    st.pop();
                }
                else{
                    st.push(Character.toString(s.charAt(i)));
                }
            }
        }
        if(st.empty())
            return 1;
        else
            return 0;

    }
}