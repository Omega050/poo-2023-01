package com.github.omega050.t12.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    class Node {
        public int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}