package Level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class HASHAD_NUMBER {

	public boolean solution(int x) {
		boolean answer = true;
		String a = Integer.toString(x);  //x를 문자열 a로 변환
		int hap = 0;                     //x의 각 자리수 합을 구하기 위해
		
		for (int i=0; i<a.length(); i++) {
			int b = Integer.parseInt(a.substring(i, i+1));  //a 한자리 한자리를 int 형으로 b에 대입
			hap += b;			                            //각 자리의 누적합
		}//for end
		
		if (x%hap==0) {  //x의 자릿수 합으로 x가 나누어 떨어지는가
			answer = true;
		} else {
			answer = false;
		}//if end
		
		return answer;
	}//solution() end
	
	public static void main(String[] args) {
		
		HASHAD_NUMBER hn = new HASHAD_NUMBER();
		System.out.println(hn.solution(13));

	}//main() end

}//class end
