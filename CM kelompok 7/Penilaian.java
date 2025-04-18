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

    double nilaiAkhir(){
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) +  (nilaiUAS * 0.4)
    }

    void tampilInfo(){
        System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | Nilai akhir : " + nilaiAkhir());
    }
}
