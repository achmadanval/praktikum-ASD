public class fungsi {
    public static void main(String[] args) {
        int [][] stok = {{10,5,15,7,},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
        };

        int[] harga = {75000,50000,60000,10000};
        int[] pengurangan = {-1, -2, 0 , -5};
        total1Cabang(stok, harga);
        pendapatan1Cabang(pengurangan, harga);
        updateStok(stok);

    }
    public static int pendapatan1Cabang(int[] barang, int[] harga){
        int total = 0;
        for (int j = 0; j < barang.length; j++) {
            total += barang[j] * harga[j];
        }
        return total;
    }
    public static void total1Cabang(int[][] stok, int[] harga) {
        System.out.println("pendapatan setiap cabang jika semua bunga terjual : ");
        for (int i = 0; i < stok.length; i++) {
            int total = pendapatan1Cabang(stok[i], harga);
            System.out.println("Cabang " + (i + 1) + " : Rp " + total);
        }
    }
    public static void penguranganStok(int[][] stok, int[] pengurangan){
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                stok[i][j] += pengurangan[j];
            }
        }
    }
    public static void updateStok(int[][] stok) {
        System.out.println("Stok barang setelah beberapa tanaman mati : ");
        for (int i = 0; i < stok.length; i++) {
            System.out.println("Cabang " + (i + 1) + " : ");
            for (int j = 0; j < stok[i].length; j++) {
                System.out.print(stok[i][j]+ " ");
            }
            System.out.println();
        }
    }
}