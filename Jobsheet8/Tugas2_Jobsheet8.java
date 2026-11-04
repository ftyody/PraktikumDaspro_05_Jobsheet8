package Jobsheet8;
import java.util.Scanner;
public class Tugas2_Jobsheet8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nilai n = ");
		int n = sc.nextInt();

		if (n < 3) {
			System.out.println("Nilai n minimal 3.");
		} else {
			int jumlah = 0;

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					int hasil = i * j;

					if (hasil < 10) {
						System.out.print("   ");
					} else if (hasil < 100) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}
					System.out.print(hasil);

					jumlah += hasil;
				}
				System.out.println();
			}

			System.out.println("Jumlah seluruh angka: " + jumlah);
		}

		sc.close();
	}
}