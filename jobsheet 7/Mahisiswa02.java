public class Mahisiswa02{
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahisiswa02(){

    }
    Mahisiswa02(String nm , String name , String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("NIM = " + nim);
        System.out.println("NAMA = " + nama);
        System.out.println("KELAS = " + kelas);
        System.out.println("IPK = " + ipk);
    }
}