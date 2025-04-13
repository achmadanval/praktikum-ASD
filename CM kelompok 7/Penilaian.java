public class Penilaian {
    Mahasiswa mahasiswa = new Mahasiswa();
    MataKuliah mataKuliah = new MataKuliah();
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    void penilaian(Mahasiswa mahasiswa,MataKuliah mataKuliah,double tugas,double uts,double uas){
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas=tugas;
        this.nilaiUTS=uts;
        this.nilaiUAS=uas;
    }
}
