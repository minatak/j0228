package T3_while;

/*1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 
  단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
	이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오. */

public class 숙제1_2 {
	public static void main(String[] args) {
		int i2 = 0, i3 = 0, i5 = 0, tot = 0;
		int mu2 = 0, mu3 = 0, mu5 = 0; // 2의 배수, 3의 배수, 5의 배수끼리의 합
		
		while(i2 < 100 || i3 < 99 || i5 < 100) {
		
			if(i2 % 2 == 0) {
				i2 = i2 + 2;
				mu2 += tot;
				System.out.println("2의 배수의 개수는" + i2);
			}
			if(i3 % 3 == 0) {
				i3 = i3 + 1;
				mu3 += tot;
				System.out.println("3의 배수의 개수는" + i3);
			}
			if(i5 % 5 == 0) {
				i5 = i5 + 2;
				mu2 += tot;
				System.out.println("5의 배수의 개수는" + i5);
			}
		
		}
		System.out.println((mu2 + mu3 - mu5));
		
	}
}
