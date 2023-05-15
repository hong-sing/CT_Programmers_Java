package Level1;

import java.util.*;

//폰켓몬   https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class No1845 {
    public static int solution(int[] nums) {
        int pick = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return Math.min(pick, set.size());
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }
}
