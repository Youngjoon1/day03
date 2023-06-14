package if_else_if;

import java.util.Scanner;

public class QuizQuiz {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포도(1), 사과(2), 오렌지(3), 딸기(4)");
		System.out.print("원하시는 과일 음료의 변호를 선택해주세요: ");
		
		int drink;
		
		drink = sc.nextInt();
		
		
		if (drink == 1) {
			System.out.println("포도 음료가 나왔습니다.");
		}else if (drink == 2) {
			System.out.println("사과 음료가 나왔습니다.");
		}else if (drink == 3) {
			System.out.println("오렌지 음료가 나왔습니다.");
		}else if (drink == 4) {
			System.out.println("딸기 음료가 나왔습니다.");
		}else if(drink == 0) {
			System.out.println("기계를 종료합니다.");
		}else {
			System.out.println("메뉴에 없는 음료입니다.");
		}
		
		System.out.println("음료기계");
			
		
		
		
	}

}
