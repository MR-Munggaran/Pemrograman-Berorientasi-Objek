package pertama;

abstract class Person{
    public String frontname = "John";
    public int age = 24;
    public abstract void study(); //abstract method
}

//subclass
class Student extends Person{
    public int grdauationYear = 2018;
    public void study(){
        // the body od the abstraact method is provided here
        System.out.println("Studying all day long");
    }
}
// end code from filename: person.java

// code ffrom filename : blabla.java

class Myclasssss{
    public static void main(String[] args) {
        //create an object of the Student class (which inherits attributes and methods from person)
        Student myObj = new Student();
        System.out.println("Name    : "+ myObj.frontname);
        System.out.println("Age     : "+ myObj.age);
        System.out.println("Graduation Year :"+myObj.grdauationYear);

        myObj.study();
    }
}