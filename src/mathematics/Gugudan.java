package mathematics;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(su + " * " + i + " = " + (su*i));
		}

	}

}
