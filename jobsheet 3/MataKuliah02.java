import java.util.Scanner;

public class MataKuliah02{
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah02(String kode, String nama, int sks, int jumlahJam){
        this.kode= kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah02( String nama, int sks,int jumlahJam){
        this.nama = nama;
        this.kode = "    ";
        this.sks = sks;
        this.jumlahJam = jumlahJam ;
    }
    public void tambahData(Scanner sc){
        Scanner sc =new Scanner (System.in);
         System.out.print("Apakah Matakuliah Anda terdapat kode? (ya/tidak): ");
        String pilihan = sc.nextLine();

        if (pilihan.equalsIgnoreCase("ya")) {
            System.out.print("Kode Mata Kuliah  : ");
            this.kode = sc.nextLine();
        } else {
            this.kode = "Tidak Ada";
        }

        System.out.print("Nama              : ");
        this.nama = sc.nextLine();
        System.out.print("SKS               : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah jam        : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
    }
    public void cetakInfo(){
        System.out.println("Kode  : " + kode);
        System.out.println("Nama " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
}