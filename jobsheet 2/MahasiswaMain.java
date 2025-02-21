public class MahasiswaMain {

    public static void main(String[] args) {
        Mahasiswa02 mhs1 = new Mahasiswa02();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();
        mhs1.nilaiKinerja();
        System.out.println();
        Mahasiswa02 mhs2 = new Mahasiswa02("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
        System.out.println();
        Mahasiswa02 mhsAnval = new Mahasiswa02("Achmad Anval", "244107020039" , 3.33 , "TI 1B");
        mhsAnval.tampilkanInformasi();
    }
}