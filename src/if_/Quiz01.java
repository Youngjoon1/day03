package if_;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		int num;
		num = sc.nextInt();
		
		if (num % 3 == 0) 
			System.out.println("3의 배수입니다.");
		if (num % 3 != 0)
			System.out.println("3의 배수가 아닙니다.");
		
		System.out.print("수를 3번 입력하세요: ");
		int n1;
		n1 = sc.nextInt();
		int n2;
		n2 = sc.nextInt();
		int n3;
		n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1);
		
		if (n2 > n1 && n2 > n3)
			System.out.println(n2);
		
		if (n3 > n1 && n3 > n2)
			System.out.println(n3);
		
//		int max = 0;
//		if ( n1 > n2) {
//			max = n1;
//		}
//		if ( n2 > n1) {
//			max = n2;
//		}
//		if ( n3 > max) {
//			max = n3;
//		}
//		System.out.println("max : " + max);
		
		System.out.print("두 수를 입력하세요: ");
		int num1;
		num1 = sc.nextInt();
		int num2;
		num2 = sc.nextInt();
		
		if (num1 > num2 && num1 % 2 == 0)
			System.out.println(num1);
		
		if (num2 > num1 && num2 % 2 == 0)
			System.out.println(num2);
		
	}

}
