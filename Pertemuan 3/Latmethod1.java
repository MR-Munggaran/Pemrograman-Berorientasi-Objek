public class Latmethod1 {
    static void welcome(String nama, double absen, double tugas, double uts, double uas) {
        System.out.println("Selamat datang " + nama);

        double akhir;
        akhir = (0.1 * absen) + (0.2*tugas) + (0.3+uts) + (0.4+uas);
        System.out.println("\nNilai "+nama +"adalah "+ akhir);

        
    }

    public static void main(String[] args) {
        double sn = 78;
        double tg = 50;
        double ut = 90;
        double as = 60;
        welcome("Rafi",sn,tg,ut,as);
    }
}
