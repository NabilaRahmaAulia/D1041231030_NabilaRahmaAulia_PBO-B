public class LatihDataMahasiswa {
    public static void main(String[] args) {
        /*Saya sudah memahami caranya memilih tipe data yang tepat untuk berbagai jenis informasi, menggunakan String untuk teks yang lebih panjang,
        menggunakan char untuk karakter tunggal, menggunakan boolean untuk status ya/tidak, dan 
        menggunakan tipe data numerik yang sesuai dengan rentang nilai.*/

        long nim = 2301010001L;
        String nama = "Budi Santoso";
        char kelas = 'A';
        boolean status = true;
        double ipk = 3.75;
        int sks = 72;
        
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Status aktif    : " + status);
        System.out.println("IPK Semester    : " + ipk);
        System.out.println("Total SKS       : " + sks);

    }
}