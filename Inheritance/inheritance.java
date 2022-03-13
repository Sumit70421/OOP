package OOP.Inheritance;


class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{               //Single Level Inheritance
    public void area(int l,int n){
        System.out.println(1/2*l*n);
    }
}
class Equilateral extends Triangle{        //Multilevel inheritance {shape->traingle->Equilateral}
    public void area(int l,int n) {
        System.out.println(1/2*l*n);
    }
}

class Cirlce extends Shape{             //Hierarchial inheritance
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class inheritance {
    public static void main(String [] args) {
        
    }
}
