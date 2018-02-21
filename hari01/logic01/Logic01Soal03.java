package hari01.logic01;

public class Logic01Soal03 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == j) { // miring kanan \
					System.out.print("* \t");
				} else if (j + i == 8) { // miring kiri /
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
