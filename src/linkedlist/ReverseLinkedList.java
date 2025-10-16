package linkedlist;

class Node {
    int val;
    Node next;
    Node(int val) { this.val = val; }
}

public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.print("Before: ");
        printList(head);
        head = reverse(head);
        System.out.print("After: ");
        printList(head);
    }

    private static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
