import java.util.Scanner;
public class tugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLL sll = new QLL();
        int pilih;

        do {
            System.out.println("\n----- MENU LAYANAN UNIT KEMAHASISWAAN -----");
            System.out.println("1. Tambahkan Antrian");
            System.out.println("2. Proses Antrian");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    tugasMahasiswa mhs = new tugasMahasiswa(nama, nim, prodi, kelas);
                    sll.tambahAntrian(mhs);
                    System.out.println("Mahasiswa "+ nama +" telah ditambahkan ke antrian.");
                    break;

                case 2:
                    sll.memanggilAntrian();
                    break;

                case 3:
                    sll.printDepan();
                    break;

                case 4:
                    sll.printBelakang();
                    break;

                case 5:
                    sll.jmlAntrian();
                    break;

                case 6:
                    sll.kosongkan();
                    break;

                case 7:
                    if (sll.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian masih ada.");
                    }
                    break;

                case 8:
                    if (sll.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian masih bisa ditambah.");
                    }
                    break;

                case 9:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 9);
    }
}