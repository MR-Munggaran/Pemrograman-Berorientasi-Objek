public class P_3_4 {
    public static void main(String[] args) {
        int[] arraylatihan = {10,3,40,50,15,5,7,8};
        int i=0;
        float k=1;
        for(int angka : arraylatihan){
            i += angka;
            k = i/8;

    }
    System.out.println("Hasil rata - rata adalah : " + k);
    }
    
}
