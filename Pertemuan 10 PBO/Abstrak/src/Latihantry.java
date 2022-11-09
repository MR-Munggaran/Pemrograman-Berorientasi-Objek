public class Latihantry {
    private int a;
    private int b;
    
    public int geta(){
        return a;
    }
    public int getb(){
        return b;
    }
    public void seta(int a){
        this.a = a;
    }
    public void setb(int b){
        this.b = b;
    }

    public static void main(String[] args) {
        try{
            Latihantry coba = new Latihantry();
            int b[] = {2,0,4};
            coba.seta(10);
            coba.setb(0);
            double hasil = 0;
            hasil = coba.geta() / b[3];
            System.out.println("Hasil : " + hasil);
        }
        catch(ArithmeticException e){
            System.out.println("Terjadi error dalam pembagian ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi error di array : " + e.getMessage());
        }
        finally{
            System.out.println("Try dan Catch telah selesai");
        }
        


    }
}
