class PersegiData {
    int sisi;
    int luas;
    int keliling;

    // Constructor dengan validasi
    public PersegiData(int sisi) {
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }

        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    // Method menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {

        // Object dengan sisi valid
        PersegiData p1 = new PersegiData(5);

        // Object dengan sisi tidak valid
        PersegiData p2 = new PersegiData(-3);

        // Menampilkan hasil
        p1.tampilkanHasil();
        p2.tampilkanHasil();
    }
}