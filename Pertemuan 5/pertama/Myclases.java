package pertama;

public class Myclases {
    int x;
    // create a class construction for the myClass class
    public Myclases(){
        x = 5;//set the initial value for the class attribute x
    }
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }   
}
