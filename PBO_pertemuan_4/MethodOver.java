public class MethodOver {
    static int  perhitungan(int a, int b){
        return a + b;
    }
    static double perhitungan(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("hasil dari nomor 1 : "+ perhitungan(5, 5.6));
        System.out.println("hasil dari nomor 2 : "+ perhitungan(5.6f, 5));
        System.out.println("hasil dari nomor 3 : "+perhitungan(5, 5));
        System.out.println("hasil dari nomor 4 : "+perhitungan(5.6f, 5.6f));
    }
}
