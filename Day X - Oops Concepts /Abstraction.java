public class Abstraction {
    public static void main(String[] args) {

        Horse h1 =new Horse();
        h1.walk();
        h1.eat();

        Chicken h2 =new Chicken();
        h2.walk();
        h1.eat();
        
    }
    
}

 abstract class Animal{
    String color ;

    void eat(){
        System.out.println("Eat anything");
    }

    abstract void walk(); // abstrct class does not define anything it's subclass defines what he does 

}

class Horse extends Animal{
    String color;

    void walk(){
        System.out.println(" Walk On four legs");
    }
}
class Chicken extends Animal{
    String color;

    void walk(){
        System.out.println(" Walk On Two legs");
    }
}
