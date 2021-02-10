package com.example.mypackage;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue();
        //Adding element add() offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("C");

        //System.out.println(q);

        //get head element
        //System.out.println(q.element());
        //System.out.println(q.peek());

        //Return & remove element from queue remove () poll()
        //System.out.println(q.remove());
        //System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);

        Iterator iq = q.iterator();
        while(iq.hasNext()){
            System.out.println(iq.next());
        }

    }


}
