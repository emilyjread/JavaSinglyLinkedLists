package com.emilyread.singlylinkedlists;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();

        sll.findInt(3);
        sll.findInt(5);
        sll.findInt(15);
        sll.removeAt(5);
        sll.printValues();
    }
}
