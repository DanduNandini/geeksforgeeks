class Solution {
    public static Node partition(Node head, int x) {
        Node p = new Node(0);
        Node q = new Node(0);
        Node r = new Node(0);
        Node np = p;
        Node nq = q;
        Node nr = r;
        while (head != null) {
            if (head.data < x) {
                np.next = head;
                np = np.next;
            } else if (head.data == x) {
                nq.next = head;
                nq = nq.next;
            } else {
                nr.next = head;
                nr = nr.next;
            }
            head = head.next;
        }
        nr.next = null;
        nq.next = r.next;
        np.next = q.next;
        return p.next;
        
    }
}