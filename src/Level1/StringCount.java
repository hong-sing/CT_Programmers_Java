package Level1;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();  //대소문자 구분 안함
		char cmprs = ' ';
		int pcnt = 0;
		int ycnt = 0;
		
		for (int i=0; i<s.length(); i++) {
			cmprs = s.charAt(i);  //s 0번째부터 하나씩 담고
			if (cmprs=='p') {     //p랑 비교
				pcnt++;           //p 개수 증가
			} else if (cmprs=='y') {  //y랑 비교
				ycnt++;               //y 개수 증가
			}//if end
		}//for end
		
		if (pcnt==ycnt) {  //p개수와 y개수 비교
			answer = true;
		} else {
			answer = false;
		}//if end
        
        return answer;
    }//solution() end
}//class end

public class StringCount {

	public static void main(String[] args) {
		/*
		String s = "Pyy";
		s = s.toLowerCase();
		char cmprs = ' ';
		int pcnt = 0;
		int ycnt = 0;
		
		for (int i=0; i<s.length(); i++) {
			cmprs = s.charAt(i);
			if (cmprs=='p') {
				pcnt++;
			} else if (cmprs=='y') {
				ycnt++;
			}//if end
		}//for end
		
		if (pcnt==ycnt) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}//if end
		*/	
		
		Solution sl = new Solution();
		System.out.println(sl.solution("pPoooyY"));
		
	}//main() end
}//class end
