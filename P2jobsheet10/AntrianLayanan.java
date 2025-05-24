public class AntrianLayanan {
    Mahasiswa02[] data;
    int front,rear,size,max;

    public AntrianLayanan (){
        
    }

    public AntrianLayanan (int n){
    
        max = n;
        data = new Mahasiswa02[max];
        size = front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max ) {
            return true;
        }else{
            return false;
        }
    }
    public void tampilkanSemua (){
        if (isEmpty()){
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }  
    }
    public void lihatTerdepan (){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else{
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS ");
            data[front].tampilkanData();
        }
    }
    public void clear (){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("AntrianLayanan berhasil dikosongkan");
        }else{
            System.out.println("queue masih kosong");
        }
    }

    public void tambahAntrian (Mahasiswa02 mhs){
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasisw!!");
            return;
        }else{
           rear = (rear + 1) % max;
           data[rear] = mhs;
           size++;
           System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
        }
    }
    public Mahasiswa02 layaniMahasiswa (){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa02 mhs = data[front];
        front = (front + 1) % max;
        size --;
        return mhs;
            
    }
    public int getJumlahAntrian(){
        return size;
    }
}