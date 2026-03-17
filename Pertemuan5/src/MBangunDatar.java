/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class untuk menguji kelas BangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Crystiano Bayu Satya Alves - 24060124140130
 * Tanggal      : 17 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        System.out.println("=== PERSEGI ===");
        Persegi p1 = new Persegi(10.0, "Biru", "Solid");
        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());

        System.out.println("\n=== LINGKARAN ===");
        Lingkaran l1 = new Lingkaran(14.0, "Merah", "Dotted");
        l1.printInfo();
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        System.out.println("\n=== POLYMORPHISM ===");
        BangunDatar p2 = new Persegi(5.0, "Hijau", "Solid");
        BangunDatar l2 = new Lingkaran(7.0, "Kuning", "Dotted");

        System.out.println("Luas p2: " + p2.getLuas());
        System.out.println("Luas l2: " + l2.getLuas());

        System.out.println("\n=== PERBANDINGAN ===");
        System.out.println("Luas p1 == p2 ? " + p1.isEqualLuas(p2));
        System.out.println("Keliling l1 == l2 ? " + l1.isEqualKeliling(l2));

        System.out.println("\n=== UJI RESIZE ===");

        p1.zoomIn();
        System.out.println("Persegi setelah zoomIn: " + p1.getLuas());

        l1.zoomOut();
        System.out.println("Lingkaran setelah zoomOut: " + l1.getLuas());

        p1.zoom(200);
        System.out.println("Persegi setelah zoom 200%: " + p1.getLuas());

        System.out.println("\n=== COUNTER ===");
        BangunDatar.printCounterBangunDatar();
    }
}