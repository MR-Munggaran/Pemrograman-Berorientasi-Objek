package Nomor2;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        System.out.println("===========================================================");
        System.out.println("             MENGUKUR BERAT BADAN IDEAL (BMI)");
        System.out.println("===========================================================");
        System.out.println("Silahkan masukan tinggi dan berat anda!");
        System.out.println("Jangan malu cuman diukur");
        System.out.println("\n");


        //input

        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukan Tinggi dalam meter (m)     : ");
			double tinggi = input.nextDouble();
			System.out.print("Masukan Berat dalam kilogram(Kg)   : ");
			double berat = input.nextDouble();

			//proses
			BMI beratbadaideal = new BMI();
			beratbadaideal.Aibkatanya(berat);
			beratbadaideal.Menara(tinggi);
			// System.out.println("Nilai badan kamu : " + beratbadaideal.Bmi());
			System.out.println("Kondisi Keidealan badan kamu       : " + beratbadaideal.view());
		}



    }
}
