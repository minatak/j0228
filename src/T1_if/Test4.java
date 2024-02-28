package T1_if;

import java.util.Scanner;

// 점수를 입력받아서 학점을 구하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 0;
		char gr;
		
		System.out.print("점수를 입력하세요 : ");
		su = sc.nextInt();
		
		if(su >= 90) gr = 'A';
		else if(su >= 80) gr = 'B';
		else if(su >= 70) gr = 'c';
		else if(su >= 60) gr = 'd';
		else gr = 'F';
		
		System.out.println("점수 "+su+"점은 "+gr+"학점 입니다.");
		
		
		sc.close();
	}
}
