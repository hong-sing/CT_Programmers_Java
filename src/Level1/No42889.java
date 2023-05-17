package Level1;

import java.util.Arrays;

// +11점
//실패율   https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class No42889 {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = i + 1;
        }

        //특정 스테이지 도전중인 사람의 수
        int[] trying = new int[N+1];
        for (int i=0; i<stages.length; i++) {
            if (stages[i] - 1 != N) {
                trying[stages[i]]++;
            }
        }

        //특정 스테이지 도전한 사람의 수
        int[] tried = new int[N+2];
        for (int stage : stages) {
            for (int j = 1; j <= stage; j++) {
                tried[j]++;
            }
        }

        //실패율
        float[] fail = new float[N+1];
        for (int i=1; i<fail.length; i++) {
            fail[i] = (float) trying[i] / tried[i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (fail[answer[i]] < fail[answer[j]]) {
                    int tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
                if (fail[answer[i]] == fail[answer[j]]) {
                    if (answer[i] > answer[j]) {
                        int tmp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = tmp;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4,4,4,4,4})));
    }
}
