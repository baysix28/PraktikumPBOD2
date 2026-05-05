public class Bobot2 {
    public <T extends Kucing> double jumlahBobot(T kucing1, T kucing2) {
        // Algoritma
        return kucing1.getBobot() + kucing2.getBobot();
    }
}