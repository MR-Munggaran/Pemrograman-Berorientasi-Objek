import java.util.Scanner;

public class Pulsahandphone {
    double hasil;
    static double ubahnihjam(int jam){
        return 3600*jam;
    }
    static double ubahnihmenit(int menit){
        return 60*menit;
    }
    public Pulsahandphone(int detik, int jam, int menit, int biaya){
        hasil = ((ubahnihjam(jam) + ubahnihmenit(menit) + detik) / 5) * biaya;
    }
    public double hasil69(){
        return hasil;
    }
    public static void main(String[] args) {
        int duit = 150;
        try (Scanner Pakeko = new Scanner(System.in)) {
            System.out.print("Masukan Angka jam : ");
            int bigbang = Pakeko.nextInt();
            System.out.print("Masukan Angka menit : ");
            int bigbangbang = Pakeko.nextInt();
            System.out.print("Masukan Angka Detik : ");
            int bigbangbangbang = Pakeko.nextInt();
            Pulsahandphone Ngutang = new Pulsahandphone(bigbangbangbang, bigbang, bigbangbang,duit);
            System.out.println(" ");
            System.out.println("Biaya yang dikenakan sebanyak Rp. " + Ngutang.hasil69());
        }
    }
}
