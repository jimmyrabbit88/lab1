import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        try
        {   // The name of the file which we will read from
            String filename = "words_alpha.txt";

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine())
            {
                // Read one string from the file
                String str = in.nextLine();
                // add str to ArrayList and LinkedList
                arrayList.add(str);
                linkedList.add(str);
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found");

        }

        testGetForArrayList(arrayList);
        testGetForLinkedList(linkedList);

        testSetForArrayList(arrayList);
        testSetForLinkedList(linkedList);



    }
    public static void testGetForArrayList(List arraylist){
        long startTime = System.currentTimeMillis();
        testGetForList(arraylist);
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("ArrayList.get duration :: " + duration);
    }

    public static void testGetForLinkedList(List linkedList){
        long startTime = System.currentTimeMillis();
        testGetForList(linkedList);
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("LinkedList.get duration :: " + duration);
    }

    public static void testSetForArrayList(List linkedList){
        long startTime = System.currentTimeMillis();
        testSetForList(linkedList);
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("ArrayList.set duration :: " + duration);
    }

    public static void testSetForLinkedList(List linkedList){
        long startTime = System.currentTimeMillis();
        testSetForList(linkedList);
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("LinkedList.set duration :: " + duration);
    }







    // get value at a random point in the list x
    public static void testGetForList(List list) {
        int listSize = list.size();
        Random random = new Random();
        int reps = 50000;
        for(int i = 0; i < reps; i++) {
            // reps is the number of repetitions
            // declare reps as something large e.g. 10000000
            list.get(random.nextInt(listSize)); // list is your list

            // (ArrayList or LinkedList)

        }
    }

    //To test set, use code like
    public static void testSetForList(List list) {
        int listSize = list.size();
        Random random = new Random();
        int reps = 50000; //something very large
        for (int i = 0; i < reps; i++)
            list.set(random.nextInt(listSize), "test");  // 47 just a random number
    }

}