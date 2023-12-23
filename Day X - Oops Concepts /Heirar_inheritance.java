
public class MultInheritance {
    public static void main(String[] args) {
       fish papplet = new fish();
       papplet.eat();
       papplet.swim();
    }
    
    }
    // Parent class or base class
    class animals{
        String color;
    
        void eat(){
            System.out.println("eating");
        }
        void walk(){
            System.out.println( " Walking");
        }    
    }
    
    // child class or derived classs
    
    class dog extends animals{
        void bark(){
            System.out.println(" barking");
        }
    }

    // Multi-level Inheritance + Heirarchical Inheritance

    class Mammal extends animals{
        void walk(){
            System.out.println("Walking");
        }
    }

    class fish extends Mammal{
        void swim(){
            System.out.println("Swiming");
        }
    }
