import java.util.ArrayList;

public class arrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // add element in arraylist

        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        // add to specific index
        arrayList.add(2, 3);

        // remove from arraylist; 
        arrayList.remove(2);

        // to modify element in arraylist
        arrayList.set(0, 3);

        // to get element from arraylist
        arrayList.get(3);

        // get no. of elements in arraylist
        int sizeofarrayList = arrayList.size();
        System.out.println(sizeofarrayList);

        // loop to print all elements of arraylist one by one.
        for (int i  = 0 ; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }


    }
}

