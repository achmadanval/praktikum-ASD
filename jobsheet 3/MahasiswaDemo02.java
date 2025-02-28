import java.util.Scanner;
public class MahasiswaDemo02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa02[] arrayMahasiswa02 = new Mahasiswa02[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayMahasiswa02[i] = new Mahasiswa02();
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM : ");
            arrayMahasiswa02[i].nim = sc.nextLine();
            System.out.print("NAMA : ");
            arrayMahasiswa02[i].nama = sc.nextLine();
            System.out.print("KELAS : ");
            arrayMahasiswa02[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayMahasiswa02[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.println("NIM   : " + arrayMahasiswa02[i].nim);
            System.out.println("NAMA  : " + arrayMahasiswa02[i].nama);
            System.out.println("KELAS : " + arrayMahasiswa02[i].kelas);
            System.out.println("IPK   : " + arrayMahasiswa02[i].ipk);
        }
    }
}