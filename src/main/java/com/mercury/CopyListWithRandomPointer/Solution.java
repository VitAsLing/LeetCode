package com.mercury.CopyListWithRandomPointer;

public class Solution {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        Node newHead = head.next;
        Node original = head;
        Node copy = newHead;

        while (original != null) {
            original.next = copy.next;
            original = original.next;

            if (original != null) {
                copy.next = original.next;
                copy = copy.next;
            }
        }

        return newHead;
    }
}
