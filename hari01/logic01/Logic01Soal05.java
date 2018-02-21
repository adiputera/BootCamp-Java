package hari01.logic01;

public class Logic01Soal05 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0 || i == 8) { // bikin garis atas dan bawah
					System.out.print("* \t");
				} else if (j == 0 || j == 8) { // bikin garis kiri dan kanan
					System.out.print("* \t");
				} else if (i == j) { // bikin garis miring kanan
					System.out.print("* \t");
				} else if (i + j == 8) { // bikin garis miring kiri
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
