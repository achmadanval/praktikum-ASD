public class Dosen02{
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen02(String kode, String nama, boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public String jeniskel(){
        return jenisKelamin ? "Pria" : "Wanita";
    }
}