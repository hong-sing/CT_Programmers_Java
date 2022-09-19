package Level1;

import java.util.Arrays;
import java.util.Collections;

class Solutionb {
	public long solution (long n) {
		long answer = 0;
		//n을 substring하기 위해 문자열로 변환
		String s = Long.toString(n);
		Integer[] arr = new Integer[s.length()];  //Collections.reverseOrder()을 사용하려면 형태가 int가 아닌 Integer 이어야 함
		
		//s(문자열로 변환한 n)를 한자리씩 잘라 배열에 넣기
		for (int i=0; i<s.length(); i++) {
			arr[i] = Integer.parseInt(s.substring(i, i+1));
		}//for end
		
		//배열 내림차순
		Arrays.sort(arr, Collections.reverseOrder());
		
		int[] iarr = new int[s.length()];
		String st = "";
		for (int i=0; i<s.length(); i++) {

			//문자열 변환을 위해 Integer[]를 int[]로 언박싱

			//Integer[]를 int[]로 언박싱

			iarr[i] = arr[i];
			st = st + Integer.toString(iarr[i]);

		}//for end	


		
		//return값이 long이므로 문자열을 long형으로 변환
		answer = Long.parseLong(st);
		return answer;
	}//solution() end
}//class end

public class IntDesc {

	public static void main(String[] args) {
		
		Solutionb a = new Solutionb();
		System.out.println(a.solution(118372));
	}

}
