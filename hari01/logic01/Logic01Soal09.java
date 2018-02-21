package hari01.logic01;

public class Logic01Soal09 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ((i + j < 9 && i >= j) || (i + j >= 8 && i <= j)) {
					// samping kiri samping kanan
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
