package T2_switch_case;

import java.util.Scanner;

// 직급코드를 입력받아서 직급별 명칭을 출력하시오.
/*
	 직급코드 1: 부장, 본봉 : 5,000,000
	 직급코드 2: 과장, 본봉 : 4,000,000
	 직급코드 3: 대리, 본봉 : 3,000,000
	 직급코드 4: 사원, 본봉 : 2,000,000
	 
	 시간수당(sudang) : 시간을 입력받아서 1시간당 25,000원으로 계산한다.
	 공제액(gong) : 본봉(bon)의 10%로 한다.
	 실수령액(netpay)을 구하시오.
	 단, 실수령액 = 본봉 + 수당 - 공제액
	 
 */

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code, sudang, gong, bon = 0, netpay=0, hour, hap = 0;
		String jik;
		
		System.out.print("직급코드를 입력하세요 (1:부장, 2:과장, 3:대리, 4:사원) : ");
		code = sc.nextInt();
		
		System.out.print("일한 시간을 입력하세요 : ");
		hour = sc.nextInt();
		
		sudang = (hour * 25000);
		gong = hap / 10; // gong = (int)(hap*0.1);
		hap = bon + (hour * 25000);
				
		netpay = bon + sudang - gong;
		
		switch(code) {
			case 1:
				jik = "부장";
				bon = 5000000;
			case 2:
				jik = "과장";
				bon = 4000000;
			case 3:
				jik = "대리";
				bon = 3000000;
			case 4:
				jik = "사원";
				bon = 2000000;
			default:
				jik = "비사원";
				bon = 0;
		}
		
		
		System.out.println("입력하신 코드 "+code+"는 "+jik+"이고, 실수령액은 "+netpay+"원 입니다.");
		sc.close();
	}
}
