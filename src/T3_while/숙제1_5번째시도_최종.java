package T3_while;

/*1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 
  단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
	이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오. */

public class 숙제1_5번째시도_최종 {
	public static void main(String[] args) {
		int i = 1; // 0으로 시작하면 2의 배수에 0이 들어감
		int mu2 = 0, mu3 = 0, mu5 = 0; // 배수의 합
		int num2 = 0, num3 = 0, num5 = 0; // 배수의 개수
		
		while(i <= 100) {
			if(i % 2 == 0) {
				num2 += 1;
				mu2 += i;
			}
			else if(i % 3 == 0 ) {
				num3 += 1; 
				mu3 += i;
			}
			else if(i % 5 == 0 ) {
				num5 += 1;
				mu5 += i;
			}
			i++;
		}
		
		int res = mu2 + mu3 - mu5;
		System.out.println("2의 배수의 개수 = " + num2 );
		System.out.println("3의 배수의 개수 = " + num3 );
		System.out.println("5의 배수의 개수 = " + num5 );
		System.out.println();
		System.out.println("2의 배수의 합 + 3의 배수의 합 - 5의 배수의 합 = " + res);
		
	}
}
