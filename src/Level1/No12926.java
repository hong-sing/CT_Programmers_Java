package Level1;

//시저 암호 https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class No12926 {
    static public String solution(String s, int n) {
        String answer = "";
        char c;

        for (int i=0; i<s.length(); i++) {
            c = (char)(s.charAt(i)+n);
            if (s.charAt(i)==' ') {
                answer += s.charAt(i);
            } else if ('A'<=s.charAt(i) && s.charAt(i)<='Z' && 'A'<=c && c<='Z') {
                answer += c;
            } else if ('A'<=s.charAt(i) && s.charAt(i)<='Z' && 'Z'<c) {
                answer += (char)(c-26);
            } else if ('a'<=s.charAt(i) && s.charAt(i)<='z' && 'a'<=c && c<='z') {
                answer += c;
            } else if ('a'<=s.charAt(i) && s.charAt(i)<='z' && 'z'<c) {
                answer += (char)(c-26);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }
}
