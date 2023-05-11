package Level1;

import java.util.Arrays;

//예산    https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class No12982 {
    static public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i=0; i<d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 3, 2, 5, 4}, 9);
    }
}
