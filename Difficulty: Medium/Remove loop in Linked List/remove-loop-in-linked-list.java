/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
    HashSet<Node> set=new HashSet<>();
    Node p=head;
    while(p!=null){
        if(set.contains(p.next)){
            p.next=null;
            break;
        }
        set.add(p);
        p=p.next;
    }
        
    }
}

 