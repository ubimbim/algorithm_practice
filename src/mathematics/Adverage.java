package mathematics;

import java.util.Scanner;

public class Adverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testsize = sc.nextInt(); // 테스트 케이스 배열 크기
		int[] test = new int[testsize]; // 테스트 케이스 배열
		double[] result = new double[testsize]; // 결과값 저장 배열

		int sum=0; // 평균 구할 때 총합
		int cnt=0; // 평균 넘는 학생 수
		double avr, avrper; // 평균, 평균 넘는 학생 퍼센트
		
		for(int i=0;i<testsize;i++) {
			
			int susize = sc.nextInt();
			int[] su = new int[susize]; // 점수 배열
			
			for(int j=0;i<su.length;j++) {
				
				su[j] = sc.nextInt();
				sum += su[j];
				avr = sum/(double)(su.length);
				
				// 평균 넘는지 확인
				if(su[j]>avr) {
					cnt++;
				}
				
				avrper = (cnt/susize)*100;
				result[j] = avrper;
			}
			
		}
		
	}

}
