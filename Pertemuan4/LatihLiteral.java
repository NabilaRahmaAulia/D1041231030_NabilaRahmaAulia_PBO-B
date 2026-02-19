public class LatihLiteral {
    public static void main(String[] args) {
        /*Saya sudah memahami penulisan literal untuk setiap tipe data, penggunaan suffix untuk membedakan tipe data floating-point dan long,
        dan aturan penulisan literal untuk char dan boolean
         */
        System.out.println("=== DEMONSTRASI LITERAL TIPE DATA ===");

        byte tipebyte = 127;
        short tipeshort = 2026;
        int tipeint = 275000000;
        long tipelong = 8000000000L;
        float tipefloat = 3.14f;
        double tipedouble = 2.718281828;
        char tipechar = 'N';
        boolean tipeboolean = true;

        System.out.println("Tipe byte     : " + tipebyte);
        System.out.println("Tipe short    : " + tipeshort);
        System.out.println("Tipe int      : " + tipeint);
        System.out.println("Tipe long     : " + tipelong);
        System.out.println("Tipe float    : " + tipefloat);
        System.out.println("Tipe double   : " + tipedouble);
        System.out.println("Tipe char     : " + tipechar);
        System.out.println("Tipe boolean  : " + tipeboolean);
    }
}