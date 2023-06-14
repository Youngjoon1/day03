package if_else_if;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		int answer = 0;
		
		for(int i = 2; i <= 20; i+=2) {
			answer += i;
		}
		
		System.out.println(answer);
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int a = numbers.length - 1;
		System.out.println(a);
		double result;
		result = ((numbers[0] + (double)numbers[a]) / 2);
		System.out.println(result);
		
	
	}

}
