package tugas;
import java.util.Objects;
import java.util.Scanner;

public class Tugas3_suit {

    public static void main(String[] args) {
        while(true) {

            String j_manusia;
            int j_komputer;
            String[] jari = {"Jempol", "Telunjuk", "Kelingking"};
            Scanner input = new Scanner(System.in);
            
            System.out.println("================");
            System.out.println("MULAI PERMAINAN");
            System.out.println("================");
            System.out.printf("masukan jari untuk J = %s, T = %s, K = %s : ", jari[0], jari[1], jari[2]);
            j_manusia = input.nextLine();

            switch (j_manusia) {
                case "J" -> System.out.println("kamu memilih         : Jempol");
                case "T" -> System.out.println("kamu memilih         : Telunjuk");
                case "K" -> System.out.println("kamu memilih         : kelingking");
                default -> {
                    System.out.println("yang kamu pilih itu salah");
                    System.out.println("silahkan ulang lagi");
                    continue;
                }
            }

            /*int a = (int) ( Math.random() * 10 );
		    int b = 5 + (int)( Math.random() * 10);
		    System.out.println( "Nilai random antara bilangan 0 dan 10 adalah "+""+a );
		    System.out.println( "Nilai random antara bilangan 5 dan 10 adalah "+""+b );*/
            //e + Math.random() * f

            j_komputer = (int) (1 + Math.random() * 3);
            String jawaban = null;
            if (j_komputer == 1) {
                jawaban = jari[0];
                System.out.printf("Komputer memilih     : %s", jawaban);
            } else if (j_komputer == 2) {
                jawaban = jari[1];
                System.out.printf("Komputer memilih     : %s", jawaban);
            } else if (j_komputer == 3) {
                jawaban = jari[2];
                System.out.printf("Komputer memilih     : %s", jawaban);
            }


            if (j_manusia.equals("J") && Objects.equals(jawaban, jari[0])) {
                System.out.println("\nhasil                : Kamu Seri");
            } else if (j_manusia.equals("J") && Objects.equals(jawaban, jari[1])) {
                System.out.println("\nhasil                : Selamat kamu menang");
            } else if (j_manusia.equals("J") && Objects.equals(jawaban, jari[2])) {
                System.out.println("\nhasil                : Kamu kalah");
            } else if (j_manusia.equals("T") && Objects.equals(jawaban, jari[0])) {
                System.out.println("\nhasil                : Kamu kalah");
            } else if (j_manusia.equals("T") && Objects.equals(jawaban, jari[2])) {
                System.out.println("\nhasil                : Selamat kamu menang");
            } else if (j_manusia.equals("K") && Objects.equals(jawaban, jari[0])) {
                System.out.println("\nhasil                : Selamat kamu menang");
            } else if (j_manusia.equals("K") && Objects.equals(jawaban, jari[1])) {
                System.out.println("\nhasil                : Kamu kalah");
            } else if (j_manusia.equals("K") && Objects.equals(jawaban, jari[2])) {
                System.out.println("\nhasil                : Kamu Seri");
            } else if (j_manusia.equals("T") && Objects.equals(jawaban, jari[1])) {
                System.out.println("\nhasil                : Kamu Seri");
            }
            System.out.println("apakah kamu ingin bermain lagi? [y/t] : ");
            String in_out = input.nextLine();

            if (in_out.equals("y") || in_out.equals("Y")){
                System.out.println("Yuk bermain lagi\n");
            } else if (in_out.equals("t") || in_out.equals("T")) {
                System.out.println("terima kasih sudah bermain\n");
                break;
            }
        }
    }
}
