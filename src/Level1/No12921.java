package Level1;

//소수 찾기 https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class No12921 {
    public static int solution(int n) {
        int answer = 0;
        int[] a = new int[1000001];

        for (int i = 2; i <= 1000000; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= 1000000; i++) {
            //이미 지워졌다면 건너뛰기
            if (a[i]==0) continue;

            //지워진 수가 아니라면 그 배수부터 출발하여 가능한 모든 숫자 지우기
            for (int j = 2 * i; j <= 1000000; j += i) {
                a[j] = 0;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }
}
