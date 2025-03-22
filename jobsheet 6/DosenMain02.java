public class DosenMain02 {
    public static void main(String[] args) {
        DataDosen02 isi = new DataDosen02();
        Dosen02 dsn1 = new Dosen02("312", "Siti", false, 28);
        Dosen02 dsn2 = new Dosen02("123", "Ahmad", true, 39);
        Dosen02 dsn3 = new Dosen02("221", "Tutik", false, 46);
        Dosen02 dsn4 = new Dosen02("112", "Bagas", true, 33);

        isi.tambah(dsn1);
        isi.tambah(dsn2);
        isi.tambah(dsn3);
        isi.tambah(dsn4);
      

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
    }
}
