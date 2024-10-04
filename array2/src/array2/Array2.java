package array2;

import java.util.ArrayList;
import java.util.Vector;

public class Array2 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apel");
        arrayList.add("pisang");
        arrayList.add(1, "jeruk");
        arrayList.remove("pisang");
        
        System.out.println("ArrayList: " + arrayList);
        
        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("wortel");
        vector.add("kentang");
        vector.add(1, "tomat");
        vector.remove("kentang");
        
        System.out.println("Vector: " + vector);
    }
}