package Nomor1;

public class Classnomor1 {
    private double UbahJamkeDetik;
    private double UbahMenitkeDetik;
    private double Detik;
    private double Biaya;

    public void JamkeDetik(double jam){
        this.UbahJamkeDetik = jam * 3600;
    }
    public void MenitkeDetik(double menit){
        this.UbahMenitkeDetik = menit * 60;
    }
    public void Detikdetik(double detik){
        this.Detik = detik;
    }
    public void Biaya(double BIAYA){
        this.Biaya = BIAYA;
    }
    public double Kembalikanjam(){
        return UbahJamkeDetik;
    }
    public double Kembalikanmenit(){
        return UbahMenitkeDetik;
    }
    public double Kembalikandetik(){
        return Detik;
    }
    public double Kembalikanbiaya(){
        return Biaya;
    }
    public double Hasil(){
        double hasil = ((this.UbahJamkeDetik + this.UbahMenitkeDetik + this.Detik)/5)*this.Biaya;
        return hasil;
    }

   

    // public double perhitungan(double detik,int biaya){
    //     double hasil = ((UbahJamkeDetik + UbahMenitkeDetik + detik)/5)*biaya;
    // }

}
