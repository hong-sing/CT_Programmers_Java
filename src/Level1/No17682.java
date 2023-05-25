package Level1;

//[1차] 다트 게임    https://school.programmers.co.kr/learn/courses/30/lessons/17682
public class No17682 {
    public static int solution(String dartResult) {
        int answer = 0;
        String s = "";
        int cal = 0;
        int[] point = new int[3];
        boolean flag = false;
        int j = 0;
        for (int i = 0; i < dartResult.length(); i++) {

            if ('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9') {
                s += String.valueOf(dartResult.charAt(i));
            } else {
                if (dartResult.charAt(i) != '*' && dartResult.charAt(i) != '#') {
                    cal = Integer.parseInt(s);
                }
                s = "";
                if (dartResult.charAt(i) == 'S') {
                    flag = true;
                } else if (dartResult.charAt(i) == 'D') {
                    cal = (int) Math.pow(cal, 2);
                    flag = true;
                } else if (dartResult.charAt(i) == 'T') {
                    cal = (int) Math.pow(cal, 3);
                    flag = true;
                } else if (dartResult.charAt(i) == '*') {
                    if (i>3) point[j-2] = point[j-2] * 2;
                    point[j - 1] = point[j - 1] * 2;
                } else if (dartResult.charAt(i) == '#') {
                    point[j-1] = point[j-1] * -1;
                }
                if (flag) {
                    point[j] = cal;
                    j++;
                    flag = false;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            answer += point[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }
}
