package hari01;

public class Kondisi {
	public static void main(String[] args) {
		//pendeklarasian variable
		int angka = 10;
		if(angka/2 == 5) {
			System.out.println("Angka dibagi dua sama dengan 5");
		}
		else if(angka * 2 == 20) {
			System.out.println("Angka dikali dua = 20");
		}
		else if(angka % 2 == 0) {
			System.out.println("Angka mod 2 = 0");
		}
		else if(angka % 4 == 2) {
			System.out.println("Angka mod 4 = 2");
		}
		else {
			System.out.println("Angka tidak dapat diproses");
		}
	}

}
