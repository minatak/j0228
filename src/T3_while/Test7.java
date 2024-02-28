package T3_while;

// 1~100 홀, 짝수 합 구하라(switching 기법 활용)
public class Test7 {
	public static void main(String[] args) {
		int i = 0, odd = 0, even = 0, sw = 0;
		
		while(i < 100) {
			i = i + 1; 
			if (sw == 0) {
				odd = odd + i;
				sw = 1;
			}
			else {
				even = even + i;
				sw = 0;
			}
		}

		System.out.println("1~100까지의 홀수합 : " + odd);
		System.out.println("1~100까지의 짝수합 : " + even);
	}
}
