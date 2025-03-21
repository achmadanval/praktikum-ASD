import java.util.Scanner;
public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.print("Masukkan jumlah mahasiswa : " );
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();


        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumlahMahasiswa);
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke- " + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            
            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }
        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (DESC) :  ");
        list.bubbleSort();
        list.tampil();
    }
}
