public class mataKuliah {

    String kodeMK;
    String nama;
    int  sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJam(int jam){
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jadwal tidak dapat dilakukan ");
        }else{
            jumlahJam -= jam;
        }
    }
    public mataKuliah(){

    } 
    public mataKuliah(String kodeMK, String nama , int sks ,int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}