public class Dosen02 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void setStatusAktif( boolean status){
        boolean aktif = true;
        if (aktif) {
            System.out.println("Dosen ini masih aktif");
        }else{
            System.out.println("Dosen ini tidak aktif mengajar ");
        }
    }
    int hitungMasaKerja (int thnSkrg){
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian (String bidang){
        bidangKeahlian = bidang;
    }
    public Dosen02(){

    }
    public Dosen02 (String idDosen , String nama ,int tahunBergabung , String bidangKeahlian, boolean statusAktif){
        this.idDosen =idDosen;
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
    }
}