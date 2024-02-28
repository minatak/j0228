package T1_if;

import java.util.Scanner;

// 논리 연산자(!(not), &&(and), ||(or))
public class Test2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int su1 = 0, su2 = 0, su3 = 0, max = -99;
		
		System.out.print("첫번째 수를 입력하세요 : ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		su2 = sc.nextInt();
		
		System.out.print("세번째 수를 입력하세요 : ");
		su3 = sc.nextInt();
		
		if(su1 > su2 && su1 > su3) {
				max = su1;
			}
		else if(su2 > su3) {
			max = su2;
			}
		
		else {
				max = su3;
			}
		
		System.out.println("수1 : "+su1+", 수2 : "+su2+", 수3 : "+su3+", max : " + max);
	}
}
