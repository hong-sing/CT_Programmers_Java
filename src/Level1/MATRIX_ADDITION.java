package Level1;

import java.util.Arrays;

public class MATRIX_ADDITION {

    public int[][] solution(int[][] arr1, int[][] arr2) {
		int row = arr1.length;
		int col = arr1[0].length;
    	int[][] answer = new int[row][col];
        
		//두 행렬 합의 결과를 answer에 저장
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}//for end
		}//for end
        
        return answer;
    }//solution() end
	
	public static void main(String[] args) {

		//출력 테스트
//		int[][] arr1 = {{1,2}, {2,3}};
//		int[][] arr2 = {{3,4}, {5,6}};
		
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		
		
		MATRIX_ADDITION ma = new MATRIX_ADDITION();
		
		System.out.println(ma.solution(arr1, arr2));
		
		
	}//main() end
}//class end
