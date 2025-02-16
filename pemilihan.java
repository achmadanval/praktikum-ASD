import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas,UAS,UTS,kuis;
        System.out.print("Masukkan nilai Tugas : ");
        tugas = sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        UAS = sc.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        UTS = sc.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        kuis = sc.nextInt();
        
        if (tugas < 0 ||tugas > 100 || kuis < 0 || kuis  > 100 || UAS < 0 || UAS > 100 || UTS < 0 || UTS > 100 ) {
            System.out.print("Nilai tidak valid ");
            return;
        }
        double rata2 = (tugas * 0.2) + (UAS * 0.3) + (UTS*0.3) + ( kuis * 0.2);

        String keterangan ;

        if (rata2 >= 80 && rata2 <= 100) {
            keterangan = "A";
        } else if (rata2 >= 73) {
            keterangan = "B+";
        } else if (rata2 >= 65) {
            keterangan = "B";
        } else if (rata2 >= 60) {
            keterangan = "C+";
        } else if (rata2 >= 50) {
            keterangan = "C";
        } else if (rata2 >= 39) {
            keterangan = "D";
        } else {
            keterangan = "E";
        }
        System.out.println(" Nilai Akhir = " + rata2);
        System.out.println(" Nilai Huruf = " + keterangan);
        if (keterangan.equalsIgnoreCase("A")||keterangan.equalsIgnoreCase("B")||keterangan.equalsIgnoreCase("B+")||keterangan.equalsIgnoreCase("C")||keterangan.equalsIgnoreCase("C+")) {
            System.out.println("Selamat anda lulus !!!!");
        }else {
            System.out.println("maaf anda harus mengikuti remidi");
        }
    }
}