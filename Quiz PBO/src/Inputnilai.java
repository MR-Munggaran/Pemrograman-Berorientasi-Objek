import java.util.Scanner;

public class Inputnilai {
    private double i;
    private String g;
    public Inputnilai(double inputaja){
        this.i = inputaja;
        if (inputaja >= 90){
            // System.out.println("A");
            this.g = "A";
        }
        else if (inputaja >= 80){
            // System.out.println("A-");
            this.g = "A-";
        }
        else if (inputaja >= 75){
            // System.out.println("B+");
            this.g = "B+";
        }
        else if (inputaja >= 70){
            // System.out.println("B");
            this.g = "B";
        }
        else if (inputaja >= 65){
            // System.out.println("B-");
            this.g = "B-";
        }
        else if (inputaja >= 60){
            // System.out.println("C+");
            this.g = "C+";
        }
        else if (inputaja >= 55){
            // System.out.println("C");
            this.g = "C";
        }
        else if (inputaja >= 50){
            // System.out.println("C-");
            this.g = "C-";
        }
        else if (inputaja >= 40){
            // System.out.println("D");
            this.g = "D";
        }
        else if (inputaja >= 0){
            // System.out.println("E");
            this.g = "E";
        }
    }
    public String hasil(){
        return this.g;
    }
    public double hasil2(){
        return this.i;
    }
    public static void main(String[] args) {
        try (Scanner masukin = new Scanner(System.in)) {
            System.out.print("Masukan Nilai : ");
            double nilainyaAda = masukin.nextDouble();
            Inputnilai oke = new Inputnilai(nilainyaAda);
            System.out.println("Hasilnya ");
            System.out.println("Nilai Angka kamu: " + oke.hasil2());
            System.out.println("Nilai Huruf kamu: " + oke.hasil() );
        }

    }
}
