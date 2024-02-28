package T3_while;

import java.util.Scanner;

/* 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 
 * 이때 5개항씩 그 결과를 출력시켜주시오.
(마지막에 남은 값이 있으면 그 합까지도 마지막에 출력할수 있어야함)
여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫 번째 숫자가 더 큰 숫자가 먼저 입력될수도 있다. */

public class 숙제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, temp = 0;
		
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		System.out.println("변경 전 n1: "+num1+", n2: " + num2 );
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp; 
		}
		
				
		System.out.println("변경 후 n1: "+num1+", n2: " + num2 );
		
	}
}
