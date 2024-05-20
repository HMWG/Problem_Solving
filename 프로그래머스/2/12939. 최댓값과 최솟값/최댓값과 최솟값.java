import java.util.*;
import java.io.*;
public class Solution{
    public String solution(String s) {
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, Integer.parseInt(a[i]));
            max = Math.max(max, Integer.parseInt(a[i]));
        }


        return min + " " + max;
    }
}
