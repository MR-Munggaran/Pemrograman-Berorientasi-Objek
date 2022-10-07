import java.util.Scanner;

public class warnet {
    public warnet(double internet,double ketik,double Dota,double scan,double CetakWarna,double CetakGrey,double Tehbotolsosro){
       double InternetMediaUtama = internet / 60;
       double Writers = ketik/60;
       double Steam = Dota/60;
       double Nyeken = scan*1000;
       double CetakUangWarna = CetakWarna*500;
       double CetakUangGrey = CetakGrey*300;
       double Sosro = Tehbotolsosro*3000;

       double hasil = (InternetMediaUtama * 4000) + (Writers * 2000) + (Nyeken) +(CetakUangWarna) + (CetakUangGrey) + (Sosro);
       System.out.println("Total Pembelian Si Udin adalah " + hasil);
    }
    // static double Surveimembuktikan(){
    //     return hasil;
    // }
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("====================Warnet Bebas==================");
        System.out.println("==================================================");
        System.out.println("Udin Bermain Komputer selama 90 Menit, Silahkan Rincikan:");
        try (Scanner Udin_surudin = new Scanner(System.in)) {
            System.out.print("Masukan berapa menit main internet: ");
            double internetan = Udin_surudin.nextDouble();
            System.out.print("Masukan berapa menit main mengetik: ");
            double Ngetik = Udin_surudin.nextDouble();
            System.out.print("Masukan berapa menit main games: ");
            double Ngegame = Udin_surudin.nextDouble();
            System.out.print("Masukan berapa file kamu scan: ");
            double Scan = Udin_surudin.nextDouble();
            System.out.print("Masukan berapa lembar kamu print warna: ");
            double Cetak = Udin_surudin.nextDouble();
            System.out.print("Masukan berapa lembar kamu print Hitam-putih: ");
            double Cetak_grey = Udin_surudin.nextDouble();
            System.out.print("Masukan berapa botol abis sosronya? : ");
            double FruitTea = Udin_surudin.nextDouble();
            warnet santai = new warnet(internetan, Ngetik, Ngegame, Scan, Cetak, Cetak_grey, FruitTea);
        }

    }
}
