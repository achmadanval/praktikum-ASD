import java.util.Scanner;

import org.w3c.dom.Node;

public class SingleLinkList02 {
    NodeMahasiswa02 head;
    NodeMahasiswa02 tail;

    boolean isEmpty (){
        return (head == null);
    }
    public void print(){
        if (!isEmpty()){
            NodeMahasiswa02 temp =  head;
            System.out.println("Isi linked list: \t");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
            System.out.println(" ");
        }else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(Mahasiswa02 input){
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }System.out.println("Data " + input.nama + " berhasil di tambahkan ");
    }
    public void addLast(Mahasiswa02 input){
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }System.out.println("Data " + input.nama + " berhasil di tambahkan ");
    }
    public void insertAfter( String key, Mahasiswa02 input){
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        NodeMahasiswa02 temp = head;
        do{
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            System.out.println("Data " + input.nama + " berhasil di tambahkan ");
            temp = temp.next;
        }while (temp != null );
    }
    public void insertAt (int index, Mahasiswa02 input){
        if (index < 0) {
            System.out.println("Indeks salah.");
        }else if (index == 0) {
            addFirst(input);
        }else{
            NodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa02(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
            System.out.println("Data " + input.nama + " berhasil di tambahkan ");
        }
    }
    public static Mahasiswa02 inputDataMahasiswa(Scanner sc){
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Prodi : ");
        String prodi = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa02(nim, nama, prodi, ipk);
    }
    public void getData(int index){
        NodeMahasiswa02 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }
    public int indexOf(String key){
        NodeMahasiswa02 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp =temp.next;
            index++;
        }
        if (temp == null){
            return -1;
        }else {
            return index;
        }
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail =null;
        }else{
            head = head.next;
        }
    }
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail =null;
        }else{
            NodeMahasiswa02 temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail=temp;
        }
    }
    public void remove (String key){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }else{
            NodeMahasiswa02 temp = head;
            while(temp != null){
                if (temp.data.nama.equalsIgnoreCase(key) && (temp == head)) {
                    this.removeFirst();
                }else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt ( int index){
        if (index == 0) {
            removeFirst();
        }else{
            NodeMahasiswa02 temp  = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
