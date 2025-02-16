import java.util.Scanner;

public class arrayCode {
    public static void main(String[] args) {
        char[] CODE = {'A', 'B', 'D', 'E', 'G', 'H', 'L', 'N', 'S', 'T'};
        
        char[][] CITY = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '}, 
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '}, 
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '}, 
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '}, 
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '}, 
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '}, 
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '}, 
            {'G', 'R', 'E', 'S', 'I', 'K', ' ', ' ', ' ', ' ', ' ', ' '}, 
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor kendaraan anda: ");
        char inputKode = Character.toUpperCase(sc.next().charAt(0));

        boolean found = false;
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == inputKode) {
                System.out.print("Kota untuk kode plat " + inputKode + " adalah: ");
                for (char c : CITY[i]) { 
                    if (c != ' ') {
                        System.out.print(c);
                    }
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
