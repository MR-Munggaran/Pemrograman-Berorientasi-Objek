package tugas;
import java.util.Scanner;

public class Tugas2
{
    public static void main(String[] args)
    {
        String kalimat = "kalau dilakukan dengan sepenuh hati maka besi batangan\n pun kalau digosok terus menerus akan menjadi jarum\n";
        System.out.println(kalimat);

        /*Fungsi contains() digunakan untuk mencari
        string tertentu pada string lainnya. Atau jika dibawakan pada suatu kasus,
        bisa digunakan untuk mencari kata tertentu pada suatu kalimat.
         */
        do
        {
            Scanner input = new Scanner(System.in);
            System.out.println("\nMasukan kata dari kalimat tersebut :");
            String kata = input.nextLine();

            if (kalimat.contains(kata)) {
                System.out.printf("Kata %s ada di kalimat yang ada di atas", kata);
                break;
            } else {
                System.out.printf("Kata %s tidak ada di dalam kalimat\n", kata);
                System.out.println("Coba lagi");
            }


        }
        while(true);
    }


}
