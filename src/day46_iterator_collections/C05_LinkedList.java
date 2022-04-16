package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        // hem list hem de Queue'nun child class'idır

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);// add methodu List'den geldiğinden hep sona ekler

        list.addFirst(11);// addFirst deque den gelir
        list.addLast(12); //addFirst deque den gelir
        System.out.println(list);//[11, 5, 10, 12]
        list.add(2,25);
        System.out.println(list);//[11, 5, 25, 10, 12]
    }
}
