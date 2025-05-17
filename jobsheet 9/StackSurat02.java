public class StackSurat02 {
    Surat02[] stack ;
    int size, top;
    
     public StackSurat02(int size){
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public StackSurat02() {
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
     public void push(Surat02 srt){
        if (!isFull()) {
            top++;
            stack[top] = srt;
        }else{
            System.out.println("Maaf Stack sudah terisi penuh. ");
        }
    }
    public Surat02 pop () {
        if (!isEmpty()) {
            Surat02 sur = stack[top];
            top--;
            return sur;
        }else{
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai !");
            return null;
        }
    }

    public Surat02 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack masih kosong, tidak ada tugas yang dikumpulkan !");
            return null;
        }
    }
    public boolean cari(String nama){
        for (Surat02 srt : stack) {
            if (srt.namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}