import java.util.Scanner;

public class hitungIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar mata kuliah
        String[] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int jumlahMK = matkul.length;
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];

        // Header
        System.out.println("================================");
        System.out.println("   Program Menghitung IP Semester");
        System.out.println("================================");

        // Input nilai angka
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobotNilai(nilaiHuruf[i]);
        }

        // Menampilkan tabel hasil konversi
        System.out.println("\n========================================");
        System.out.println("         Hasil Konversi Nilai");
        System.out.println("========================================");
        System.out.printf("%-40s %-12s %-12s %-12s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("------------------------------------------------------------------------");

        double totalBobot = 0;
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i];
        }

        double ipSemester = totalBobot / jumlahMK;
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("IP Semester: %.2f%n", ipSemester);

    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }

    public static double konversiBobotNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A": return 4.00;
            case "B+": return 3.50;
            case "B": return 3.00;
            case "C+": return 2.50;
            case "C": return 2.00;
            case "D": return 1.00;
            case "E": return 0.00;
            default: return 0.00;
        }
    }
}
