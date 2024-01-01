import java.util.ArrayList;
public class ArrayListOperation {

    // Operation =  Complexitiy
    // 1- add element = O(1)
    // 2- get element = O(1)
    // 3- remove element = O(n)
    // 4- set element at index = O(n)
    // 5- contain element = O(n)
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list = new ArrayList<>();
        // ArrayList<Character> list = new ArrayList<>();

        // 1- add element

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // 2- get element
        int index = list.get(3);

        System.out.println(index);

        //3 - Remove Element

        list.remove(2);
        System.out.println(list);

        // 4- set element at index
        
        list.set(2, 7);
        System.out.println(list);

        // 5- contain element
        System.out.println(list.contains(3));


    }
    
}
