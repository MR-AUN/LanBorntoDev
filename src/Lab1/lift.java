package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class lift {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> number = new ArrayList<String>();
		String check = null;
		boolean add = false;
		boolean error = true;
		do {
			if (add) {
				number.add(check);
			}
			check = sc.next();
			add = true;
		} while (!check.equals("-"));

		// เรียงตัวเลข
		String num;
		for (int i = 0; i < number.size(); i++) {
			for (int j = 0; j < number.size(); j++) {
				if (number.get(i).compareTo(number.get(j)) < 0) {
					num = number.get(j);
					number.set(j, number.get(i));
					number.set(i, num);
				}
			}
		}
		for (int i = 0; i < number.size(); i++) {
			if (number.get(i).equals("0")) {
				System.out.print("Error! Not have this floor");
				error = false;
				break;
			}
		}

		if (error) {
			String line = "---------------";
			System.out.println("OK! Wait please");
			System.out.println(line);
			System.out.println("Lift is arriving!");
			System.out.println(line);
			for (int i = 0; i < number.size(); i++) {
				System.out.println("Lift is going up!");
				System.out.println(line);
				switch (number.get(i)) {
				case "1":
					System.out.print("Lift has reached the " + number.get(i) + "st floor!");
					break;
				case "2":
					System.out.print("Lift has reached the " + number.get(i) + "nd floor!");
					break;
				case "3":
					System.out.print("Lift has reached the " + number.get(i) + "rd floor!");
					break;
				default:
					System.out.print("Lift has reached the " + number.get(i) + "th floor!");
					break;
				}
//				System.out.print("Lift has reached the " + number.get(i) + "st floor!");
				System.out.println(i == number.size() - 1 ? "" : "\n" + line);
			}
		}
	}
}
