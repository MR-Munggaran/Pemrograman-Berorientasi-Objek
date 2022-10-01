package tugasnotepad;

public class LuasSegitiga {
    private double alas;
    private double tinggi;
    double hasil;

    public void alasbanget(double angka) {
        this.alas = angka;
    }
    public void tinggibanget(double angka1) {
        this.tinggi = angka1;
    }
    public double luassegitigabermuda(){
        hasil = this.alas * this.tinggi * 0.5;
        System.out.println("Hasil dari luas Segitiga adalah     : " + hasil);
        return hasil;
    } 
}
