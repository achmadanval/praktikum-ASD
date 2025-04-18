public class dataMahasiswa {
    Mahasiswa[] dataMhs = new Mahasiswa[3];
    int idx = 0;

    void tambah (Mahasiswa dataMhs){
        if (idx < dataMhs.length) {
            Mahasiswa[idx] = dataMhs;
            idx++;
        }else{
            System.out.println("Maaf, Data sudah penuh !!");
        }
    }   

    void tampilInformasi(){
        if (idx == 0) {
            System.out.println("Tidak ada data yang tersimpan. ");
        }
        for(int  i = 0; i < idx ;i++){
            dataMhs[i].tampilMahasiswa();
            System.out.println("_______________________________________");
        }
    }
}
