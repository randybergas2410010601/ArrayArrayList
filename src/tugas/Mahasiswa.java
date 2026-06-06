package tugas;

public class Mahasiswa {
    // Atribut model (Soal No. 1)
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk menginisialisasi data mahasiswa (Soal No. 1)
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk mengakses atribut dari luar class (Soal No. 1)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method untuk mengecek kelulusan, mengembalikan true jika nilai >= 60 (Soal No. 1)
    public boolean lulus() {
        return this.nilai >= 60;
    }
}