import java.util.Scanner;
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkList02 sll = new SingleLinkList02();
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n=== UPDATE KRS ===");
            System.out.println("1. Tambahkan Di awal  ");
            System.out.println("2. Tambahkan di Akhir ");
            System.out.println("3. Masukkan data berdasarkan nama ");
            System.out.println("4. Masukkan data berdasarkan index ");
            System.out.println("5. Tampilkan semua data ");
            System.out.println("0. keluar ");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            System.out.println("===========================");
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    Mahasiswa02 mhs = SingleLinkList02.inputDataMahasiswa(sc);
                    sll.addFirst(mhs);
                    break;
                    
                case 2:
                    
                    Mahasiswa02 mhsl = SingleLinkList02.inputDataMahasiswa(sc);
                    sll.addLast(mhsl);                  
                    break;
                    
                case 3:
                    System.out.println("Masukkan nama yang dicari : ");
                    String key = sc.nextLine();
                    
                    Mahasiswa02 maha = SingleLinkList02.inputDataMahasiswa(sc);
                    sll.insertAfter(key, maha);
                    break;
                    
                case 4:
                    System.out.println("Masukkan index : ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa02 mahat = SingleLinkList02.inputDataMahasiswa(sc);
                    sll.insertAt(index, mahat);;
                    break;
                
                case 5:
                    sll.print();
                    break;

                case 0:
                    System.out.println("Terima kasih :)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid mohon pilih sesuai yang ada di Menu !!!");
                    break;
                
            }
        } while (pilih != 0);
    }
}       

        //Mahasiswa02 mhs4 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);
        //Mahasiswa02 mhs1 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        //Mahasiswa02 mhs3 = new Mahasiswa02("23212201", "Bimon", "2B", 3.8);
        //Mahasiswa02 mhs2 = new Mahasiswa02("24212200", "Cintia", "3C", 3.5);
        
        //sll.print();
        //sll.addFirst(mhs1);
        //sll.print();
        //sll.addFirst(mhs4);
        //sll.print();
        //sll.insertAfter("Dirga", mhs3);
        //sll.insertAt(2, mhs2);
        //sll.print();
