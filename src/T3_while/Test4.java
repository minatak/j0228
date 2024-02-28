package T3_while;

// 1~100까지의 10항씩의 합을 출력하시오
/* 
  	1~10: 55
  	1~20 : 210
  	...
  	i%10 = 0
 */

public class Test4 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
				i = i + 1; 
				tot = tot + i; 
				if((i % 10) == 0) {
					System.out.println((i-9) + "부터 "+i+"까지의 합은"+tot+"입니다.");
					tot = 0;
				}
			}
		}
	}

