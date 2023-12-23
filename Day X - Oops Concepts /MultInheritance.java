
public class MultInheritance {
    public static void main(String[] args) {
       fish papplet = new fish();
       papplet.eat();
       papplet.legs=2;
       System.out.println(papplet.legs);


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

    // Multi-level Inheritance

    class Mammal extends animals{
        int legs;
    }

    class fish extends Mammal{
        String bread;
    }
