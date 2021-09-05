package mathematics;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testsize = sc.nextInt();
		String[] test = new String[testsize];
		int[] hap = new int[testsize] ;
		
		for(int i=0;i<testsize;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			hap[i] = a+b;
		}
		
		for(int i=0;i<testsize;i++) {
			System.out.println(hap[i]);
		}
	}

}
