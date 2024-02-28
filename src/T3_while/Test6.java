package T3_while;

// 1~100 홀, 짝수 합 구하라
public class Test6 {
	public static void main(String[] args) {
		int i = 0, odd = 0, even = 0;
		
		while(i < 100) {
			i = i + 1; 
			odd = odd + i;
			i = i + 1;
			even = even + i;
		}

		System.out.println("1~100까지의 홀수합 : " + odd);
		System.out.println("1~100까지의 짝수합 : " + even);
	}
}
