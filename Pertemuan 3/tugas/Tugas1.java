package tugas;
import java.util.Scanner;


public class Tugas1 {
    public static void main(String[] args) {

        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan angka 1 - 10 : ");
            int angka = input.nextInt();

            if ((angka >= 1) && (angka <= 10)) {
                System.out.println("Nilai tersebut tersedia");
                break;
            } else {
                System.out.println("Nilai tidak tersedia");
                System.out.println("Silahkan Input nilai kembali\n");
            }



        }
    }
}