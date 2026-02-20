/* Nama File        : Titik.java
 * Deskripsi        : berisi atribut dan method dalam class Titik
 * Pembuat          : Crystiano Bayu Satya Alves
 * Tanggal          :
 */

public class Titik {
    /********** ATRIBUT **********/
    double absis;
    double ordinat;
    static int counterTitik;

    /********** METHOD **********/
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset nilai absis
    void setAbsis(double a) {
        absis = a;
    }

    // Mengeset nilai ordinat
    void setOrdinat(double o) {
        ordinat = o;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

}