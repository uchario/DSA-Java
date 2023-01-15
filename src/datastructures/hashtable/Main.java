package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("bolts"));

        System.out.println(myHashTable.keys());

        int[] array1= {1, 3, 5};
        int[] array2= {2, 4, 5};

        System.out.println(HashTable.itemInCommon(array1, array2));
    }
}
