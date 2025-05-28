public class tugasMahasiswa {
    String nim,nama,prodi,kelas;

    tugasMahasiswa(String nama, String nim ,String prodi, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampil(){
        System.out.println(nim + " - " + nama + " "  + prodi + " " + kelas);
    }
}
