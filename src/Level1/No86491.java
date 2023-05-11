package Level1;

// 최소직사각형   https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class No86491 {
    public static int solution(int[][] sizes) {
        int answer = 0;

        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        int width_max = 0;
        int height_max = 0;
        for (int i=0; i<sizes.length; i++) {
            width_max = Math.max(width_max, sizes[i][0]);
            height_max = Math.max(height_max, sizes[i][1]);
        }
        answer = width_max * height_max;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60,50}, {30,70}, {60,30}, {80,40}}));
        System.out.println(solution(new int[][]{{10,7}, {12,3}, {8,15}, {14,7}, {5,15}}));
        System.out.println(solution(new int[][]{{14,4}, {19,6}, {6,16}, {18,7}, {7,11}}));
    }
}
