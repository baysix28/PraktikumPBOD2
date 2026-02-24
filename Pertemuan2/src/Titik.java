/* Nama File        : Titik.java
 * Deskripsi        : berisi atribut dan method dalam class Titik
 * Pembuat          : Crystiano Bayu Satya Alves
 * Tanggal          :
 */

public class Titik {

    /*********ATRIBUT*********/
    double absis;
    double ordinat;

    /*********METHOD*********/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser titik
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    //mengembalikan kuadran titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0;
    }

    //mengembalikan jarak titik ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //mengembalikan jarak ke titik lain
    double getJarak(Titik T) {
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //refleksi terhadap sumbu X
    void refleksiX() {
        ordinat = -ordinat;
    }

    //refleksi terhadap sumbu Y
    void refleksiY() {
        absis = -absis;
    }

    //mengembalikan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    //mengembalikan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

}