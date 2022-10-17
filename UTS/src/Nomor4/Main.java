package Nomor4;
import java.util.Scanner;

public class Main {
    private double jariku;
    private double alasbanget;
    private double tinggisekali;

    public Main(double jari, double alas,double tinggi){
        double hasilling;
        double hasiltiga;
        this.jariku = jari;
        this.alasbanget = alas;
        this.tinggisekali = tinggi;

        hasilling = 2 * this.jariku * 3.14;
        hasiltiga = this.alasbanget * this.tinggisekali * 0.5;

        System.out.println("Hasil keliling lingkaran adalah : " + hasilling);
        System.out.println("Hasil luas Segitiga adalah      : " + hasiltiga);

        
    }

    public static void main(String[] args) {
        try (Scanner masukges = new Scanner(System.in)) {
            System.out.println("===========================================================");
            System.out.println("          LUAS SEGITIGA DAN KELILING LINGKARAN");
            System.out.println("===========================================================");

            System.out.println("\n-----------KELILING LINGKARAN-----------");
            System.out.print("Masukan Jari jari lingkaran : ");
            double jari = masukges.nextDouble();
            
            System.out.println("\n-----------LUAS SEGITIGA-----------");
            System.out.print("Masukan Alas Segitiga : ");
            double alas = masukges.nextDouble();
            System.out.print("Masukan Tinggi Segitiga : ");
            double tinggi = masukges.nextDouble();
            
            
            System.out.println("\n-----------HASIL AKHIR-----------");
            Main hasilview = new Main(jari, alas, tinggi);
        }
        
        
    }
}
