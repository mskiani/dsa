
public class dsa {

    Node head;

    static class Node {

        String data;
        Node next;

        Node(String data) {

            this.data = data;

            this.next = null;

        }
    }

    // insert at start
    public void insert(String data) {

        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;
    }

    // insert after head
    public void insertAfter(String data, Node prev) {

        if (prev != null) {

            Node new_node = new Node(data);
            new_node.next = prev.next;

            prev.next = new_node;

        }

    }

    // insert at the end

    public void insertAtEnd(String data, Node head) {

        Node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }

        Node new_Node = new Node(data);
        temp.next = new_Node;

    }

    public void deleteFromBeginning(Node first) {

        head = first.next;
        first = null;

    }

    public void deleteFromEnd(Node head) {
        Node end = head;

        Node prev = null;

        while (end.next != null) {

            prev = end;
            end = end.next;

        }

        prev.next = null;

    }

    public void deleteWithKey(String key) {

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != key) {

            prev = temp;
            temp = temp.next;

        }

        prev.next = temp.next;

    }

    public void printList() {

        Node n = head;

        while (n != null) {

            System.out.println(n.data);
            n = n.next;
        }

    }

    public static void main(String[] args) {

        dsa d = new dsa();

        d.insert("1");
        d.insert("2");
        d.insert("3");
        d.insert("4");

        // d.insertAfter("21", d.head);
        // d.insertAfter("22", d.head);

        // d.insertAtEnd("66", d.head);
        // d.insertAtEnd("67", d.head);

        // /// deleting from begiinnig
        // d.deleteFromBeginning(d.head);
        // d.deleteFromBeginning(d.head);

        // d.deleteFromEnd(d.head);
        d.deleteWithKey("1");
        d.printList();

    }
}
