public class Burung extends Anabul {
    // Algoritma
    public Burung() {
        super();
    }

    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara cuit cuit cuit");
    }
}