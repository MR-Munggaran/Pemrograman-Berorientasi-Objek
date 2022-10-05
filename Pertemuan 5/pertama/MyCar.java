package pertama;

public class MyCar {
    int modelYear;
    String modelName;
    public MyCar(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        MyCar myCar = new MyCar(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
