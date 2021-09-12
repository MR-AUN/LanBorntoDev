package Lab1;

import java.util.Scanner;

public class NumberPositive {
	public static void main(String[] args) {
		// topic บวกเล่นอย่างมีชั้น
		Scanner sc = new Scanner(System.in);
//	       	String codeATM = sc.next();

		String Number = sc.next();
		String[] StringNum = null;
		int num;

		StringNum = Number.split("[+]");
		int[] IntegerNum = new int[StringNum.length];
		for (int i = 0; i < StringNum.length; i++) {
			IntegerNum[i] = Integer.parseInt(StringNum[i]);
		}

		for (int i = 0; i < IntegerNum.length; i++) {
			for (int j = 0; j < IntegerNum.length; j++) {
				if (IntegerNum[i] < IntegerNum[j]) {
					num = IntegerNum[j];
					IntegerNum[j] = IntegerNum[i];
					IntegerNum[i] = num;
				}
			}
		}

		for (int i = 0; i < IntegerNum.length; i++) {
			System.out.print(IntegerNum[i] + (i == IntegerNum.length - 1 ? "" : "+"));
		}

	}
}
