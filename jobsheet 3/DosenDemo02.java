import java.util.Scanner;
public class DosenDemo02{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Dosen02[] arrDosen02 = new Dosen02[6];

        for (int i = 0; i < arrDosen02.length; i++) {
            System.out.println("Masukkan Data Dosen ke- " + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis kelamin (Pria/Wanita) : ");
            String jenisKelaminInput = sc.nextLine();
            boolean jenisKelamin = jenisKelaminInput.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrDosen02[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }
        DataDosen02 dataDosen02 = new DataDosen02();
        dataDosen02.dataSemuaDosen(arrDosen02);
        dataDosen02.jumlahDosenPerJenisKelamin(arrDosen02);
        dataDosen02.rata2UsiaDosenPerJenisKelamin(arrDosen02);
        dataDosen02.infoDosenPalingTua(arrDosen02);
        dataDosen02.infoDosenPalingMuda(arrDosen02);
    }   
}