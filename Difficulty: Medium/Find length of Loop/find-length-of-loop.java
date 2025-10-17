/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if(head==null|| head.next==null)    return 0;
        int c=0;
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                c=1;
                slow=slow.next;
                while(slow!=fast){
                    c++;
                    slow=slow.next;
                    
                }
                break;
            }
        }
        return c;
    }
}