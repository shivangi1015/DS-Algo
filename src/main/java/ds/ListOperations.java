package ds;

public class ListOperations {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        if (head == null) {
            return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new SinglyLinkedListNode(data);
        return head;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        if (llist == null) {
            return new SinglyLinkedListNode(data);
        }

        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        new_node.next = llist;
        llist = new_node;
        return llist;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        int currentPosition = 0;
        SinglyLinkedListNode currentNode = head;
        while (currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        new_node.next = currentNode.next;
        currentNode.next = new_node;
        return head;
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        if (position == 0) {
            head = head.next;
            return head;
        }
        int currentPosition = 0;
        SinglyLinkedListNode currentNode = head;

        while (currentPosition < position - 1) {
            currentPosition++;
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;
        return head;
    }
}
