import java.util.Scanner;
public class hitungKubus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n-------------------------------");
        System.out.println("kalkulator hitung kubus ");
        System.out.println("-------------------------------");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print(" pilih rumus yang ingin anda hitung ");
        System.out.print("\n----------------------------------");
        System.out.println();
        int pilih = sc.nextInt();
        System.out.println("Masukkan sisi kubus yang mau di hitung : ");
        int sisi = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Volume Kubus : " + volume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus : "+ luasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus "+ keliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid! silahkan pilih lagi !!! ");
        }
    }
    public static int volume(int sisi) {
        return sisi * sisi * sisi;
    }
    public static int luasPermukaan(int sisi) {
        return 6 * (sisi * sisi);
    }
    public static int keliling(int sisi) {
        return 12 * (sisi * sisi);
    }

}