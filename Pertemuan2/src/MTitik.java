public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();
        Titik T2 = new Titik(3,4);

        System.out.println("Absis T2 = " + T2.getAbsis());
        System.out.println("Ordinat T2 = " + T2.getOrdinat());

        T2.geser(2,1);
        System.out.println("Setelah digeser:");
        System.out.println("Absis = " + T2.getAbsis());
        System.out.println("Ordinat = " + T2.getOrdinat());

        System.out.println("Kuadran T2 = " + T2.getKuadran());
        System.out.println("Jarak ke pusat = " + T2.getJarakPusat());
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));

        Titik RX = T2.getRefleksiX();
        Titik RY = T2.getRefleksiY();

        System.out.println("Refleksi X = (" + RX.getAbsis() + "," + RX.getOrdinat() + ")");
        System.out.println("Refleksi Y = (" + RY.getAbsis() + "," + RY.getOrdinat() + ")");
    }
}