public class PO2 extends PO1{
    public PO2(){
        // super();
        System.out.println("ini adalah konstruktor Anak");
    }
    public void information(){
        System.out.println("Nama : " + this.nama);
    }

    public void Makan(){
        super.Makan();
        System.out.println("Saya mah makan kentang pun jadi");
    }
}
