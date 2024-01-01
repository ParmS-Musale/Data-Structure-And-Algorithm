import java.util.ArrayList;

public class SwapNum {
    public static void swap (ArrayList<Integer> list , int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(00000);
        list.add(328);
        list.add(45);
        list.add(8);
        list.add(9);

        System.out.println(list);
        swap(list, 0, 1);
        System.out.println("The Array After Swapping: "+ list);

    }
}
