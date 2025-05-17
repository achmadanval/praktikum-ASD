import java.util.Scanner;
public class suratMain02 {
    public static void main(String[] args) {
        StackSurat02 stack = new StackSurat02(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.print("============== ABSENSI ==============\n");
            System.out.println("1. Terima surat izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("ID surat : ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = sc.nextInt();
                    stack.push(new Surat02(idSurat, namaMahasiswa, kelas, jenisIzin, durasi));
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                
                case 2:
                    Surat02 srt = stack.pop();
                    if (srt != null) {
                        System.out.println("Memperoses surat : " + srt);
                    } else {
                        System.out.println("Tidak ada surat untuk diproses");
                    }
                    break;
                case 3:
                    Surat02 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat terakhir : " + suratTerakhir);
                    } else {
                        System.out.println("Stack masih kosong");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa : ");
                    String cari = sc.nextLine();
                    boolean ditemukan = stack.cari(cari);
                    System.out.println(ditemukan ? "surat ditemukan" : "Surat tidak ditemukan");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
