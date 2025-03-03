package dsaYTvideo;

import java.util.Hashtable;

public class MainHash {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(1, "A");
        table.put(2, "B");
        table.put(3, "C");
        table.put(4, "D");
        table.put(5, "E");
        table.put(6, "F");
        table.put(7, "G");
        table.put(8, "H");
        table.put(9, "I");
        table.put(10, "J");
        table.put(11, "K");
        table.put(12, "L");
        table.put(13, "M");



        for (Integer key : table.keySet()) {
            System.out.println(key + "\t" + table.get(key));
        }
    }
}
