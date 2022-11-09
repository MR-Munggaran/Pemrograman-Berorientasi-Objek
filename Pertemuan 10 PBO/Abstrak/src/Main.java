import Package.*;

public class Main {
    public static void main(String[] args) {
        // buat obj
        Bahasajava bahasa = new Bahasajava();
        bahasa.pesan();
        bahasa.pesanDua();

        System.out.println("===========================================");
        
        Tesla mobil = new Tesla();
        mobil.Setir("Kanan");
        mobil.remKaki();
        mobil.remTangan();
        mobil.SinyalMundur("Mundur");
        
        System.out.println("===========================================");
        
        kucing meng = new kucing();
        meng.hidup();
        meng.Kaki();
        meng.suara();
        meng.tidur();
        
        System.out.println("===========================================");
        kucingGarong hewankucing = new kucingGarong();
        hewankucing.suara();
        
    }
}
