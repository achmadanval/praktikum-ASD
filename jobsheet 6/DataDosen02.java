public class DataDosen02 {
    Dosen02[] dados = new Dosen02[10];
    int idx;

    void tambah(Dosen02 dsn){
        if(idx < dados.length){
            dados[idx] = dsn;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void sortingASC(){
        
    }
    void sortingDSC(){

    }
}
