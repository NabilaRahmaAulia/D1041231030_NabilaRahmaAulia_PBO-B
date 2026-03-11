public class LatihanProduk {
    public static void main (String[] args) {
        String namaproduk = "Laptop Asus";
        long hargasatuan = 7000000L;
        int jumlahstok = 15;
        boolean tersedia = true;
        double pajak = 0.11;

        long nilaistok;
        nilaistok = hargasatuan*jumlahstok;
        double hitungpajak;
        hitungpajak = nilaistok*pajak;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk      : " + namaproduk);
        System.out.println("Harga Satuan     : " + hargasatuan);
        System.out.println("Jumlah Stok      : " + jumlahstok);
        System.out.println("Status Tersedia  : " + tersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok : Rp." + nilaistok);
        System.out.println("Pajak (11%)      : Rp." + (int) hitungpajak);

    }
}
