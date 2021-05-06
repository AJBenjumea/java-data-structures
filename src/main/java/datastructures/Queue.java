package datastructures;

public class Queue {
    private static class Node {
        private int val;
        private Node next;
        private Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node peek() {
        return head;
    }

    public void add(int val) {
        Node node = new Node(val);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = tail;
        }
    }

    public Node remove() {
        Node node = null;
        if (head != null) {
            node = head;
            head = head.next;
        }
        return node;
    }

    public int getNodeVal(Node node) {
        return node.val;
    }

}
