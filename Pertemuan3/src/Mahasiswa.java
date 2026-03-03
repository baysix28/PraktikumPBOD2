public class Mahasiswa {
    /********* ATRIBUT *********/
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul; 
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    // Variabel bantu untuk menghitung isi array statik
    private int jumlahMatKulTerisi;

    /********** METHOD *********/

    // 1. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKulTerisi = 0;
    }

    // 2. Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKulTerisi = 0;
    }

    // 3. Selektor dan Mutator untuk semua atribut
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public Dosen getDosenWali() { return dosenWali; }
    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }

    public Kendaraan getKendaraan() { return kendaraan; }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }

    // 4. Method addMatKul()
    public void addMatKul(MataKuliah newMatKul) {
        if (this.jumlahMatKulTerisi < 50) {
            this.listMatKul[this.jumlahMatKulTerisi] = newMatKul;
            this.jumlahMatKulTerisi++;
        } else {
            System.out.println("Kapasitas Mata Kuliah sudah penuh!");
        }
    }

    // 5. Method getJumlahSKS()
    public int getJumlahSKS() {
        int totalSks = 0;
        for (int i = 0; i < this.jumlahMatKulTerisi; i++) {
            totalSks += this.listMatKul[i].getSks();
        }
        return totalSks;
    }

    // 6. Method getJumlahMatKul()
    public int getJumlahMatKul() {
        return this.jumlahMatKulTerisi;
    }

    // 7. Method printMhs()
    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // 8. Method printDetailMhs()
    public void printDetailMhs() {
        printMhs();
        
        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama()); // Asumsi Dosen punya getNama()
        } else {
            System.out.println("Dosen Wali : -");
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan  : " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        } else {
            System.out.println("Kendaraan  : -");
        }

        System.out.println("Daftar Mata Kuliah:");
        if (jumlahMatKulTerisi == 0) {
            System.out.println("- Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatKulTerisi; i++) {
                System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
            }
        }
    }
}