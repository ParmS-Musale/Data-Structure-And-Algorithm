import java.util.ArrayList;

public class MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(00000);
        list.add(328);
        list.add(45);
        list.add(8);
        list.add(9);

        System.out.println(list);

        int max = Integer.MIN_VALUE ;

        for(int i=0 ; i<list.size() ; i++){
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.print("Maximum Number is:" + max);

    }
