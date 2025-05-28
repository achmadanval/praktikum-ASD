public class QLL {
    tugasNode front, rear;
    int size = 0;

    //cek antrian
    boolean isEmpty(){
        return front == null;
    }
    boolean isFull(){
        return !isEmpty();
    }
    public void kosongkan(){
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan :) ");
    }

    //Menambahkan antrian
    public void tambahAntrian(tugasMahasiswa mhs){
        tugasNode nd = new tugasNode(mhs, null);
        if (isEmpty()) {
            front = rear = nd;
        }else{
            rear.next = nd;
            rear = nd;
        }
        size++;
    }
    public void memanggilAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong tidak ada yang dipanggil");
        }else{
            tugasMahasiswa mhs = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            System.out.println("Memanggil: " + mhs);
        }
    }
    public void printDepan(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        }else{
            System.out.println("Antrian terdepan: " + front.data.nama);
        }
    }
    public void printBelakang(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        }else{
            System.out.println("Antrian paling belakang " + rear.data.nama);
        }
    }
    public void jmlAntrian(){
        System.out.println("Jumlah antrian mahasiswa : " + size);
    }
}
