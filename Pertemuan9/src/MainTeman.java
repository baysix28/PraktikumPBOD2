public class MainTeman {
    public static void main(String[] args) {
        // Kamus & Algoritma (Digabung agar lebih ringkas)
        Teman T = new Teman();
        
        String Teman1 = "Opan";
        String Teman2 = "Caesar";
        String Teman3 = "Ferdy";
        String Teman4 = "Devano";
        String Teman5 = "Lutfi";
        String Teman5_rename = "Luthfi Armando Pasya";
        String Teman6 = "Ali";  
        String Teman7 = "Azka";  
        String Teman8 = "Basil"; 
        String Teman9 = "Dinda"; 
        String Teman10 = "Elza"; 
        String Teman11 = "Hanif"; 
        String Teman12 = "Hasta"; 
        String Teman13 = "Izzat"; 
        String Teman14 = "Marchella"; 
        String Teman15 = "Menza"; 
        String Teman16 = "Rama"; 
        String Teman17 = "Naufal Dwi"; 
        String Teman18 = "Atta";
        String Teman19 = "Novelya"; 

        System.out.println("NBElement : " + T.getNbelm());

        T.addNama(Teman1);
        T.addNama(Teman2);
        T.addNama(Teman3);
        T.addNama(Teman4);
        T.addNama(Teman5);
        T.addNama(Teman6);
        T.addNama(Teman7);
        T.addNama(Teman8);
        T.addNama(Teman9);
        T.addNama(Teman10);
        T.addNama(Teman11);
        T.addNama(Teman12);
        T.addNama(Teman13);
        T.addNama(Teman14);
        T.addNama(Teman15);
        T.addNama(Teman16);
        T.addNama(Teman17);
        T.addNama(Teman18);
        T.addNama(Teman19);

        System.out.println("Nama Teman 1 : " + T.getNama(1));
        System.out.println("Apakah Luthfi merupakan teman : " + T.isMember("Luthfi"));
        System.out.println("NBElement Sekarang : " + T.getNbelm());

        T.addNama(Teman6);
        System.out.println("Setelah Add Teman 6 : " + T.getNbelm());
        System.out.println("Count Nama Caesar : " + T.countNama(Teman6));

        System.out.println("Set Nama Teman ke-2 menjadi 'Caesar (Update)'");
        T.setNama(2, "Caesar (Update)");

        System.out.println("Ganti Nama Luthfi Menjadi Luthfi Armando Pasya");
        T.gantiNama(Teman5, Teman5_rename);

        System.out.println("Seluruh teman sekarang : ");
        T.showTeman();

        System.out.println("Delete Caesar");
        T.delNama("Caesar");

        System.out.println("Seluruh teman setelah delete : ");
        T.showTeman();
        System.out.println("NBElement Akhir : " + T.getNbelm());
    }
}