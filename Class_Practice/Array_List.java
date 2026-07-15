import java.util.*;

class Array_List{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
        
        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove("Banana");
        System.out.println(list);
    }
}