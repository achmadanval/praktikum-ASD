public class DataDosen02{
    int pria, wanita;
    
    public void dataSemuaDosen(Dosen02[] arrDosen02){
        System.out.println(" ====Data Dosen =====");
        for (Dosen02 dosen02 : arrDosen02) {
            System.out.println("Kode           :  "  + dosen02.kode);
            System.out.println("Nama           :  "  + dosen02.nama);
            System.out.println("Jenis Kelamin  :  "  + dosen02.jenisKelamin);
            System.out.println("Usia           :  "  + dosen02.usia);
            System.out.println("--------------------------------------");
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen02[] arrDosen02){
        pria = 0;
        wanita = 0;
        for (int i = 0; i < arrDosen02.length; i++) {
            if (arrDosen02[i].jenisKelamin) {
                pria ++;
            }else{
                wanita++;
            }
        }
        System.out.println("Jumlah dosen Pria   : " + pria);
        System.out.println("Jumlah dosen Wanita : " + wanita);
    }
    public void rata2UsiaDosenPerJenisKelamin(Dosen02[] arrDosen02){
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for (int i = 0; i < arrDosen02.length; i++) {
            if (arrDosen02[i].jenisKelamin) {
                totalUsiaPria += arrDosen02[i].usia;
                jumlahPria++;
            }else{
                totalUsiaWanita += arrDosen02[i].usia;
                jumlahWanita++;
            }
        }
        double rataUsiaPria = (jumlahPria > 0) ? (double) totalUsiaPria / jumlahPria : 0;
        double rataUsiaWanita = (jumlahWanita > 0) ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("Rata-rata usia dosen pria :  " + rataUsiaPria);
        System.out.println("Rata-rata usia dosen wanita :  " + rataUsiaWanita);
    }
    public void infoDosenPalingTua(Dosen02[] arrDosen02){
        Dosen02 dosentertua = arrDosen02[0];
        for (int i = 0; i < arrDosen02.length; i++) {
            if (arrDosen02[i].usia > dosentertua.usia) {
                dosentertua = arrDosen02[i];
            }
        }
        System.out.println("==== Dosen Paling Tua ===== ");
        System.out.println("Kode            : " + dosentertua.kode);
        System.out.println("Nama            : " + dosentertua.nama);
        System.out.println("Jenis Kelamin   : " + (dosentertua.jenisKelamin ? "Pria" : "Perempuan"));
        System.out.println("Usia            : " + dosentertua.usia);
    }
    public void infoDosenPalingMuda(Dosen02[] arrDosen02){
        Dosen02 dosenterMuda = arrDosen02[0];
        for (int i = 0; i < arrDosen02.length; i++) {
            if (arrDosen02[i].usia < dosenterMuda.usia) {
                dosenterMuda = arrDosen02[i];
            }
        }
        System.out.println("==== Dosen Paling Muda ===== ");
        System.out.println("Kode            : " + dosenterMuda.kode);
        System.out.println("Nama            : " + dosenterMuda.nama);
        System.out.println("Jenis Kelamin   : " + (dosenterMuda.jenisKelamin ? "Pria" : "Perempuan"));
        System.out.println("Usia            : " + dosenterMuda.usia);
    }
}