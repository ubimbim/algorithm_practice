package mathematics;

import java.util.Scanner;

public class Alarmclock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		
		if(hh == 0 && mm >= 45) {
			mm = mm-45;
		} else if(hh == 0 && mm < 45) {
			mm = mm+15;
			hh = (hh+23);
		} else if(hh != 0 && mm >= 45) {
			mm = mm-45;
		} else if(hh != 0 && mm < 45) {
			mm = mm+15;
			hh = hh-1;
		} 
		
		System.out.printf("%d %d",hh, mm);	
		
		sc.close();

	}

}
