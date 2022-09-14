package Level1;

import java.util.Arrays;
import java.util.Collections;

class Solution {
	public long solution (long n) {
		long answer = 0;
		String s = Long.toString(n);
		Integer[] arr = new Integer[s.length()];
		
		for (int i=0; i<s.length(); i++) {
			arr[i] = Integer.parseInt(s.substring(i, i+1));
		}//for end
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int[] iarr = new int[s.length()];
		String st = "";
		for (int i=0; i<s.length(); i++) {
			iarr[i] = arr[i];
			st = st + Integer.toString(iarr[i]);
		}//for end		
		answer = Long.parseLong(st);
		return answer;
	}//solution() end
}//class end

public class IntDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution a = new Solution();
		System.out.println(a.solution(118372));
	}

}
