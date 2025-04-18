public class Mahasiswa {
    String NIM,nama,prodi;

    Mahasiswa{

    }
    Mahasiswa(String NIM,String nama, String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM     : " + NIM);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
    }
}
