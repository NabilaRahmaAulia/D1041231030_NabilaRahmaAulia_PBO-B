class BukuData {
    String judul;
    String pengarang;
    int harga;

    // Constructor 1: tanpa parameter (default)
    public BukuData() {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    // Constructor 2: dengan parameter
    public BukuData(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
    }
}

public class LatihanBukuConstructor {
    public static void main(String[] args) {

        // Object dengan constructor default
        BukuData buku1 = new BukuData();

        // Object dengan constructor parameter
        BukuData buku2 = new BukuData("Pemrograman Java", "Budi Raharjo", 125000);
        BukuData buku3 = new BukuData("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        // Menampilkan info semua buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}