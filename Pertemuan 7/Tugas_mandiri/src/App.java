import java.util.Scanner;

public class App {
    private double GajiPokok;
    private double Tunjangan;
    private int input;

    public App(int input){
        this.input = input;
        if (input == 4){
            this.GajiPokok = 2899500;
            this.Tunjangan = 400000;
        }
        else if(input == 3){
            this.GajiPokok = 2456700;
            this.Tunjangan = 350000;
        }
        else if(input == 2){
            this.GajiPokok = 1926000;
            this.Tunjangan = 300000;
        }
        else if(input == 1){
            this.GajiPokok = 1486500;
            this.Tunjangan = 250000;
        }
        else{
            System.out.println("Salah Input");
        }
    }
    public double BalikPokok(){
        return this.GajiPokok;
    }
    public double BalikTunjangan(){
        return this.Tunjangan;
    }
    public double input(){
        return this.input;
    }
    public double lembur(double jam){
        double JamKerja = jam;
        double total;
        total = JamKerja - 173;
        double gaji;
        gaji = total * 20000;
        return gaji;
    }
    public void Gaji(int jam){
        double hasil;
        hasil = (this.GajiPokok + this.Tunjangan) * 0.005 +lembur(jam);
        System.out.println("Total Gaji                    : Rp."+hasil);
        //System.out.print("Masukan Angka Golongan Kamu   : ");

    }

    public static void main(String[] args) throws Exception {
        System.out.println("============================================");
        System.out.println("==================Golongan==================");
        System.out.println("Gol 1 = Junior");
        System.out.println("Gol 2 = UI/UX");
        System.out.println("Gol 3 = Head Project");
        System.out.println("Gol 4 = Manager");
        System.out.println("============================================");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan Angka Golongan Kamu   : ");
            int golongan = input.nextInt();
            System.out.print("Masukan Angka Jam kerja Kamu  : ");
            int kerja = input.nextInt();

            App menggolongkan = new App(golongan);
            menggolongkan.Gaji(kerja);
        }
    }
}
