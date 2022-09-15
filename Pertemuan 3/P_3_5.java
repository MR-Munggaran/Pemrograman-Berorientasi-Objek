import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P_3_5 {
    public static void main(String[] args) {
        //Cara 1
        /*ArrayList <Integer> arraylatihan = new ArrayList<Integer>();
        arraylatihan.add(10);
        arraylatihan.add(3);
        arraylatihan.add(40);
        arraylatihan.add(50);
        arraylatihan.add(15);
        arraylatihan.add(5);
        arraylatihan.add(7);
        arraylatihan.add(8);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai : ");
        int angka = input.nextInt();
        
        if(arraylatihan.contains(angka)){
            System.out.printf("\nangka %d ada pada array \n", angka);
        }
        else{
            System.out.printf("\n angka %d tidak ada pada array\n ", angka);
        }*/
        //Cara 2

        
        int[] arraylatihan = {10,3,40,50,15,5,7,8};

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai : ");
        int angka = input.nextInt();
        
        boolean correct = false;
        int k = 0;
        for (int i: arraylatihan){
            if (i == angka){
                correct = true;
                int posisi = k;
                    if(correct){
                        System.out.printf("\nangka %d ada pada array  dan  pada indeks ke %d\n", angka, posisi);
                    }
                    else{
                        System.out.printf("\n angka %d tidak ada pada array\n ", angka);
                    }
                
                break;
            }
        }
    
    }
}
