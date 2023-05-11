package Level1;

// 이상한 문자 만들기   https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class No12930 {
    static public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();    //홀수번째에 대문자가 입력될 수 있으니 모두 소문자로 변경

        // 짝수면 true, 홀수면 false
        boolean flag = true;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==' ') {
                answer += s.charAt(i);
                flag = true;
            } else if (flag) {
                answer += (char)(s.charAt(i)-32);
                flag = false;
            } else {
                answer += s.charAt(i);
                flag = true;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("try hello world");
    }
}
