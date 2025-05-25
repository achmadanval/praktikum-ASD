public class Mahasiswa02 {

    String nim,nama,kelas;
    double ipk;

    Mahasiswa02(){

    }
    Mahasiswa02(String nm, String name, String kls,double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;

    }
    public void tampilInformasi(){
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}