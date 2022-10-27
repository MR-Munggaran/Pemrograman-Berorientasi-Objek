public class Main {
    public static void main(String[] args) {
        Bidtar bidangDatar = new Bidtar();
        
        bidangDatar.s1mantap(14);
        bidangDatar.s2mantap(7);
        
        Segitiga segitiga = new Segitiga(bidangDatar.s1masuk(),bidangDatar.s2masuk());
        lingkaran Lingkaran = new lingkaran(bidangDatar.s2masuk());
    }
}
