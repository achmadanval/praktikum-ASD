import java.util.Scanner;
public class sistemAkademik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");
        Mahasiswa[] daftarMhs = {mhs1, mhs2, mhs3};

        MataKuliah MK1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah MK2 = new MataKuliah("MK002", "Basis Dara", 3);
        MataKuliah MK3 = new MataKuliah("MK003", "Desain Web", 3);
        MataKuliah[] daftarMK = {MK1, MK2, MK3};

        Penilaian df1 = new Penilaian(mhs1,MK1,80,85,90);
        Penilaian df2 = new Penilaian(mhs1,MK2,60,75,70);
        Penilaian df3 = new Penilaian(mhs2,MK1,75,70,80);
        Penilaian df4 = new Penilaian(mhs3,MK2,85,90,95);
        Penilaian df5 = new Penilaian(mhs3,MK3,80,90,65);
        Penilaian[] daftarNilai = {df1,df2,df3,df4,df5};
        

        while (true){
            System.out.println("\n=== MENU SISTEM AKADEMIK ==");
            System.out.println("1. Tampilkan Daftar Mahasiswa ");
            System.out.println("2. Tampilkan Daftar Mata Kuliah ");
            System.out.println("3. Tampilkan Daftar Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir ");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM ");
            System.out.println("0. Keluar ");
            System.out.print("Pilih menu : ");
            int pilih = sc.nextInt();

            if (pilih == 1) {
                for (Mahasiswa mhs : daftarMhs) {
                    mhs.tampilMahasiswa();
                }
            }else if (pilih == 2) {
                for (MataKuliah mk : daftarMK) {
                    mk.tampilMatakuliah();
                }
            }else if (pilih == 3) {
                for (Penilaian p : daftarNilai) {
                    p.tampilInfo();;
                }
            }else if (pilih == 4) {
                Penilaian n = new Penilaian(null,null,0,0,0);
                n.UrutanDSC(daftarNilai);
            } else if (pilih == 5) {
                Mahasiswa.cariMahasiswa(daftarMhs);
            
            }else if (pilih == 0) {
                System.out.print("Terima kasih ! ");
                break;
            }else{
                System.out.println("Pilihan tidak valid");
            }
        }
    }


   
    
}
