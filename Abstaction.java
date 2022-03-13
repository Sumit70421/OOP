package OOP;

public class Abstaction {
    public static void main(String[] args) {
        // Car c1 = new Car();   //Cannot instantiate the type Car
        // c1.start();
        BMW c1 = new BMW();
        c1.start();
    }
    void check(){
        System.out.println("Hello");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("BMW is starting");
    }
}
abstract class Car{    //Abstract keyword doesnt allow object creating for the given class
    int price;
    abstract void start();  //It means start method will be declared in child elements
    void breaks(){
        System.out.println("Breaks applied");   //concrete functions that makes key diff between abstract classes and interfaces
    }
}
