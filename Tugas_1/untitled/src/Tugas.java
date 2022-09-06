import java.util.Scanner;


public class Tugas {
    public static void main(String[] args) {
        try (Scanner masuk = new Scanner(System.in)) {
            System.out.println("===============");
            System.out.println("Input Data");
            System.out.println("===============");


            int nilaipresensi, nilaitugas, nilaiUTS, nilaiUAS;
            String Nama,NIM;


            System.out.println("Nama Lengkap    :");
            Nama = masuk.nextLine();
            System.out.println("NIM             :");
            NIM = masuk.nextLine();

            System.out.println("Nilai Presensi  :");
            nilaipresensi = masuk.nextInt();
            System.out.println("Nilai Tugas     :");
            nilaitugas = masuk.nextInt();
            System.out.println("Nilai UTS       :");
            nilaiUTS = masuk.nextInt();
            System.out.println("Nilai UAS       :");
            nilaiUAS = masuk.nextInt();

            int nilai_akhir_presensi;
            nilai_akhir_presensi = nilaipresensi * 10/100;
            int nilai_akhir_tugas;
            nilai_akhir_tugas = nilaitugas * 20/100;
            int nilai_akhir_UTS;
            nilai_akhir_UTS = nilaiUTS * 30/100;
            int nilai_akhir_UAS;
            nilai_akhir_UAS = nilaiUAS * 40/100;
            int nilai_akhir_dari_segala_akhir;
            nilai_akhir_dari_segala_akhir = nilai_akhir_presensi + nilai_akhir_tugas + nilai_akhir_UTS + nilai_akhir_UAS;


            //=================================================
            System.out.println("===============");
            System.out.println("Nilai Mahasiswa");
            System.out.println("===============");

            System.out.println("NIM                     : " + NIM);
            System.out.println("Nama Lengkap            : " + Nama);


            //metode substring
            String Jurusan, Angkatan;
            Jurusan = NIM.substring(4,7);
            Angkatan = NIM.substring(0,4);


            //metode Equality
            String Inputjurusan = "071";
            String InputAngkatan = "2021";

            if (Jurusan.equals(Inputjurusan)&&Angkatan.equals(InputAngkatan)){
                System.out.println("Jurusan                 : " + "Informatika");
                System.out.println("Angkatan                : " + "2021");
            }
            else{
                System.out.println("salah boss");
            }
            System.out.println("Nilai presensi          : " + nilaipresensi);
            System.out.println("Nilai Tugas             : " + nilaitugas);
            System.out.println("Nilai UTS               : " + nilaiUTS);
            System.out.println("Nilai UAS               : " + nilaiUAS);
            System.out.println("Nilai Akhir             : " + nilai_akhir_dari_segala_akhir);




        }

    }
}

