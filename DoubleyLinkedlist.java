package com.company;

import java.util.NoSuchElementException;

public class DoubleyLinkedlist {

    private Node head;
    private Node tail;
    private int size;



    public static class Node {
        int element;
        Node next;
        Node prev;

        public Node(int element, Node next, Node prev) {

            this.element = element;
            this.next = next;
            this.prev = prev;
        }


    }


    public void addfirstele(int element) {
        Node temp = new Node(element, head, null);
        if (head != null) {
            head.prev = temp;

        }
        head = temp;
        if (tail == null)
            size++;
        System.out.println("adding" + element);
    }

    public void addlastelement(int element) {
        Node temp = new Node(element, null, tail);
        if (tail != null) {
            tail.next = temp;

        }
        tail = temp;
        if (head == null) {
            head = temp;
        }
        size++;
        System.out.println("adding" + element);
    }


    public void iterateforward() {
        System.out.println("iterating forward...");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public void iteratebackward() {

        System.out.println("iterating backward");
        Node temp = tail;
        while (temp != null) {

            System.out.println(temp.element);
            temp = temp.prev;

        }
    }

    public int removelast() {
        if (size == 0)// throw new NoSuchElementException();
        {

            System.out.println("no such element ");
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted" + temp.element);
        return temp.element;
    }

    public int removefirst() {
        if (size == 0) throw new NoSuchElementException();
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted" + temp.element);
        return temp.element;

    }

    public int removemiddle() {
        if (size == 0) throw new NoSuchElementException();

        Node temp = head.next;
        head.next = temp;
        temp = tail.prev;
        head.prev = null;
        tail.next = null;
        size--;
        System.out.println("deleted middle: " + temp.element);
        return temp.element;

    }

    public Node search(int value) {
        int i = 1;
        boolean flag = false;
        Node current = head;
        if (head == tail) {
            System.out.println("list is empity");
        }
        while (current != null) {

            if (current.element == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (flag) {
            System.out.println("Node is present in the list of positon " + i);
            return current;
        } else System.out.println("Node is not present in the list");

        return current;
    }

    public static void main(String[] args) {
        DoubleyLinkedlist p = new DoubleyLinkedlist();
        p.addfirstele(3);
        p.addfirstele(4);
        p.addlastelement(55);
        p.addlastelement(44);
        p.addlastelement(5);
        p.iterateforward();     p.removelast();
        p.iteratebackward();
        p.removemiddle();
        try {
            System.out.println(p.search(6).element);

        } catch (NullPointerException E) {
        }
    }
}