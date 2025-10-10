/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
     
        // Initialize two pointers
        Node slow = head;
        Node fast = head;

        // Move fast by 2 and slow by 1 step
        // When fast reaches end, slow will be at the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 'slow' now points to the middle node
        return slow.data;
    }
}