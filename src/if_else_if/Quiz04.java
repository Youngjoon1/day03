package if_else_if;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("수 입력: ");
		num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("잘못입력 ");
		}else if(num % 3 == 0 && num % 4 == 0 ){
			System.out.println(num + ": 3,4의 배수입니다.");
		}else if(num % 3 == 0) {
			System.out.println(num + ": 3의 배수입니다.");
		}else if(num % 4 == 0) {
			System.out.println(num + ": 4의 배수입니다.");
		}else {
			System.out.println(num + ": 3,4의 배수가 아닙니다.");
		}
		
	}

}
