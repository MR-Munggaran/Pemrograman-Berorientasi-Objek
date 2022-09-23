package LatihanClass2;

class mobil{
    //attribute
    private boolean brake = false;
    private String nama;

    public void brakeon(){
        this.brake = true;
        System.out.println("Mobil" + this.nama);
        System.out.println("Status Mobil :" + this.brake);
    }
    public void brakeoff(){
        this.brake = false;
        System.out.println("Mobil" + this.nama);
        System.out.println("Status Mobil :" + this.brake);
    }
    public void setnama(String nama){
        this.nama = nama;
    }


}
