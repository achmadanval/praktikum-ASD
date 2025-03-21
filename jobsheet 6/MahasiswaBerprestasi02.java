public class MahasiswaBerprestasi02 {

    Mahasiswa02 [] listMHS = new Mahasiswa02[5];
    int idx;

    public MahasiswaBerprestasi02(int jumlahMahasiswa) {
        listMHS = new Mahasiswa02[jumlahMahasiswa];
        idx = 0;
    }

    void tambah(Mahasiswa02 m){
        if (idx < listMHS.length ) {
            listMHS[idx]= m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa02 m : listMHS){
            if (m != null) {
                m.tampilInformasi();
                System.out.println("--------------------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMHS.length - 1; i++) { 
            for (int j = 1; j < listMHS.length - i; j++) { 
                if (listMHS[j].ipk > listMHS[j-1].ipk) { 
                    Mahasiswa02 temp = listMHS[j];
                    listMHS[j] = listMHS[j - 1];
                    listMHS[j - 1] = temp;
                }
            }
        }
    }
}    