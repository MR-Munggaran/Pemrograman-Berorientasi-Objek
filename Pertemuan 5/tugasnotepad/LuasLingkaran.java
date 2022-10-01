package tugasnotepad;

public class LuasLingkaran {
    private double jari;
    double hasilterbaik;

    public void menamaijariku(double angka) {
        this.jari = angka;
    }
    public double jariiiii(){
        return jari;
    }
    public double luaslingkaranku(){
        hasilterbaik = this.jari * this.jari * 3.14;
        System.out.println("Hasil dari luas lingkaran adalah     : " + hasilterbaik);
        return hasilterbaik;
    } 
}
