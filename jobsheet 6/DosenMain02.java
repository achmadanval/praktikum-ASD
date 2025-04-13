import java.util.Scanner;
public class DosenMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen02 isi = new DataDosen02();
        Dosen02 dsn1 = new Dosen02("312", "Siti", false, 28);
        Dosen02 dsn2 = new Dosen02("123", "Ahmad", true, 39);
        Dosen02 dsn3 = new Dosen02("221", "Tutik", false, 46);
        Dosen02 dsn4 = new Dosen02("112", "Bagas", true, 33);
        Dosen02 dsn5 = new Dosen02("999", "Anval", true, 33);

        isi.tambah(dsn1);
        isi.tambah(dsn2);
        isi.tambah(dsn3);
        isi.tambah(dsn4);
        isi.tambah(dsn5);
      

        System.out.println("Data dosen sebelum di sorting ");
        isi.tampilInformasi();

        System.out.println("Data dosen setelah di sorting secara ASCENDING ");
        isi.sortingASC();
        isi.tampilInformasi();

        System.out.println("Data dosen setelah di sorting secara DESCENDING ");
        isi.sortingDSC();
        isi.tampilInformasi();

        System.out.println("Data dosen setelah di sorting menggunakan INSERTIONSORT ");
        isi.insertionSort();
        isi.tampilInformasi();

        System.out.println("---------------------------------------");
        System.out.println("Pencarian data ");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan nama dosen yang mau di cari : ");
        System.out.print("Nama : ");
        String cari = sc.nextLine();

        System.out.println("Menggunakan Sequential Search ");
        isi.PencarianDataSquential02(cari);


        System.out.println("---------------------------------------");
        System.out.println("Pencarian data ");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan usia dosen yang mau di cari  ");
        System.out.print("Usia : ");
        double cari2 = sc.nextDouble();

        System.out.println("Pencarian menggunakan metode Binary Search");
        isi.PencarianDataBinary02((int)cari2);
    }
}
