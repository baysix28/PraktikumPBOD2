public class Kendaraan {

    /*********ATRIBUT*********/
    private String noPlat;
    private String jenis;


    /**********METHOD*********/

    //konstruktor untuk membuat kendaraan tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    //kontruktor untuk membuat kendaraan dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor
    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    //mutator
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


}