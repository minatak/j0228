package exam;

/*1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 
  단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
	이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오. */

public class 숙제1_1 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		int mu2, mu3, mu5 = 0; // 2의 배수, 3의 배수, 5의 배수끼리의 합
		
		while(i < 100) {
			
		if(i % 2 == 0) {
			while(i < 100) {
				i = i + 1;
				tot = tot + i;
				mu2 = tot;
			}
			System.out.println("2의 배수의 개수는" + i);
		}
		else if(i % 3 == 0) {
			while(i < 99) {
				i = i + 1;
				tot = tot + i;
				mu3 = tot;
			}
			System.out.println("3의 배수의 개수는" + i);
		}
		else if(i % 5 == 0) {
			while(i < 100) {
				i = i + 1;
				tot = tot + i;
				mu5 = tot;
			}
			System.out.println("5의 배수의 개수는" + i);
		}
		
		}
		
	}
}
