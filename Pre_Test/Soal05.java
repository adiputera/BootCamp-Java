package PreTest;

import xsis.bc.util.PrintArray;

public class Soal05 {
	private String[][] data;
	public Soal05(int n) {
		this.data = new String[n][n];
		buatBentuk(n);
		PrintArray.array2D(data);
	}
	
	public void buatBentuk(int n) {
		int geser=0;
		int k=1; //untuk batas print 1x
		int m=0; //untuk mengecek mau print kanan atau kiri
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if(i%2==0) {
					data[i][j]="@";
					k=1;
				}else {
					if(k==1) { //print sekali
						if(m%2==0) { //jika mod 2 =0, print 1x di kanan
							data[i][n-geser-1] = "@";
							geser++;
							k=0; //agar print 1 baris cuma sekali, lainnya dilewati
							m++; //agar print di lain arah
						}else {
							data[i][j+geser] = "@";
							geser++;
							k=0;
							m++;
						}
					}
				}
			}
		}
	}
}
