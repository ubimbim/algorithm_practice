package mathematics;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		
		// 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때 윤년
		if(su1%4==0 && su1%100!=0 || su1%400==0) {
			System.out.println("1"); // 윤년일 때
		} else {
			System.out.println("0"); // 윤년이 아닐 때
		}
		
		sc.close();
	}

}
