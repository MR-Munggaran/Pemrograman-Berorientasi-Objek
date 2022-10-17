package Nomor2;

public class BMI {
    private double BeratBanget;
    private double tinggiJangkung;

    public void Aibkatanya(double berat){
        this.BeratBanget = berat;
    }
    public void Menara(double tinggi){
        this.tinggiJangkung = tinggi;
    }  
    public double Kembalikanberat(){
        return BeratBanget;
    }
    public double Kembalikantinggi(){
        return tinggiJangkung;
    }
    public double Bmi(){
        //cari di google pak rumusnya, maap ya pak
        double bmi =(this.BeratBanget /(this.tinggiJangkung * this.tinggiJangkung));
        return bmi;
    }
    public String view(){
        String BB;
        if (Bmi() >= 22.9){
            BB = "Overweight";
        }
        else if(Bmi() < 18.5){
            BB = "Underweight";
        }
        else{
            BB = "Ideal";
        }
        return BB;
    }
}
