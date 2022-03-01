package OOPG.Week6;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class CollectionsWithHash {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        Q4(obj);
        Q5(obj);
        Q6(obj);
    }
    public static void Q4(Scanner input) {

        HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
        HashMap.put(0, 1);
        HashMap.put(1, 3);
        HashMap.put(2, 5);
        HashMap.put(3, 7);
        HashMap.put(4, 9);
        HashMap.put(5, 11);

        /* Before */
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        /* After */
        System.out.println("Insert a number into HashMap: ");
        AddAndSortHM(HashMap, input.nextInt());
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
    }

    public static void Q5(Scanner input) {

        HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();
        HashMap.put(0, 1);
        HashMap.put(1, 3);
        HashMap.put(2, 5);
        HashMap.put(3, 7);
        HashMap.put(4, 9);
        HashMap.put(5, 11);

        System.out.println();
        System.out.println();

        /* Before */
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        /* After */
        System.out.print("Swap 2 indexes in the HashMap: \n");
        SwapHM(HashMap, input.nextInt(), input.nextInt());
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void Q6(Scanner input) {

        HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < 5; i++) {
            HashMap.put(i, (int) (Math.random() * (9999 - 1000 + 1)) + 1000);
        }

        /* Before */
        for (int i = 0; i < HashMap.size(); i++) {
            System.out.print(HashMap.get(i) + " ");
        }
        /* After */
        System.out.println("Search a number: ");
        int idx = FindValueHM(HashMap, input.nextInt());
        System.out.println("Input number is found in index " + idx);

    }
    public static void AddAndSortHM(HashMap<Integer, Integer> hashmap, int value) {

        hashmap.put(hashmap.size(), value);

        ArrayList<Integer> hmlist = new ArrayList<>(hashmap.values());
        hmlist.sort((a, b) -> a.compareTo(b));

        for (int i = 0; i < hashmap.size(); i++) {
            hashmap.put(i, hmlist.get(i));
        }

    }

    public static void SwapHM(HashMap<Integer, Integer> hashmap, int value, int value2) {

        int idx1 = hashmap.get(value);
        int idx2 = hashmap.get(value2);
        hashmap.put(value, idx2);
        hashmap.put(value2, idx1);
    }

    public static int FindValueHM(HashMap<Integer, Integer> hashmap, int value) {

        for (int i = 0; i < hashmap.size(); i++) {

            if (hashmap.get(i) == value) {
                return i;
            }

        }

        return -1;

    }
}

