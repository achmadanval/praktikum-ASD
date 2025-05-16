public class StackTugasMahasiswa02 {
    Mahasiswa02 [] stack;
    int size,top;

    public StackTugasMahasiswa02(int size){
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isFull(){
        return top == stack.length - 1;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public void push(Mahasiswa02 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Maaf Stack sudah terisi penuh. ");
        }
    }
    public Mahasiswa02 pop () {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai !");
            return null;
        }
    }

    public Mahasiswa02 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack masih kosong, tidak ada tugas yang dikumpulkan !");
            return null;
        }
    }

    public void jmlTugas(){
        if (isEmpty()) {
            System.out.println("Belum ada tugas yang dikumpulkan");
        } else {
            System.out.println("Banyak tugas yang sudah dikumpulkan sebanyak " + (top + 1));
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi stack = new StackKonversi();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode /2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.POP();
        }
        return biner;
    }
}
