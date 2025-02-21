public class mataKuliahMain {

    public static void main(String[] args) {
        mataKuliah mk1 = new mataKuliah();
        mk1.kodeMK = "LS01";
        mk1.nama = "Agama";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();
        System.out.println();

        mataKuliah mk2 = new mataKuliah("OP99", "SISTEM OPERASI", 4 , 8);

        mk2.tampilkanInformasi();
        mk2.ubahSKS(3);
        mk2.kurangiJam(9);
        mk2.tampilkanInformasi();

    }
}