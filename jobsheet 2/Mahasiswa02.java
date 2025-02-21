public class Mahasiswa02 {

    String nama;
    String nim;
    String kelas;
    double ipk;     


     void tampilkanInformasi() {
        System.out.println("NAMA : " + nama );
        System.out.println("NIM :" + nim);
        System.out.println("IPK :" + ipk);
        System.out.println("KELAS :" + kelas);
    }

     void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
     void updateIPK(double ipkBaru){
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0 ");
        }else{
            ipk = ipkBaru;
        }
    }
     void nilaiKinerja(){
        if (ipk >= 3.5) {
           System.out.println("kinerja sangat baik");
           return  ; 
        } else if (ipk >= 3.0) {
            System.out.println("kinerja baik");
            return;
        }else if (ipk >= 2.0) {
            System.out.println("Kinerja cukup");
            return;
        }else{
            System.out.println("kinerja kurang");
            return;
        }
    }
    public Mahasiswa02(){

    }
    public Mahasiswa02(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls ;
    }
}
