public class Mahasiswa02 {

    String nim, nama ,prodi,kelas;

    Mahasiswa02(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas );
    }
}