package tugas;


// Nama : Randy Bergas Alaxsa Malanggy
// NPM  : 2410010601

public class MainTugas {
    public static void main(String[] args) {
        
        // 4. Menyimpan daftar nama mata kuliah dalam array String ukuran tetap (Soal No. 4)
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Sistem Operasi",
            "Informatika Medis"
        };

        // Menampilkan daftar mata kuliah menggunakan perulangan (Soal No. 4)
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // 3. Membuat objek KelasKuliah (Soal No. 3)
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 objek Mahasiswa awal (Soal No. 3)
        kelas.tambahMahasiswa(new Mahasiswa("Randy Bergas", "2410010601", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Alaxsa Malanggy", "2410010433", 68.0));
        kelas.tambahMahasiswa(new Mahasiswa("Enru Rizky", "2410010342", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Salsa Budigawis", "2410010233", 75.5));
        kelas.tambahMahasiswa(new Mahasiswa("Andi Ahmad", "2410010211", 65.0));

        // Menampilkan seluruh data mahasiswa awal
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();

        // 5. Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus (Soal No. 5)
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Data Mahasiswa  : " + kelas.getJumlahMahasiswa());
        System.out.println();

        // 6. Menambahkan satu objek Mahasiswa baru ke dalam koleksi (Soal No. 6)
        System.out.println("... Menambahkan 1 Mahasiswa Baru ...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Dibala", "2410010101", 66.0));
        System.out.println();

        // Menampilkan kembali data terbaru dan jumlah data setelah diperbarui (Soal No. 6)
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Terbaru : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println("Jumlah Data Terbaru     : " + kelas.getJumlahMahasiswa() + " mahasiswa");
    }
}