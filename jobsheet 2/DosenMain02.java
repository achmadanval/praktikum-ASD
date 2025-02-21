public class DosenMain02 {

    public static void main(String[] args) {
        Dosen02 dsn1 = new Dosen02();
        dsn1.idDosen = " YWS ";
        dsn1.nama = " Yan Watequlis Syaifudin";
        dsn1.tahunBergabung = 2001;
        dsn1.bidangKeahlian = " TELEKOMUNIKASI";
        

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        int tahunSekarang = 2025;
        int masaKerja = dsn1.hitungMasaKerja(tahunSekarang);
        dsn1.ubahKeahlian("komputer");
        dsn1.tampilkanInformasi();
        System.out.println("Masa kerja : " + masaKerja +  " tahun ");
        System.out.println();
        
        Dosen02 dsn2 = new Dosen02("MH", "Muhammad hardianto" , 2019 , "Ilmu Sejarah" , true );
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(true);
        masaKerja = dsn2.hitungMasaKerja(tahunSekarang);
        dsn2.ubahKeahlian("Traveling");
        dsn2.tampilkanInformasi();
        System.out.println("Masa kerja : " + masaKerja +  " tahun ");
    }
}