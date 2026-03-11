public class LatihanCounter {
    public static void main (String[] args) {
        int a = 10;

        System.out.println ("=== COUNTER ===");
        System.out.println ("Nilai awal: " + a);
        a++;
        a++;
        System.out.println ("Setelah ++ (2x) : " + a);
        a--;
        System.out.println ("Setelah --      : " + a);
        a += 5;
        System.out.println ("Setelah += 5    : " + a);
        a -= 3;
        System.out.println ("Setelah -= 3    : " + a);
        a*=2;
        System.out.println ("Setelah *= 2    : " + a);
    }
}
