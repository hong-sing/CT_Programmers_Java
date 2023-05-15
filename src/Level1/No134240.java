package Level1;

import java.util.Stack;

//푸드 파이트 대회 https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class No134240 {
    public static String solution(int[] food) {
        String answer = "";
        Stack<Integer> s = new Stack<>();

        for (int i=1; i<food.length; i++) {
            if (food[i] / 2 > 0) {
                for (int j=1; j<=food[i]/2; j++) {
                    answer += i;
                    s.push(i);
                }
            }
        }
        answer += "0";

        while (!s.isEmpty()) {
            answer += s.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }
}
