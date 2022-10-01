package pertama;

public class Myclassfinal {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Myclassfinal myObj = new Myclassfinal();
        //myObj.x = 50; cannot
        //myObj.PI = 25; cannot
        System.out.println(myObj.x);

    }
}
