package T1_if;

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

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code;
		String jik;
		
		System.out.print("직급코드를 입력하세요 (1:부장, 2:과장, 3:대리, 4:사원) : ");
		code = sc.nextInt();
		
		if(code == 1) {
			jik = "부장";
		}
		else if(code == 2) {
			jik = "과장";
		}
		else if(code == 3) {
			jik = "대리";
		}
		else if(code == 4) {
			jik = "사원";
		}
		else {
			jik = "비사원";
		}
		
		System.out.println("입력하신 코드 "+code+"는 "+jik+"입니다.");
		sc.close();
	}
}
