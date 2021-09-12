package Lab1;

import java.util.Scanner;

public class animal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//   	String codeATM = sc.next();
		String animal[][] = { { "Dog", "4" }, { "Cat", "4" }, { "Chicken", "2" }, { "Duck", "2" }, { "Cow", "4" },
				{ "Snake", "0" }, { "Bird", "2" } };
		String[] number = new String[3];
		String[] type = null;
		String[][] numAnimal = new String[3][2];
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			number[i] = sc.nextLine();
			if (number[i].equals(null)) {
				number[i] = sc.nextLine();
			}
		}
		for (int i = 0; i < number.length; i++) {

			type = number[i].split(" ");
			for (int j = 0; j < 2; j++) {
				numAnimal[i][j] = type[j];
			}
		}

		for (int i = 0; i < animal.length; i++) {
			for (int j = 0; j < numAnimal.length; j++) {
				if (numAnimal[j][0].equalsIgnoreCase(animal[i][0])) {
					sum += Integer.parseInt(numAnimal[j][1]) * Integer.parseInt(animal[i][1]);
				}
			}
		}

		System.out.println(sum);

	}
}
