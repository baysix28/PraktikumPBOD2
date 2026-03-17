/* Nama File : Dosen.java
   Deskripsi : Berisi atribut dan metode-metode dalam class Dosen
   Pembuat   : Crystiano Bayu Satya Alves - 24060124140130
   Tanggal   : 15 Maret 2026
*/

import java.time.LocalDate;
public class Dosen extends Pegawai {
    
    /* ATRIBUT */
    protected String fakultas;

    /* METHOD */
    // Konstruktor dengan parameter
    public Dosen (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Method untuk menampilkan informasi mengenai dosen dan fakultas
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas    : " + fakultas);
    }
}