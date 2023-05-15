package Level1;

import java.util.Arrays;

//추억 점수 https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class No176963 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        int sum = 0;
        for (int i=0; i<photo.length; i++) {
            for (int j=0; j<photo[i].length; j++) {
                for (int k=0; k<name.length; k++) {
                    if (photo[i][j].equals(name[k])) {
                        sum += yearning[k];
                    }
                }
            }
            answer[i] = sum;
            sum = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
        System.out.println(Arrays.toString(solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}})));
        System.out.println(Arrays.toString(solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}})));
    }
}
