
public class Tesla extends kendaraan{
    public void remTangan(){
        System.out.println("Gunakan rem tangan");
    }
	@Override
	public void Setir(String arah) {
        if(arah.equals("Kanan") || arah.equals("kanan")){
            System.out.println("Arahkan setir ke " + arah);
        }
        else if (arah.equals("Kiri") || arah.equals("kiri")){
            System.out.println("Belok kiri bang");
        }
        else{
            System.out.println("Error:!");
        }
	}
	@Override
	public void remKaki() {
		System.out.println("Gunakan rem kaki");
		
	}
}
