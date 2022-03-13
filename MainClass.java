package OOP;
//At the top of parent tree there lies object who is parent of all classes
public class MainClass {
    public static void main(String [] args){
        Person p1 = new Person(69,"Sammy");
        Person p2 = new Person(23,"Gabriel");
        Person p3 = new Person(25,"Sand");
        p1.name = "Sammy";
        p1.age = 69;
        System.out.println(p2.name + " "+ p2.age);
        Abstaction m = new Abstaction();    //From diff package
        m.check();
        p2.eat();
        p3.walk();
        p1.eat();
        p1.walk();
        p1.walk(20);     //polymorphism
        Developer d1 = new Developer(99, "Homer");
        d1.doWork();
        d1.walk();      //It will search for methods in own class then go to parent class
        System.out.println(Person.count);   // Static variables can be accessed without object creation 
    }
}
class Developer extends Person{         //Use extend to inherit from parent class
    public Developer(int age, String name){
        super(age,name);    //refers to parent constructor
    }
    void walk(){
        System.out.println("Developer is walking");     //If method exists in own class it gets executed
        //This is runtime Polymorphism
    }
}
class Person{
    String name;
    int age;
    static int count;
    // public Person(){
    //     count++;                                    //constructor
    //     System.out.println("Creating object " + count);
    // }
    void walk() {
        System.out.println(name + "is walking");
    }
    void eat(){
        System.out.println(name + "is eating" + age + "dicks");
    }
    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps ");  //Compile time polymorphism
    }
    Person(int age,String name){
        count++;           //Here this refers to constructor of the class
        this.age = age;     //Here this refers to attributes of the class
        this.name = name;   //Its used to differentiate between parameters and class attris
    }
    void doWork(){
        System.out.println("Person is working....");
    }
}