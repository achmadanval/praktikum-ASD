import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa02[] arrayMahasiswa02 = new Mahasiswa02[3];

        for (int i = 0; i < 3; i++) {
            arrayMahasiswa02[i] = new Mahasiswa02();
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));

            System.out.print("NIM   : ");
            arrayMahasiswa02[i].nim = sc.nextLine();
            System.out.print("NAMA  : ");
            arrayMahasiswa02[i].nama = sc.nextLine();
            System.out.print("KELAS : ");
            arrayMahasiswa02[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            arrayMahasiswa02[i].ipk = sc.nextFloat();
            sc.nextLine();

            System.out.println("----------------------------------");
        }
        System.out.println("\n--- DATA MAHASISWA ---");
        for (int i = 0; i < 3; i++) {
            arrayMahasiswa02[i].cetakInfo();
        }
    }
}
