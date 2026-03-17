/* Nama File    : Lingkaran.java
 * Deskripsi    : Subclass turunan dari BangunDatar untuk bangun Lingkaran
 * Pembuat      : Crystiano Bayu Satya Alves - 24060124140130
 * Tanggal      : 17 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
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

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
    }
}