package Level1;

import java.util.Arrays;

//과일 장수 https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class No135808 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        if (score.length < m) return 0;

        Arrays.sort(score);
        for (int i = score.length - m; 0 <= i; i -= m) {
            answer += score[i] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(4,3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
