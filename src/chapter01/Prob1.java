package chapter01;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int result = number % 3;
		if (result == 0) {
			System.out.println("3의배수 ");
		} else {
			System.out.println("3의배수 아님 ");
		}
		
	}

}
