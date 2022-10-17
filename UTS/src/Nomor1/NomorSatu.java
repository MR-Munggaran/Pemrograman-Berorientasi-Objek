package Nomor1;

import java.util.Scanner;

public class NomorSatu {
    public static void main(String[] args) {
        
        try (Scanner Udin = new Scanner(System.in)) {
            System.out.println("===========================================================");
            System.out.println("                  BIAYA PULSA HANDPHONE");
            System.out.println("===========================================================");
            System.out.println("Sudah Berapakah kamu menelpon? Masukan jam,menit, dan detik");

            //input
            System.out.print("Masukan Jam   : ");
            double jam = Udin.nextDouble();
            System.out.print("Masukan Menit : ");
            double Menit = Udin.nextDouble();
            System.out.print("Masukan Detik : ");
            double Detik = Udin.nextDouble();

            // Class
            Classnomor1 Ngutang = new Classnomor1();
            Ngutang.JamkeDetik(jam);
            Ngutang.MenitkeDetik(Menit);
            Ngutang.Detikdetik(Detik);
            Ngutang.Biaya(150);
            System.out.println("\n" );
            System.out.println("Maka Tagihan yang kamu harus bayar adalah Rp." + Ngutang.Hasil());
        }


    }
}
