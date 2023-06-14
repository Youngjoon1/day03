package if_else_if;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("커피의 개수를 입력해주세요: ");
		int coffee;
		coffee = sc.nextInt();
		
		int price = 2000;
		
		if (coffee <= 10) {
			System.out.println(coffee + " = " + coffee*price );
		}else {
			price = 1500;
			System.out.println(coffee + " = " + coffee*price);
		}
			
	}

}
