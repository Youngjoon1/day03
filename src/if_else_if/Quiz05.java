package if_else_if;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

//		#1
//		점수를 입력받아 등급을 출력하는 프로그램을 작성해보자.(if문 이용)
//
//		(단, 점수는 0~100점까지만 입력 가능하며, 그 외의 점수를 입력하면 “잘못된 입력”이라는 메시지 출력 후, 종료)
//
//		◈ [90점 이상 : A등급], [80점 이상 : B등급], [70점 이상 : C등급], [60점 이상 : D등급], [60점 미만 : F등급]
//
//
//		#2
//		임의의 정수 2개를 입력받아 두 수를 비교하여 큰 수가 50을 초과하면 "최대 정수 입니다."를 출력하고 프로그램을 종료합니다.
//		초과하지 않는다면 바로 프로그램을 종료합니다.
//		단, IF문만 사용하며 딱 한 번만 사용해야 합니다. (else와 else if 사용 금지)
//
//		#3
//		최소 1시간 부터 최대 8시간까지 이용 가능한 카페가 있다.
//		이용시간 1시간당 요금은 10,000원 이며
//		3시간 이상 이용시 10% 할인, 5시간 이용시 20% 할인을 진행하고 있다.
//		이용시간에 따른 금액을 출력하시오.
//		(단, 가능하지 않은 이용 시간일 경우 가능한 이용시간을 알려주세요)
//		ex) 1시간 --> 10,000원/ 3시간 --> 27,000원/ 5시간 --> 40,000원/ 그 외 "잘못 입력" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이용시간을 입력해주세요: ");
		int time;
		time = sc.nextInt();
		
		
		if (time < 1) {
			System.out.println("이용시간은 1시부터 8시까지입니다.");
		}else if (time > 1 && time < 3) {
			System.out.println("이용요금" + time*10000);
		}else if (time >= 3 && time < 5) {
			double price = time*10000*0.9;
			System.out.println("이용요금" + (int)price);
		}else if (time > 5 && time < 8) {
			double price = time*10000*0.8;
			System.out.println("이용요금" + (int)price);
		}else {
			System.out.println("이용시간은 1시부터 8시까지입니다.");
		}
		
		
		
	
	}

}
