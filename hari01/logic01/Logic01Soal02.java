package hari01.logic01;

public class Logic01Soal02 {
	public static void main(String[] args) {
		// loop baris
		for (int i = 9; i > 0; i--) {
			// loop kolom, berlawanan dengan i agar yang terakhir di kiri
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					System.out.print("* \t"); // * + tab
				}
				System.out.print("\t"); // * tab
			}
			System.out.println("\n"); // baris baru
		}
	}
}
