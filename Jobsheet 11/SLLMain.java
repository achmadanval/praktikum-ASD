public class SLLMain {
    public static void main(String[] args) {
        SingleLinkList02 sll = new SingleLinkList02();
        Mahasiswa02 mhs3 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);
        Mahasiswa02 mhs2 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa02 mhs1 = new Mahasiswa02("23212201", "Bimon", "2B", 3.8);
        Mahasiswa02 mhs4 = new Mahasiswa02("24212200", "Cintia", "3C", 3.5);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.insertAfter("cintia", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    
    }
}
