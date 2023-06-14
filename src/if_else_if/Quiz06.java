package if_else_if;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(((n1 > n2) ? n1 : n2) > 50) {
			System.out.println("최대정수입니다.");
		}
		
		
	}

}
