package LatihanClass2;

public class Main {
    public static void main(String[] args) {
        mobil brio = new mobil();
        mobil audi = new mobil();
        
        brio.setnama("Brio");
        brio.brakeon();
        brio.brakeoff();
        
        brio.setnama("Audi");
        audi.brakeoff();
    }

}
