import java.util.Scanner;
public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        Scanner sc = new Scanner(System.in);
        int pilih ;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas ");
            System.out.println("5. Banyak tugas yang sudah dikumpulkan ");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
        
            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim , kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari" + dinilai.nama);
                        System.out.print("Masukkan nilai dari (0 - 100) :");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n " , dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner tugas : " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println(" Tugas terakhir  dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tkelas");
                    stack.print();
                    break;
                case 5:
                    stack.jmlTugas();
                default:
                    System.out.println("Pilihan tidak valid!!");
            }
            
        } while (pilih >= 1 && pilih <= 4);
    }
}
