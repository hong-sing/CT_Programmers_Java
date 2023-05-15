package Level1;

import java.util.Arrays;

//가장 가까운 같은 글자  https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class No142086 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1;
        for (int i=1; i<s.length(); i++) {
            for (int j=i-1; 0<=j; j--) {
                if (s.charAt(i)==s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
                answer[i] = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }
}
