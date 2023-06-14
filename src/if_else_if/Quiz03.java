package if_else_if;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num;
		num = sc.nextInt();
		
		if (num % 3 == 0 && num % 4 == 0) {
			System.out.println("1) 3의 배수이면서, 4의 배수입니다.");
		}
		if (num % 3 ==0) {
			System.out.println("2) 3의 배수입니다.");
		}
		if (num % 4 ==0) {
			System.out.println("3) 4의 배수입니다.");
		}
		if (num % 3 == 0 || num % 4 == 0) {
			
		}else {
			System.out.println("3의 배수도, 4의 배수도 해당안됨");
		}
		if (num == 0) {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
	}

}
