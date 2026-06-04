package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        
        
        // SOAL 1: Daftar Belanja
        
        System.out.println("=== SOAL 1 ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Telur");
        
        // Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);
        
        System.out.println("Isi list       : " + daftarBelanja);
        System.out.println("Jumlah akhirnya: " + daftarBelanja.size());
        System.out.println(); // Baris baru untuk jarak

        
        
        // SOAL 2: Mencari Nilai Terbesar
        
        System.out.println("=== SOAL 2 ===");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(45);
        nilai.add(82);
        nilai.add(95);
        nilai.add(67);
        nilai.add(50);
        
        int terbesar = nilai.get(0);
        for (int n : nilai) {        // for-each pada ArrayList
            if (n > terbesar) {
                terbesar = n;
            }
        }
        
        System.out.println("Data           : " + nilai);
        System.out.println("Nilai Terbesar : " + terbesar);
        System.out.println(); // Baris baru untuk jarak

        
        
        // SOAL 3: Filter Nama yang Diawali Huruf 'A'
        
        System.out.println("=== SOAL 3 ===");
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Randy");
        nama.add("Anya");
        nama.add("Aqila");
        nama.add("Bergas");
        nama.add("Ahmad");
        nama.add("Dedi");
        
        System.out.println("Semua Nama: " + nama);
        System.out.println("Nama yang diawali huruf A:");
        
        for (String n : nama) {      // for-each pada ArrayList
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
    }
    
}
