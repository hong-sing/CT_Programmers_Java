package Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//두 개 뽑아서 더하기   https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class No68644 {
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];

        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            answer[i] = (int) it.next();
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));
    }
}
