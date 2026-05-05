public class Datum<T> {
    // Kamus
    private T isi;

    // Algoritma
    public Datum() {
        this.isi = null;
    }

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}