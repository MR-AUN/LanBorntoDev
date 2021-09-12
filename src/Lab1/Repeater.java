package Lab1;

import java.util.Scanner;

public class Repeater {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String message = sc.next();

		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < message.length() - i - 1; j++) {
				System.out.print("  ");
			}

			for (int j = i; j > 0; j--) {
				System.out.print(message.charAt(j) + " ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(message.charAt(j) + " ");
			}
			System.out.println();
		}

	}
}
