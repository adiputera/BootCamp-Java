package hari01;

public class Looping {
	public static void main(String[] args) {
		//menampilkan baris ke samping
		for (int i = 0; i < 10; i++) {
			System.out.println("Looping ke " + i);
		}
		//menampilkan loop ke samping
		for (int i = 0; i < 10; i++) {
			System.out.print("Looping ke "+ i + " ");
		}
		//looping baris
		for (int i = 0; i < 10; i++) {
			//looping kolom (ke samping)
			for (int j = 0; j < 10; j++) {
				System.out.print("* \t"); // \t = tab
			}
			System.out.println("\n"); // \n pindah baris
		}
	}

}
