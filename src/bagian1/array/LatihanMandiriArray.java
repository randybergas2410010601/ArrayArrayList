package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {

        // =========================
        // 1. Array suhu (double)
        // =========================
        double[] suhu = {30.5, 32.0, 29.8, 31.2, 33.5, 28.9};

        double max = suhu[0];
        double min = suhu[0];

        for (int i = 0; i < suhu.length; i++) {
            if (suhu[i] > max) {
                max = suhu[i];
            }
            if (suhu[i] < min) {
                min = suhu[i];
            }
             }

        System.out.println("=== Suhu ===");
        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah : " + min);


        // =========================
        // 2. Array nama hari
        // =========================
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("\n=== Nama Hari > 5 Huruf ===");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        // =========================
        // 3. Hitung angka genap
        // =========================
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("\n=== Jumlah Angka Genap ===");
        System.out.println("Total angka genap: " + jumlahGenap);
    }
    
    }
