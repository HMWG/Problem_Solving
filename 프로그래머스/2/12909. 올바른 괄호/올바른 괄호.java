import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

class Solution {
    boolean solution(String s) {
        int r = 0;

        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            if (a.equals("(")) {
                r++;
            } else if (a.equals(")")) {
                r--;
                if (r < 0) {
                    return false;
                }
            }
        }

        return r == 0;
    }
}