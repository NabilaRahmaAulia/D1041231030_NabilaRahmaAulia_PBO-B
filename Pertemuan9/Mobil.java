class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;

    void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

    void percepat() {
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
    }

    void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}
