public class MataKuliah {
    String kodeMK,namaMK;
    int sks;
    MataKuliah(){
        
    }

    MataKuliah(String kodeMK,String namaMK,int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMatakuliah(){
        System.out.println("Kode Matkul : " + kodeMK +"|"+ "Nama Matkul : " + namaMK +"|" + "SKS         : " + sks);
    }
}
