import java.util.Scanner;
public class DosenDemo02{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Dosen02[] arrDosen02 = new Dosen02[3];
        for (int i = 0; i < 3; i++) {
            arrDosen02[i] = new Dosen02(null, null, true, i); 
            System.out.println("Masukkan Data Dosen ke- " + ( i + 1));
            
            System.out.print("Kode          : "  );
            arrDosen02[i].kode = sc.nextLine();
            System.out.print("Nama          : "  );
            arrDosen02[i].nama = sc.nextLine();
            System.out.print("Jenis kelamin (Pria/Wanita) :"  );
            String jenisKelaminInput = sc.nextLine();
            boolean jenisKelamin = jenisKelaminInput.equalsIgnoreCase("Pria");
            System.out.print("Usia          : "  );
            arrDosen02[i].usia = sc.nextInt();
            sc.nextLine();

            System.out.println("--------------------------------------");
        }
        System.out.println(" ====Data Dosen =====");
        for (Dosen02 dosen02 : arrDosen02) {
            System.out.println("Kode           :  "  + dosen02.kode);
            System.out.println("Nama           :  "  + dosen02.nama);
            System.out.println("Jenis Kelamin  :  "  + dosen02.jenisKelamin);
            System.out.println("Usia           :  "  + dosen02.usia);
            System.out.println("--------------------------------------");
        }
    }
}