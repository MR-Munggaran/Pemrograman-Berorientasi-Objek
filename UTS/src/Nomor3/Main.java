package Nomor3;

import java.util.Scanner;

public class Main {

    public static int recursion(){
        int tambah = 0;
        //buat array
        int[] Angka = new int[10];
        //buat input
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < Angka.length; i++)
            {
                System.out.print("Masukan Angka ke-"+i+": ");
                Angka[i] = input.nextInt();
                tambah += Angka[i];
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Hasil tambah seluruhnya adalah " + tambah);
        System.out.println("--------------------------------------");
        return tambah;
    }
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Masukkan bilangan random atau apa saja");
        System.out.println("Dibawah ini!");
        System.out.println("**************************************");
        recursion();
        System.out.println("Terima kasih sudah menginput angka :)");
    }
}
