import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int i = list.get(0); // get the first in the list and check if it is greatest || it works with i = 0 but it will fail if there are negative numbers in the list.
        for(int number : list){ // go through the whole list
            if(i < number){ // if a greater number in the list is found
                i = number; // the previous one is replaced by the new greatest number.
            }
        }
        return i;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
