package com.company;

public class Stack {

    static private class Node {

        public char value;

        public Node next;

        public Node(char value, Node next) {

            this.value = value;

             this.next = next;

        }

        public Node(char value) {

            this(value, null);

        }
    }

    private Node head = null;

    private Node first = null;

    private int size = 0;

    private Node getNode(int index) {

        Node curr = first;

        for (int i = 0; i < index; i++) {

            curr = curr.next;

        }

        return curr;

    }

    public char get() {

        return getNode(size - 1).value;

    }

    public int size() {

        return size;

    }

    public void pop() {

        getNode(size - 2).next = null;

        size--;

    }

    public void push(char value) {

        if (size != 0) {

            head = new Node(value);

            getNode(size - 1).next = head;

        }

        else {

            head = first = new Node(value);

        }

        size++;

    }
}
