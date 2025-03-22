public class DataDosen02 {
    Dosen02[] dados = new Dosen02[4];
    int idx = 0;

    void tambah(Dosen02 dsn){
        if(idx < dados.length){
            dados[idx] = dsn;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) { 
            for (int j = 0; j < idx - i - 1; j++) { 
                if (dados[j].usia > dados[j + 1].usia) { 
                    Dosen02 temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }       
    }
    
    void sortingDSC(){
        for (int i = 0; i < idx -1; i++) {
            int idxMax = i;
            for (int j = i+1; j < idx-1; j++) {
                if (dados[j].usia > dados[idxMax].usia) {
                    idxMax = j;
                }
            }
            if(idxMax != i){
                Dosen02 temp = dados[idxMax];
                dados[idxMax]= dados[i];
                dados[i] = temp;
            }
        } 
    }
    void tampilInformasi(){
        System.out.println("DEBUG: Total Data = " + idx);
        if (idx == 0) {
            System.out.println("Tidak ada data yang tersimpan.");
            return;
        }
        for(int i = 0; i < idx; i++){
            dados[i].tampil();
            System.out.println("--------------------------------------");
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Dosen02 temp = dados[i];
            int j = i ;
            while (j > 0 && dados[j-1].usia > temp.usia) {
                dados[j ] = dados[j-1];
                j--;
            }
            dados[j]= temp;
        }
    }

    void debugArray() {
        System.out.println("==== DEBUG: Isi Array ====");
        for (int i = 0; i < idx; i++) {
            if (dados[i] != null) {
                System.out.println("[" + i + "] Nama: " + dados[i].nama + ", Usia: " + dados[i].usia);
            } else {
                System.out.println("[" + i + "] NULL");
            }
        }
        System.out.println("=========================");
    }
    
}
