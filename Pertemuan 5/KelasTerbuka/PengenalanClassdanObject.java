package KelasTerbuka;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}
public class PengenalanClassdanObject {
    // membuat class sebagai template
    public static void main(String[] args) throws Exception {
        
        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Jore";
        mahasiswa1.NIM = "2021071020";
        mahasiswa1.jurusan = "Teknik Valorant";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Mumung";
        mahasiswa2.NIM = "2021071028";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}

