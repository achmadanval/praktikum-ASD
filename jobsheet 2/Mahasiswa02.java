public class Mahasiswa02 {

    String nama;
    String nim;
    String kelas;
    double ipk;     


    public static void tampilkanInformasi() {
        System.out.println("NAMA : " + nama );
        System.out.println("NIM :" + nim);
        System.out.println("IPK :" + ipk);
        System.out.println("KELAS :" + kelas);
    }

    public static void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    static void updateIPK(double ipkBaru){
        if (ipkBaru <= 0.0 || ipkBaru >= 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0 ");
        }else{
            ipk = ipkBaru;
        }
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik ";
        } else if (ipk >= 3.0) {
            return " Kinerja baik ";
        }else if (ipk >= 2.0) {
            return " Kinerja cukup ";
        }else{
            return " Kinerja kurang ";
        }
    }
}
