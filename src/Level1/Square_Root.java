package Level1;

public class Square_Root {

// 정수 제곱근 판별 https://school.programmers.co.kr/learn/courses/30/lessons/12934?language=java
	public static long solution(long n) {
		double x = Math.sqrt(n);  //n의 제곱근
		long answer = 0;
		
		if (n%x==0) { //n이 양의 정수 x의 제곱인가
			answer = (long) Math.pow(x+1, 2);  //(x+1)의 제곱
			return answer;
		} else {
			return -1;
		}//if end
	}//solution() end
	
	public static void main(String[] args) {
		// 
		/*
		long n = 3;
		System.out.println(Math.sqrt(n));
		
		double a = Math.sqrt(n); //11.0
		
		System.out.println(a);
		
		if (n%a==0) {
			long b = (long) Math.pow(a, 2);
			System.out.println(b);
		} else {
			System.out.println(-1);
		}//if end
		*/
		
		System.out.println(solution(3));
		
	}

}
