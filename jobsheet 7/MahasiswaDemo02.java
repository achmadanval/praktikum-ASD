import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine();
        
        
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumlahMhs);
        for (int i = 0; i < jumlahMhs ; i++) {
            System.out.println("Masukkan data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("NAMA    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("----------------------------------");
            list.tambah(new Mahisiswa02(nim, nama, kelas, ipk));
        }
        list.tampil();
        // pencarian data menggunakan sequential search
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        
        System.out.println("Menggunakan sequential searching ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        // pencarian data menggunakan binary search
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        cari = sc.nextDouble();

        System.out.println("menggunakan Binary Serach ");
        double posisi2 = list.fineBinarySearch(cari, 0, jumlahMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
