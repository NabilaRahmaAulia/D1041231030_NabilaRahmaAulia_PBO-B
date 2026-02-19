public class LatihPerhitungan {
    public static void main(String[] args) {
        /*Saya sudah memahami bahwa variabel dapat berubah nilainya selama program berjalan, setiap perubahan nilai variabel merepresentasikan 
        perubahan state, dan konsep ini sangat penting dalam pemrograman berorientasi objek*/
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");

        long saldo = 1000000L;
        System.out.println("Saldo Awal             : " + saldo);

        long setoran = 500000L;
        System.out.println("Setoran                : " + setoran);

        saldo += setoran;
        System.out.println("Saldo Setelah Setor    : " + saldo);

        long penarikan = 250000L;
        System.out.println("Penarikan              : " + penarikan);

        saldo -= penarikan;
        System.out.println("Saldo Akhir            : " + saldo);
        
    }
}