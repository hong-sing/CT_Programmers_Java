package Level1;

import java.util.Arrays;

//문자열 내 마음대로 정렬하기   https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class No12915 {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {  //new Comparator<String>
            if (o1.charAt(n) > o2.charAt(n)) {
                return 1;
            } else if (o1.charAt(n) < o2.charAt(n)) {
                return -1;
            } else if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return 0;
        });
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }
}

