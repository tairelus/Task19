package bjs.task19;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("1","Chaitanya");
        hashtable.put("2","Ajeet");
        hashtable.put("3","Peter");
        hashtable.put("4","Ricky");
        hashtable.put("5","Mona");

        Enumeration keys = hashtable.keys();

        while(keys.hasMoreElements()) {
            String key = keys.nextElement().toString();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}
