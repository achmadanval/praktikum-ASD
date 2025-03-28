public class MahasiswaBerprestasi02 {
    Mahisiswa02[] listMhs = new Mahisiswa02[5];
    int idx;

    public MahasiswaBerprestasi02 (int jumlahMhs){
        listMhs = new Mahisiswa02[jumlahMhs];
        idx=0;
    }

    void tambah(Mahisiswa02  mhs){
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }else{
            System.out.println("Data sudah penuh ");
        }
    }
    void tampil(){
        for (Mahisiswa02 mhs : listMhs) {
            mhs.tampilInformasi();
            System.out.println("--------------------------------");
        }
    }
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : " +x+ " ditemukan pada indeks " + pos);
        }else{
            System.out.println("Data "+ x + "Tidak ditemukan");
        }
    }

    void tampilDataSearch(double x , int pos){
        if (pos != -1) {
            System.out.println("nim\t : " +listMhs[pos].nim);
            System.out.println("nama\t : " +listMhs[pos].nama);
            System.out.println("kelas\t : " +listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }else{
            System.out.println("Data mahasiswa dengan IPK "+ x +" tidak ditemukan");
        }
    }

    int fineBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }else if(listMhs[mid].ipk < cari){
                return fineBinarySearch(cari,left,mid -1 );
            }else{
                return fineBinarySearch(cari,mid + 1 ,right);
            }
        }
        return -1;
    }
}
