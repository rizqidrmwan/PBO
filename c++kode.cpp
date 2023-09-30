#include <iostream>
using namespace std;

int main() {
    // Variabel & Tipe Data
    string nama[5];
    int usia[5];
    int nilai[3][5]; // Array multidimensi 3x5 untuk menyimpan nilai mahasiswa

    // Input Data Mahasiswa menggunakan For Loop
    for (int i = 0; i < 5; ++i) {
        cout << "Masukkan nama mahasiswa ke-" << i + 1 << ": ";
        cin >> nama[i];
        cout << "Masukkan usia mahasiswa ke-" << i + 1 << ": ";
        cin >> usia[i];
    }

    // Input Nilai Mahasiswa menggunakan For Loop
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 5; ++j) {
            cout << "Masukkan nilai mata kuliah ke-" << i + 1 << " mahasiswa ke-" << j + 1 << ": ";
            cin >> nilai[i][j];
        }
    }

    // Menampilkan Data Mahasiswa menggunakan While Loop
    cout << "\nData Mahasiswa (while loop):\n";
    int j = 0;
    while (j < 5) {
        cout << "Nama: " << nama[j] << ", Usia: " << usia[j] << " tahun\n";
        j++;
    }

    // Menampilkan Nilai Mahasiswa menggunakan Do-While Loop
    cout << "\nData Nilai Mahasiswa (do-while loop):\n";
    int k = 0;
    do {
        cout << "Nilai mahasiswa ke-" << k + 1 << ": ";
        for (int l = 0; l < 3; ++l) {
            cout << nilai[l][k] << " ";
        }
        cout << endl;
        k++;
    } while (k < 5);

    // Penggunaan If Statement
    int index_cari;
    cout << "\nMasukkan indeks data mahasiswa yang ingin dicari: ";
    cin >> index_cari;

    if (index_cari >= 0 && index_cari < 5) {
        cout << "Data mahasiswa pada indeks " << index_cari << " - Nama: " << nama[index_cari] << ", Usia: " << usia[index_cari] << " tahun\n";
        cout << "Nilai mahasiswa: ";
        for (int l = 0; l < 3; ++l) {
            cout << nilai[l][index_cari] << " ";
        }
        cout << endl;
    } else {
        cout << "Indeks tidak valid.\n";
    }

    return 0;
}
