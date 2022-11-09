

abstract class kendaraan {
    public abstract void remTangan();
    public abstract void Setir(String arah);
    public abstract void remKaki();

    //regular methode
    public void SinyalMundur(String arah){
        if(arah.equals("Mundur") || arah.equals("mundur")){
            System.out.println("Sinyal berbuyi");
        }
    }

}
