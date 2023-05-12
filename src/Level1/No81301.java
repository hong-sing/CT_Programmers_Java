package Level1;

//숫자 문자열과 영단어   https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class No81301 {
    public static int solution(String s) {
        int answer = 0;

        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < 9; i++) {
            s = s.replaceAll(num[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("one4seveneight");
    }
}
