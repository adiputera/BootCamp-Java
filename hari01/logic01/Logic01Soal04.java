package hari01.logic01;

public class Logic01Soal04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 4 && j != 4) { // bikin garis horizontal tengah
					System.out.print("*");
				}
				if (i == j) { // garis miring kanan (\)
					System.out.print("* \t");
				} else if (j == 4 && i != 4) { // garis vertikal tengah
					System.out.print("* \t");
				} else if (i + j == 8) { // garis miring kiri (/)
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
