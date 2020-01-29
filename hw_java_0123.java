package hw_java_0123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class hw_java_0123 {
	static int result = 0;
	public static void main(String[] args) throws FileNotFoundException {
		//입력 
		Scanner sc = new Scanner(System.in);
		//input 파일 읽기 
		System.setIn(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			//NxN배열을 위한 값 
			int N = sc.nextInt();
			//고도차 입력 값 
		    int K = sc.nextInt();
		    //새로운 객체 배열 생성 
		    int[][] arr= new int[N][N];
		    //반복문을 사용하여 배열 값 입력 
		    for (int i = 0; i < N; i++){
		    	for (int j = 0; j < N; j++){
		    		arr[i][j] = sc.nextInt();}}
		    //탐색을 위한 반복문 
		    for(int i = 0; i < N; i++){
		    	for(int j = 0; j < N; j++){
		    		//사각형을 찾을 배열의 시작지점 
		    		for(int k = i; k < N; k++){
		    			for(int v = j; v < N; v++) {
		    				// min, max 값을 구하기 위한 초기화 
		    				int min = 10,max = 0;
		    				for(int x = i; x <= k; x++) {
		    					for(int y = j; y <= v; y++) {
		    						//값 저장후 최대값 최소값 구하기 
		    						int val = arr[x][y];
		    						max = val > max ? val : max;
		    						min = val < min ? val : min;
		    					}
		    				}
		    				// 값 출력을 위한 고도값과의 비교 
		    				if(max-min <= K) {
		    					int sol = (k-i+1) * (v-j+1);
		    					result = result < sol ? sol : result;
		    				}
		    			}
		    		}
		    	}
		    }
		    System.out.println("#" + t + " " + result);
		}
	}
}