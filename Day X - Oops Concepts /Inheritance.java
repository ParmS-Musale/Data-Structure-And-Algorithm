
public class Inheritance {
    public static void main(String[] args) {
        dog bulldog = new dog();
        bulldog.eat();
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
    
