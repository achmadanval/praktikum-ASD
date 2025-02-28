import java.util.Scanner;

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah yang ingin dimasukkan: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();
        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[jumlahMataKuliah];


        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah02("", "", 0, 0); 
            arrayOfMataKuliah[i].tambahData(sc); 
        }

        System.out.println("\n--- DATA MATA KULIAH ---");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}