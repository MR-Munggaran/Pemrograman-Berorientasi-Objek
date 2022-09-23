package LatihanClass;
class OOPMobil {
    // attribute / states
    private boolean rem = false;
    //methods / behaviours
    public void mengerem(){
        if (this.rem == true){
            System.out.println("Mobil mengerem");
        }
        else{
            System.out.println("mobil tidak mengerem");
        }
        System.out.println("Fungsi rem dipanggil");
    }
    public void akses_rem(boolean rem) {
        this.rem = rem;
    }
}
public class Main2{
    public static void main(String[] args) {
        OOPMobil objmobil = new OOPMobil();
        //atribute bersifat public
        objmobil.akses_rem(true);
        objmobil.mengerem();
    }
}
