package Level1;

// 3진법 뒤집기  https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=java
public class No68935 {
    static public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n >= 3) {
            sb.append(n % 3);
            n = n/3;
        }
        sb.append(n);
        System.out.println(sb);

        for (int i = sb.length()-1, j=1; 0 <= i; i--, j*=3) {
            answer += (sb.charAt(i)-'0')*j;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(125);
    }
}
