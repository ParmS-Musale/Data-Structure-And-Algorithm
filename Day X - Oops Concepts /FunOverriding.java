public class FunOverriding {
    // Same Function Name But Diffrent Parameter

    public static void main(String[] args) {
        chicken B1 = new chicken();
        B1.eat();
        
    }
}


class birds{
    String color;

    void eat(){
        System.out.println(" Eating fruits");
    }
}

class Hen extends birds{
    void eat(){
        System.out.println("Eating dana");
    }
}

class chicken extends Hen{
    void eat(){
        System.out.println("Eating Burger");
    }

}
