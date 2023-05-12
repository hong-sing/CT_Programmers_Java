package Level1;

//콜라 문제 https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class No132267 {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (a <= n) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
        System.out.println(solution(3,1,20));
    }
}
