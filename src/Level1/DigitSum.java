package Level1;

import java.util.*;

public class DigitSum {  //자릿수 더하기 https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java

	
	public static int Solution(int n) {
		
		String a = Integer.toString(n);          //int 매개변수를 문자열로 변환(substring쓰려고)
		String[] arr = new String[a.length()];   //a(매개변수)의 길이만큼 배열 선언
		
		int[] arr2 = new int[a.length()];        //문자열 배열 arr을 int형으로 변환하여 배열에 담기위해
		int answer = 0;
		for (int i=0; i<a.length(); i++) {       //a를 각각 숫자 하나하나를 배열에 담기위해
			arr[i] = a.substring(i, i+1);        //a에서 숫자 하나씩 잘라서 arr에 넣기
			arr2[i] = Integer.parseInt(arr[i]);  //위에서 arr에 담은 숫자(문자형)을 숫자형으로 변환해서 arr2 배열에 담기
			answer += arr2[i];                   //각 자리수를 다 더해서 누적해서 answer에 담기
		}//for end
		
		return answer;
	}//solution() end
	
	
	public static void main(String[] args) {
		/*
		int n = 987;
		String a = Integer.toString(n);
		String[] arr = new String[a.length()];
		
		int[] arr2 = new int[a.length()];
		int answer = 0;
		for (int i=0; i<a.length(); i++) {
			arr[i] = a.substring(i, i+1);
			arr2[i] = Integer.parseInt(arr[i]);
			answer += arr2[i];
		}//for end
		
		System.out.println(answer);
		*/
//		System.out.println(Solution(123));
		

	}

}
