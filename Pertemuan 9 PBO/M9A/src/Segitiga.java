public class Segitiga extends Bidtar{
    public Segitiga(double alas, double tinggi){
        double luas = alas * tinggi * 0.5;
        double keliling = alas * alas * alas;

        System.out.println("Hasil keliling segitiga adalah " + keliling );
        System.out.println("Hasil Luas segitiga adalah " + luas );
    }
}
