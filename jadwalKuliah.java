import java.util.Scanner;

public class jadwalKuliah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[n], hari = new String[n];
        int[] SKS = new int[n], semester = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata kuliah ke-" + (i + 1));
            System.out.print("Nama Matkul: ");
            nama[i] = sc.nextLine();
            System.out.print("SKS: ");
            SKS[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari: ");
            hari[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\n1. Tampilkan semua\n2. Cari Berdasarkan Hari\n3. Cari Berdasarkan Semester\n4. Cari Mata Kuliah\n5. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine(); 

            if (pilih == 5) {
                System.out.println("Program selesai.");
                break;
            }

            String input = "";
            if (pilih == 2) {
                System.out.print("Masukkan hari: ");
                input = sc.nextLine();
            } else if (pilih == 3) {
                System.out.print("Masukkan semester: ");
                input = sc.next(); 
            } else if (pilih == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                input = sc.nextLine();
            }

            for (int i = 0; i < n; i++) {
                if (pilih == 1 || 
                    (pilih == 2 && hari[i].equalsIgnoreCase(input)) || 
                    (pilih == 3 && String.valueOf(semester[i]).equals(input)) || 
                    (pilih == 4 && nama[i].equalsIgnoreCase(input))) {
                    System.out.println(nama[i] + " | SKS: " + SKS[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                }
            }
        }
    }
}
