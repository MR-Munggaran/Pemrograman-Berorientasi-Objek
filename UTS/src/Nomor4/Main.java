package Nomor4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner masukges = new Scanner(System.in)) {
            System.out.println("===========================================================");
            System.out.println("          LUAS SEGITIGA DAN KELILING LINGKARAN");
            System.out.println("===========================================================");
            Lingkaran ling = new Lingkaran();
            Utama mulai = new Utama();


            System.out.println("\n-----------KELILING LINGKARAN-----------");
            System.out.print("Masukan Jari jari lingkaran : ");
            double jari = masukges.nextDouble();
            mulai.inputling(jari);


            System.out.println("\n-----------HASIL AKHIR-----------");
            System.out.println("Hasil keliling lingkaran adalah : " + ling.kelilingkaran(mulai.jariku,mulai.phi));
            System.out.println("Hasil Luas lingkaran adalah     : " + ling.luaslingkaran(mulai.jariku,mulai.phi));
        }
        
    }
}
