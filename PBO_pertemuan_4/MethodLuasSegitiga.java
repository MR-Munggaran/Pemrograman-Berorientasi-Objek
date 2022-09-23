import java.util.Scanner;

public class MethodLuasSegitiga{
    static double input(){

        double a;
        double t;

        Scanner input = new Scanner(System.in);
        System.out.print("masukan alas      : ");
        a = input.nextDouble();

        System.out.print("Masukan tinggi    : ");
        t = input.nextDouble();

        double perhitungan_awal = a * t;
        return perhitungan_awal;
    }
    static double luas(){
        double luassegitiga;

        luassegitiga = 0.5f * input();

        return luassegitiga;
    }

    public static void main(String[] args) {
        System.out.println("Perhitungan Luas Segitiga");
        System.out.println("hasil luas        : "+ luas());
        
    }
}