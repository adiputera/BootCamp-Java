package hari01.logic01;

public class Logic01Soal01 {
	public static void main(String[] args) {
		// loop baris
		for (int i = 0; i < 9; i++) {
			// loop kolom
			for (int j = 0; j < 9; j++) {
				if (i == j) {
					// print * jika i dan j sama (baris dan kolom sama)
					System.out.println("* \t");
				} else {
					// bikin tab jika tidak sama
					System.out.print("\t");
				}
			}
			System.out.print("\n");
		}
	}
}
