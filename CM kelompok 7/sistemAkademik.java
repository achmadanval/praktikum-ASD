import java.util.Scanner;
public class sistemAkademik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMhs = {mhs1, mhs2, mhs3};
        Mahasiswa mhs1 = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        MataKuliah[] daftarMK = {MK1, MK2, MK3};
        MataKuliah MK1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah MK2= new MataKuliah("MK002", "Basis Dara", 3);
        MataKuliah MK3 = new MataKuliah("MK003", "Struktur Data", 3);
    }
}
