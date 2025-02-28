import java.util.Scanner;
public class MataKuliahDemo02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[100];
        String kode, nama ,dummy;
        int sks, jumlahJam;
        int jumlahData = 0;

        for (int i = 0; i < 3; i++) {
            arrayOfMataKuliah[jumlahData] = new MataKuliah02(" "," ", 0, 0);
            arrayOfMataKuliah[jumlahData].tambahData(sc);
            jumlahData++;
        }
        System.out.println("\n--- DATA MATAKULIAH ---");
        for (int i = 0; i < jumlahData; i++) {
            arrayOfMataKuliah[i].cetakInfo();
        }
        while (true) {
            System.out.println("Apakah anda ingin menambah data? (y/t)");
            String pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("y")) {
                arrayOfMataKuliah[jumlahData] = new MataKuliah02(" "," ", 0, 0);;
                arrayOfMataKuliah[jumlahData].tambahData(sc);
                jumlahData++;
            }else{
                break;
            }
        }
        System.out.println("Semua Data MataKiuliah");
        System.out.println("\n--- DATA MATAKULIAH ---");
        for (int i = 0; i < jumlahData; i++) {
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}