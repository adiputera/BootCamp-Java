package hari01.logic01;

public class Logic01Soal07 {
	public static void main(String[] args) {
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j < 10; j++) {
				if (i <= j) {
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
