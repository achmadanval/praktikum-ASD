public class sorting02 {
    int[] data;
    int jmlData;

    public sorting02(int[] a, int jmlDat) {
        jmlData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jmlData; i++) {
            data[i] = a[i];
        }
    }
    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jmlData - 1; i++) { 
            for (int j = 1; j < jmlData - i; j++) { 
                if (data[j - 1] > data[j]) { 
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void SelectonSort(){
        for (int i = 0; i < jmlData; i++) {
            int min = i;
            for (int j = i+1; j < jmlData; j++) {
                if (data[j]< data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i]= data[min];
            data[min] = temp;
        }
    }

    void insectionSort(){
        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int j = i -1;
            while (j >= 0 && data[j] > temp) {
                data[j+1 ] = data[j];
                j--;
            }
            data[j+1]= temp;
        }
    }

    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
