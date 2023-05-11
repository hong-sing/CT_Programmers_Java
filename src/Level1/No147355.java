package Level1;

import java.util.ArrayList;

//크기가 작은 부분문자열  https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class No147355 {
    public static int solution(String t, String p) {
        int answer = 0;
        int t_len = t.length();
        int p_len = p.length();
        ArrayList<Long> list = new ArrayList<>();

        for (int i=0; i<=t_len-p_len; i++) {
            String num = String.valueOf(t.charAt(i));
            for (int j = i+1; j <= i+p_len-1; j++) {
                num += t.charAt(j);
            }
            list.add(Long.parseLong(num));
        }
        System.out.println(list);

        for (Long num : list) {
            if (num <= Long.parseLong(p)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

}
