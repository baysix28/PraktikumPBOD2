/* Nama File    : Persegi.java
 * Deskripsi    : Subclass turunan dari BangunDatar untuk bangun Persegi
 * Pembuat      : Crystiano Bayu Satya Alves - 24060124140130
 * Tanggal      : 10 Maret 2026
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2 * (sisi * sisi));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}