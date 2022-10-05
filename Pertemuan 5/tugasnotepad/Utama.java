package tugasnotepad;
import java.util.*;
public class Utama {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("              LUAS SEGITIGA");
        System.out.println("========================================");
        LuasSegitiga luas = new LuasSegitiga();
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan angka untuk alas            : ");
            int angka_alas = input.nextInt();
            System.out.print("Masukan angka untuk tinggi          : ");
            double angka_tinggi = input.nextDouble();
            
            luas.alasbanget(angka_alas);
            luas.tinggibanget(angka_tinggi);
            luas.luassegitigabermuda();
            
            System.out.println("========================================");
            System.out.println("              LUAS LINGKARAN");
            System.out.println("========================================");
            
            LuasLingkaran Luasling = new LuasLingkaran();
            System.out.print("Masukan angka untuk Jari - Jari      : ");
            double angka_jari = input.nextDouble();

            Luasling.menamaijariku(angka_jari);
            Luasling.luaslingkaranku();
        }
    }
}
