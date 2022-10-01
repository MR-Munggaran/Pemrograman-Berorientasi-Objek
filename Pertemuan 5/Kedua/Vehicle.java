package Kedua;

class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }

}

class Car extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();
        // call the honkk() method (from the vehicle class) on the myCar object
        myCar.honk();
        //Display the value of the brand attrribute (from the vehicle class)
        System.out.println(myCar.brand+ " "+ myCar.modelName); 

    }
    
}
