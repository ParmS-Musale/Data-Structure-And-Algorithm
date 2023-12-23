public class FunOverloading {
    public static void main(String[] args) {
        calculate cal = new calculate();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.5,(float)2.5));
        System.out.println(cal.sum(1,2,3));
    }
}

class calculate{
    // integer
    int sum (int a, int b){
    return a +b ;
    }
    // float
    float sum (float a, float b){
    return a + b ;
    }

    int sum (int a, int b ,int c){
    return a + b + c;
    }
}
