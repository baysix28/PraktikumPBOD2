/* Nama File    : Lingkaran.java
 * Deskripsi    : Subclass turunan dari BangunDatar untuk bangun Lingkaran
 * Pembuat      : Crystiano Bayu Satya Alves - 24060124140130
 * Tanggal      : 10 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super(); 
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border); 
        this.jari = diameter / 2.0; 
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Jari-jari: " + jari);
    }
}