public class Dosen02 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen02(String kd, String name , Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jenis kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
    }
}
