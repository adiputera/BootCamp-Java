package hari01.logic01;

public class Logic01PostTest {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 4 && i != 4) { // garis vertikal
					System.out.print("* \t");
				} else if (i == j && i > 4) { // miring kiri \
					System.out.print("* \t");
				} else if (i + j == 8 && i >= 4) { // miring kanan /
					System.out.print("* \t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
