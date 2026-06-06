package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // Tambahan atribut (Soal No. 2)

    // Constructor: dipanggil saat objek dibuat (Diperbarui untuk Soal No. 2)
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; // Tambahan inisialisasi
        this.dipinjam = false; // buku baru dianggap tersedia
    }

    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Getter untuk tahunTerbit (Tambahan Soal No. 2)
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Mengembalikan keterangan buku dalam bentuk teks (Diperbarui untuk Soal No. 2)
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        // Menampilkan tahun terbit di dalam method info
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}