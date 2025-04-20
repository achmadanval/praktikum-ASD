import java.util.Scanner;

public class Mahasiswa {
    String NIM,nama,prodi;

    Mahasiswa(){

    }
    Mahasiswa(String NIM,String nama, String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM     : " + NIM + "|" + "Nama    : " + nama + "|" + "Prodi   : " + prodi );

    }

    //ini linear search
    static void cariMahasiswa(Mahasiswa[] daftar) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nimDicari = input.nextLine();
        
        boolean ditemukan = false;
        for (Mahasiswa mhs : daftar) {
            if (mhs.NIM.equalsIgnoreCase(nimDicari)) {
                mhs.tampilMahasiswa();
                ditemukan = true;
                break;
            } else {
                System.out.println("Mahasiswa dengan NIM " + nimDicari + " tidak ditemukan.");
            }
        }

        
    }

}
