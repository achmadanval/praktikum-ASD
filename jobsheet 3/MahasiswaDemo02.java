public class MahasiswaDemo02{
    public static void main(String[] args) {
        Mahasiswa02[] arrayMahasiswa02 = new Mahasiswa02[3];
        arrayMahasiswa02[0] = new Mahasiswa02();
        arrayMahasiswa02[0].nim = "244107060033";
        arrayMahasiswa02[0].nama = "AGNES TITANIA KINANTI";
        arrayMahasiswa02[0].kelas = "SIB-1E";
        arrayMahasiswa02[0].ipk = (float) 3.75;
        arrayMahasiswa02[1] = new Mahasiswa02();
        arrayMahasiswa02[1].nim = "2341720172";
        arrayMahasiswa02[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMahasiswa02[1].kelas = "TI-2A";
        arrayMahasiswa02[1].ipk = (float) 3.36;
        arrayMahasiswa02[2] = new Mahasiswa02();
        arrayMahasiswa02[2].nim = "24410723006";
        arrayMahasiswa02[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayMahasiswa02[2].kelas = "TI-2E";
        arrayMahasiswa02[2].ipk = (float) 3.80;

        System.out.println("NIM             : " +  arrayMahasiswa02[0].nim );
        System.out.println("NAMA            : " +  arrayMahasiswa02[0].nama );
        System.out.println("KELAS           : " +  arrayMahasiswa02[0].kelas);
        System.out.println("IPK             : " +  arrayMahasiswa02[0].ipk );
        System.out.println("-----------------------------------------------");
        System.out.println("NIM             : " +  arrayMahasiswa02[1].nim );
        System.out.println("NAMA            : " +  arrayMahasiswa02[1].nama );
        System.out.println("KELAS           : " +  arrayMahasiswa02[1].kelas);
        System.out.println("IPK             : " +  arrayMahasiswa02[1].ipk );
        System.out.println("-----------------------------------------------");
        System.out.println("NIM             : " +  arrayMahasiswa02[2].nim );
        System.out.println("NAMA            : " +  arrayMahasiswa02[2].nama );
        System.out.println("KELAS           : " +  arrayMahasiswa02[2].kelas);
        System.out.println("IPK             : " +  arrayMahasiswa02[2].ipk );
        System.out.println("-----------------------------------------------");
    }
}