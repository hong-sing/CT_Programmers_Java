package Level1;

import java.util.*;

// 같은 숫자는 싫어    https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class No12096 {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();
        int arr_size = arr.length;

        s.push(arr[arr_size-1]);
        for (int i=arr_size-2; 0<=i; i--) {
            if (s.peek()!=arr[i]) s.push(arr[i]);
        }

        int[] answer = new int[s.size()];

        int s_size = s.size();
        for (int i=0; i<s_size; i++) {
            answer[i] = s.pop();
        }

        return answer;
    }
}