package Lab1;

import java.util.Scanner;

public class sentencesIncluded {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int number = sc.nextInt();
		String show = "";
		String[] Str = new String[number];
		String lastStr = null;
		int numberLoop = 0;
		sc.nextLine();
		for (int i = 0; i < number; i++) {
			Str[i] = sc.nextLine();
			if (Str[i].equals(null)) {
				Str[i] = sc.nextLine();
			}
		}
		// check String Upper
		String StrOne = Str[0]; // เก็บประโยคแรก
		String StrTwo = null; // ตัวแปนเก็บประโยคที่เหมือนกัน
		for (int i = 0; i < Str.length; i++) {

			// ถ้าตัวอักษรแรกเป็นตัวพิมพ์ใหญ่ ใช้ ASCII เปรียบเทียบ
			if ((int) Str[i].charAt(0) > 64 && (int) Str[i].charAt(0) < 91) {
				Str[0] = Str[i];
				Str[i] = StrOne;

				break;
			}

		}

		// ตรวจสอบประโยคที่ต่อกัน
		for (int i = 0; i < Str.length; i++) {
			String[] NextOne = Str[i].split(" ");
			for (int j = i + 1; j < Str.length; j++) {
				String[] NextTwo = Str[j].split(" ");
				boolean check = false;
				// ตรวจสอบโยคที่เหมือนกัน

				for (int l = 0; l < NextTwo.length; l++) {
					if (NextOne[NextOne.length - 1].equals(NextTwo[l])) {
						numberLoop = l;
						check = true;
					}
					if (check) {
						break;
					}
				}

				for (int l = 0; l < numberLoop; l++) {
					NextTwo[l] = "";
				}

				if (check) {
					// ตัดตัวประโยค คำที่ซํ้ากัน
					String StrSort = "";
					// เรียงข้อมูลเข้าไปใหม่
					for (int sort = numberLoop + 1; sort < NextTwo.length; sort++) {
						if (sort == NextTwo.length - 1) {
							StrSort += NextTwo[sort];
						} else {
							StrSort += NextTwo[sort] + " ";
						}
					}
					Str[j] = StrSort;
					StrTwo = Str[i + 1];
					Str[i + 1] = Str[j];
					Str[j] = StrTwo;
				}
			}
		}

		// show data in array
		for (int i = 0; i < Str.length; i++) {
			if (i == Str.length - 1) {
				System.out.print(Str[i]);
			} else {
				System.out.print(Str[i] + " ");
			}
		}
	}
}
