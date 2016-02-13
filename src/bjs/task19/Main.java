package bjs.task19;

import java.util.*;

abstract class A {
    protected void call() {
        System.out.println("class A called");
    }
}

class B extends A {
    protected void call() {
        System.out.println("class B called");
    }
}

// Простой пример абстрактного класса.
/*abstract class A {
    abstract void callme();

    // абстрактные классы все же могут содержать конкретные методы
    protected void callmetoo() {
        System.out.println("Это конкретный метод класса А.");
    }
}

class B extends A {
    void callme() {
        System.out.println("Реализация метода callme класса В.");
    }
}*/


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
            //System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        A obj = new B();
        obj.call();

        /*A ob1;
        B ob2 = new B();
        ob1 = (A) ob2; // явное приведение ob1 = ob2; автоматическое приведение
        ob1.callme();*/

    }
}
