public class P_3_2 {
    public static void main(String[] args) {
        int[] angka = {4,5,10,6,8,13}; //inisialisasi array int

        //untuk mengakses nilai pada array secara manual
        System.out.printf("\nnilai ke 1 adalah %d", angka[0]);
        System.out.printf("\nnilai ke 2 adalah %d", angka[1]);
        System.out.printf("\nnilai ke 3 adalah %d", angka[2]);
        System.out.printf("\nnilai ke 4 adalah %d", angka[3]);
        System.out.printf("\nnilai ke 5 adalah %d", angka[4]);
        
        //untuk mengakses nilai pada array secara loop
        System.out.println("\n\nmenampilka data dgn loop 1\n");
        for (int i=0; i<angka.length;i++){
            System.out.println("Nilai ke-" + (i+1)+" adalah "+ angka[1]);
        }

        System.out.println("\n menampilkan data dgn loop \n");
        
        int j= 1;
        for (int nilai : angka){
            System.out.println("Nilai ke- "+ j + "adalah" + nilai);
            j++;
        }
        //mengganti nilai array
        angka[2] = 30;

        // tampilakan nilai yang telah diubah

        System.out.printf("\nNilai ke-3 setelah diganti adalah %d", angka[2]);
    }
}
