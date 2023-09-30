import java.util.Scanner;

public class Mhs {
    public static void main(String[] args) {
        // Variabel & Tipe Data
        String[] nama = new String[5];
        int[] usia = new int[5];
        int[][] nilai = new int[3][5]; // Array multidimensi 3x5 untuk menyimpan nilai mahasiswa

        // Input Data Mahasiswa menggunakan For Loop
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = scanner.next();
            System.out.print("Masukkan usia mahasiswa ke-" + (i + 1) + ": ");
            usia[i] = scanner.nextInt();
        }

        // Input Nilai Mahasiswa menggunakan For Loop
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print("Masukkan nilai mata kuliah ke-" + (i + 1) + " mahasiswa ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan Data Mahasiswa menggunakan While Loop
        System.out.println("\nData Mahasiswa (while loop):");
        int j = 0;
        while (j < 5) {
            System.out.println("Nama: " + nama[j] + ", Usia: " + usia[j] + " tahun");
            j++;
        }

        // Menampilkan Nilai Mahasiswa menggunakan Do-While Loop
        System.out.println("\nData Nilai Mahasiswa (do-while loop):");
        int k = 0;
        do {
            System.out.print("Nilai mahasiswa ke-" + (k + 1) + ": ");
            for (int l = 0; l < 3; ++l) {
                System.out.print(nilai[l][k] + " ");
            }
            System.out.println();
            k++;
        } while (k < 5);

        // Penggunaan If Statement
        int index_cari;
        System.out.print("\nMasukkan indeks data mahasiswa yang ingin dicari: ");
        index_cari = scanner.nextInt();

        if (index_cari >= 0 && index_cari < 5) {
            System.out.println("Data mahasiswa pada indeks " + index_cari + " - Nama: " + nama[index_cari] + ", Usia: " + usia[index_cari] + " tahun");
            System.out.print("Nilai mahasiswa: ");
            for (int l = 0; l < 3; ++l) {
                System.out.print(nilai[l][index_cari] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
}
