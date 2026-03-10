/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class untuk menguji kelas BangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Crystiano Bayu Satya Alves - 24060124140130
 * Tanggal      : 10 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN KELAS PERSEGI ===");
        Persegi p1 = new Persegi(10.0, "Biru", "Solid");
     
        p1.printInfo();
        
        System.out.println("Luas Persegi: " + p1.getLuas());
        System.out.println("Keliling Persegi: " + p1.getKeliling());
        System.out.println("Diagonal Persegi: " + p1.getDiagonal());

        System.out.println("\n-----------------------------------\n");

        System.out.println("=== PENGUJIAN KELAS LINGKARAN ===");
        Lingkaran l1 = new Lingkaran(14.0, "Merah", "Dotted");
        
        
        l1.printInfo();
        
        // Menguji method perhitungan
        System.out.println("Luas Lingkaran: " + String.format("%.2f", l1.getLuas()));
        System.out.println("Keliling Lingkaran: " + String.format("%.2f", l1.getKeliling()));
    }
}