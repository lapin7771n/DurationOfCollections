import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();


        System.out.print("Time of filling: ");

        long timeMillisStart = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            integerArrayList.add(new Random().nextInt());
            integerLinkedList.add(new Random().nextInt());
        }

        long timeMillisEnd = System.currentTimeMillis();
        System.out.print(timeMillisEnd - timeMillisStart + "\n");
        
        TreeMap<String, Long> arrayListOperations = arrayListOperations(integerArrayList);
        TreeMap<String, Long> linkedListOperations = linkedListOperations(integerLinkedList);

        System.out.println("ArrayList: " + arrayListOperations.toString());
        System.out.println("LinkedList: " + linkedListOperations.toString());

    }

    static TreeMap<String, Long> arrayListOperations(ArrayList<Integer> integerArrayList) {
        TreeMap<String, Long> map = new TreeMap<>();

        long startMethod = System.currentTimeMillis();
        //map.put("startMethod", startMethod);

        long startRemoveFirst = System.currentTimeMillis();
        integerArrayList.remove(0);
        long endRmFirst = System.currentTimeMillis();
        map.put("Remove first", endRmFirst - startRemoveFirst);

        long startRemoveLast = System.currentTimeMillis();
        integerArrayList.remove(integerArrayList.size() - 1);
        integerArrayList.trimToSize();
        long endRmLast = System.currentTimeMillis();
        map.put("Remove last", endRmLast - startRemoveLast);

        long startRemoveMiddle = System.currentTimeMillis();
        integerArrayList.remove(integerArrayList.size() / 2);
        long endRmMiddle = System.currentTimeMillis();
        map.put("Remove middle", endRmMiddle - startRemoveMiddle);

        long startAddingFirst = System.currentTimeMillis();
        integerArrayList.add(0, 2);
        long endAddingFirst = System.currentTimeMillis();
        map.put("Add first", endAddingFirst - startAddingFirst);

        long startAddingLast = System.currentTimeMillis();
        integerArrayList.add(0, 2);
        long endAddingLast = System.currentTimeMillis();
        map.put("Add first", endAddingLast - startAddingLast);

        long startAddingMiddle = System.currentTimeMillis();
        integerArrayList.add(integerArrayList.size() / 2, new Random().nextInt());
        long endAddingMiddle = System.currentTimeMillis();
        map.put("Add middle", endAddingMiddle - startAddingMiddle);

        long endMethod = System.currentTimeMillis();
//        map.put("End method", endMethod);

        long duration = endMethod - startMethod;
        map.put("Duration", duration);

        return map;
    }

    static TreeMap<String, Long> linkedListOperations(LinkedList<Integer> integerLinkedList) {
        TreeMap<String, Long> map = new TreeMap<>();

        long startMethod = System.currentTimeMillis();
        //map.put("startMethod", startMethod);

        long startRemoveFirst = System.currentTimeMillis();
        integerLinkedList.removeFirst();
        long endRmFirst = System.currentTimeMillis();
        map.put("Remove first", endRmFirst - startRemoveFirst);

        long startRemoveLast = System.currentTimeMillis();
        integerLinkedList.removeLast();
        long endRmLast = System.currentTimeMillis();
        map.put("Remove last", endRmLast - startRemoveLast);

        long startRemoveMiddle = System.currentTimeMillis();
        integerLinkedList.remove(integerLinkedList.size() / 2);
        long endRmMiddle = System.currentTimeMillis();
        map.put("Remove middle", endRmMiddle - startRemoveMiddle);

        long startAddingFirst = System.currentTimeMillis();
        integerLinkedList.addFirst(2);
        long endAddingFirst = System.currentTimeMillis();
        map.put("Add first", endAddingFirst - startAddingFirst);

        long startAddingLast = System.currentTimeMillis();
        integerLinkedList.addLast(2);
        long endAddingLast = System.currentTimeMillis();
        map.put("Add first", endAddingLast - startAddingLast);

        long startAddingMiddle = System.currentTimeMillis();
        integerLinkedList.add(integerLinkedList.size() / 2, new Random().nextInt());
        long endAddingMiddle = System.currentTimeMillis();
        map.put("Add middle", endAddingMiddle - startAddingMiddle);

        long endMethod = System.currentTimeMillis();
        //map.put("End method", endMethod);

        long duration = endMethod - startMethod;
        map.put("Duration", duration);

        return map;
    }
}