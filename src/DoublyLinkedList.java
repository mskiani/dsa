public class DoublyLinkedList {

    Node head;

    static class Node {

        String data;
        Node prev;
        Node next;

        Node(String data) {

            this.data = data;
            this.next = null;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        DoublyLinkedList dbll = new DoublyLinkedList();

        dbll.head = new Node("1");
        Node second = new Node("2");
        Node third = new Node("3");
        Node fourth = new Node("4");

        dbll.head.next = second;
        dbll.head.prev = null;

        second.next = third;
        second.prev = dbll.head;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;
        fourth.next = null;

        Node temp = dbll.head;

        while (temp != null) {
            System.out.println("printing forward : " + temp.data);

            temp = temp.next;

        }

    }
}
