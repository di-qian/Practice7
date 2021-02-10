package com.example.mypackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList al = new ArrayList();

        al.add("Hello");
        al.add(100);
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);

        ListIterator it = al.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
