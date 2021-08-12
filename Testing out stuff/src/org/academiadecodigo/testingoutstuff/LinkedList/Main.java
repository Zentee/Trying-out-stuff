package org.academiadecodigo.testingoutstuff.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> link = new LinkedList<Integer>();

        link.add(6);
        link.add(7);
        link.add(8);



        System.out.println(link.get(1));

        Iterator it = link.iterator();


        while(it.hasNext()){
            if((int)it.next() == 8){
                System.out.println("Found the number wanted");
            }
        }

    }


}
