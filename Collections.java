package OOPG.Week6;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Collections {
    

    public static void main(String[] args){
        //Q1
        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        
        System.out.println("Linked list before insertion is: " + list1);
        addAndSort(list1, 10);
        System.out.println("Linked list after insertion is: " + list1);
    
        //Q2
        swapValues(list1, 3, 4);
        System.out.println("\nLinked list after swapping is: " + list1);

       //Q3
       LinkedList<Integer> list2 = new LinkedList<Integer>(); 
       for (int i =0; i<500; i++){
            list2.add((ThreadLocalRandom.current().nextInt(1000, 10000)));
       }
       System.out.println("\nRandomly generated Linked list: " + list2);
       int searchValue = ThreadLocalRandom.current().nextInt(1000, 10000);
       System.out.println("Randomly generated search value: " + searchValue);
       System.out.println("Index value of matching number (-1 if unable to find): " + findValue(list2, searchValue));
    }
    //Q1 method
    private static void addAndSort(LinkedList<Integer> list ,int val) {
        if (list.size() == 0) {
            list.add(val);
        } else if (list.get(0) > val) {
            list.add(0, val);
        } else if (list.get(list.size() - 1) < val) {
            list.add(list.size(), val);
        } else {
            int i = 0;
            while (list.get(i) < val) {
                i++;
            }
            list.add(i, val);
        }
    }
    //Q2 method
    public static void swapValues(LinkedList<Integer> list, int index1, int index2){

        // Getting the positions of the elements
        int element1 = list.get(index1);
        int element2 = list.get(index2);

        // Returning if the element is not present in the
        // LinkedList
        if (index1 == -1 || index2 == -1) {
        return;
        }

        // Swapping the elements
        list.set(index1, element2);
        list.set(index2, element1);
    }

    //Q3 Method
    public static int findValue(LinkedList<Integer> list, int searchValue){
        
        int indexPosition = -1;
        for (int i = 0; i < list.size(); i++) {
    
            int listElement = list.get(i);

            if (listElement == searchValue) {
                indexPosition = i;
                break;
            }
        }
        return indexPosition;   
    }
}
