package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku dengan menyertakan tahun terbit lalu memasukkannya ke koleksi (Soal No. 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981)); // Tambahan buku untuk tes cari penulis

        // Menampilkan koleksi awal beserta tahun terbit
        perpus.tampilkanKoleksi();
        System.out.println();

        // Uji coba pinjam buku
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();

        // Uji coba KEMBALIKAN BUKU (Uji Soal No. 1)
        System.out.println("== Pengujian Kembalikan Buku ==");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        // Tampilkan koleksi setelah dikembalikan
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Uji coba CARI PENULIS (Uji Soal No. 3)
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("Tere Liye"); // Tes jika penulis tidak ditemukan
    }
}