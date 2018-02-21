package hari01.logic01;

public class Logic01PR {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 4 && j != 4) { // horizontal tengah
					System.out.print(j * 2 + 1);
				}
				if (i == j) { // miring kanan \
					System.out.print(i * 2 + 1 + "\t");
				} else if (j == 4 && i != 4) { // vertikal tengah
					System.out.print(i * 2 + 1 + "\t");
				} else if (i + j == 8) { // miring kiri /
					System.out.print(j * 2 + 1 + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
