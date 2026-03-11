

public class Latihan2ClassMobil {
    public static void main(String[] args) {

        // Membuat object mobil
        Mobil mobil1 = new Mobil();

        // Mengisi atribut
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;

        // Menampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();

        // Mempercepat mobil dua kali
        mobil1.percepat();
        mobil1.percepat();

        // Menampilkan kecepatan akhir
        mobil1.tampilkanKecepatan();
    }
}