public class DataDosen02 {
    Dosen02[] dados = new Dosen02[5];
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

    
    void PencarianDataSquential02(String cari){
        int jmlDitemukan= 0;
        for (int j = 0; j < idx; j++) {
            if (dados[j].nama.equalsIgnoreCase(cari)) {
                dados[j].tampil();
                System.out.println("-------------------------------------");
                jmlDitemukan++;
            }
        }
        if (jmlDitemukan == 0) {
            System.out.println("Data dosen dengan nama " + cari + " tidak ditemukan");
        }else if(jmlDitemukan > 1){
            System.out.println("Peringatan : Ditemukan lebih dari 1 dosen dengan nama "+ cari);
        }
    }

    void tampilPosisi(String cari, int pos){
        if (pos!=-1) {
            System.out.println("Data Dosen dengan Nama : " +cari + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("Data "+ cari + " Tidak ditemukan");
        }
    }

    void tampilDataPencarian(double x, int pos){
        if (pos != -1) {
            System.out.println("Kode\t : " + dados[pos].kode);
            System.out.println("Nama \t : " + dados[pos].nama);
            System.out.println("Jenis kelamin\t : " + (dados[pos].jenisKelamin ? "Laki - laki " : "Perempuan"));
            System.out.println("Usia\t : " + dados[pos].usia);
        }
    }

    void PencarianDataBinary02(int cari){
        insertionSort();
        int left = 0, right = idx - 1;
        int posisi = -1;

        while (left <= right) {
            int mid = (left + right)/2;
            if (dados[mid].usia== cari) {
                posisi = mid;
                break;
            }else if(dados[mid].usia > cari){ 
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if (posisi == -1) {
            System.out.println("Data dosen dengan usia " + cari + " tidak ditemukan." );
            return;
        }
        int jmlDitemukan = 0;
        for (int i = posisi + 1; i < idx && dados[i].usia == cari; i++) {
            dados[i].tampil();
            System.out.println("----------------------------");
            jmlDitemukan++;
        }
        for (int i = posisi ; i >= 0 && dados[i].usia == cari; i--) {
            dados[i].tampil();
            System.out.println("----------------------------");
            jmlDitemukan++;
        }
        if (jmlDitemukan > 1) {
            System.out.println("Peringatan : Ditemukan lebih dari satu dosen dengan usia terebut");
        }
    }
}
