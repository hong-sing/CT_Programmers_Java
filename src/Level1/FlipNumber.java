package Level1;

class Solution {	
    public int[] solution(long n) {
        int[] answer = {};
		String s = Long.toString(n);
		answer = new int[s.length()];
		
		for (int i=0; i<s.length(); i++) {
			answer[i] = Integer.parseInt(s.substring(i, i+1));
		}
		
		int tmp = 0;
		for (int i=0; i<s.length()/2; i++) {
			tmp = answer[i];
			answer[i] = answer[(s.length()-1)-i];
			answer[(s.length()-1)-i] = tmp;			
		}
		
		return answer;
    }
}//class end

public class FlipNumber {
		
	public static void main(String[] args) {
		/*
		long n = 1234567;
		String s = Long.toString(n);
		int[] answer = {};
		answer = new int[s.length()];
		
		for (int i=0; i<s.length(); i++) {
			answer[i] = Integer.parseInt(s.substring(i, i+1));
		}
		
		int tmp = 0;
		for (int i=0; i<s.length()/2; i++) {
			tmp = answer[i];
			answer[i] = answer[(s.length()-1)-i];
			answer[(s.length()-1)-i] = tmp;			
		}
		
		for (int i=0; i<s.length(); i++) {
			System.out.print(answer[i]);
		}
		*/

		Solution a = new Solution();
		System.out.println(a.solution(12345));

	}//main() end
}//class end
