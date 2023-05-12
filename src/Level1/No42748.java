package Level1;

import java.util.Arrays;

//K번째수  https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class No42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            for (int j = commands[i][0]-1, k=0; j <= commands[i][1]-1; j++, k++) {
                arr[k] = array[j];
            }
            Arrays.sort(arr);
            result[i] = arr[commands[i][2]-1];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
