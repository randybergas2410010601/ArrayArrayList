package tugas;

import java.util.ArrayList; // Wajib di-import untuk menggunakan ArrayList

public class KelasKuliah {
    // Menyimpan koleksi objek bertipe Mahasiswa (Soal No. 2)
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method untuk menambah mahasiswa ke dalam koleksi (Soal No. 2)
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung rata-rata nilai mahasiswa (Soal No. 2 & 5)
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai(); // Menggunakan getter dari class Mahasiswa
        }
        return total / daftarMahasiswa.size(); // size() untuk ukuran ArrayList
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus (Soal No. 2 & 5)
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) { // Memanggil method lulus() dari model Mahasiswa
                count++;
            }
        }
        return count;
    }

    // Method untuk mendapatkan jumlah total data saat ini (Soal No. 6)
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    // Method untuk menampilkan semua data mahasiswa (Soal No. 2)
    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-3s | %-12s | %-15s | %-6s | %-10s\n", "No", "NPM", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-3d | %-12s | %-15s | %-6.1f | %-10s\n", 
                    (i + 1), mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }
}