class MobilData {
    String merk;
    String warna;
    int tahun;

    // Constructor 1: tanpa parameter
    public MobilData() {
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    // Constructor 2: 1 parameter (merk saja)
    public MobilData(String merk) {
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }

    // Constructor 3: 3 parameter
    public MobilData(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method menampilkan spesifikasi
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {

        // Object dengan constructor berbeda
        MobilData mobil1 = new MobilData();
        MobilData mobil2 = new MobilData("Toyota");
        MobilData mobil3 = new MobilData("Honda Civic", "Merah", 2023);

        // Menampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}