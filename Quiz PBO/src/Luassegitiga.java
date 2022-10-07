import java.util.Scanner;

public class Luassegitiga{
    private double alasbanget;
    private double tinggibanget;

    public Luassegitiga(double alasinput, double tinggiinput){
        this.alasbanget = alasinput;
        this.tinggibanget = tinggiinput;
    }
    public double GetA() {
        return this.alasbanget;
    }
    public double GetT() {
        return this.tinggibanget;
    }
    public double luas(){
        double hasil = this.tinggibanget * this.alasbanget* 0.5;
        return hasil;  
    }
    public static void main(String[] args) {
        try (Scanner masukpaeko = new Scanner(System.in)) {
            System.out.print("Masukan Nilai alas : ");
            double alastidur = masukpaeko.nextDouble();
            System.out.print("Masukan Nilai tinggi : ");
            double tinggijangkung = masukpaeko.nextDouble();
            Luassegitiga tiga = new Luassegitiga(alastidur, tinggijangkung);
            System.out.println("Hasil Perhitungan Luas Segitiga adalah " + tiga.luas());
        }
    }
}