package if_;

import java.util.Scanner;

public class TestClass03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num;
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("1. 입력 값은 짝수 : " + num);
			System.out.println("2. 입력 값은 짝수 : " + num);
			System.out.println("3. 입력 값은 짝수 : " + num);
		}
		if (num % 2 != 0) {//if (num % 2 == 1)
			System.out.println("1. 입력 값은 홀수 : " + num);
			System.out.println("2. 입력 값은 홀수 : " + num);
			System.out.println("3. 입력 값은 홀수 : " + num);
		}
		System.out.println("다음 문장들 실행");
		System.out.println("다음 문장들 실행");
		
	}
}
