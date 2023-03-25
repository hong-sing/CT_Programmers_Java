package Level1;

// 최대공약수와 최소공배수 https://school.programmers.co.kr/learn/courses/30/lessons/12940
class No1 {
    int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n, m);
        answer[0] = gcd;
        answer[1] = lcm(n, m, gcd);
        return answer;
    }

    int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }

    int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}

/*
    최대공약수 : 유클리드 호제법
    최소공배수 : a * b / 최대공약수
 */