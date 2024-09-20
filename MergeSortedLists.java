class Node{
    int data;
    Node next;
    Node(int x){
        this.data =x;
        this.next =null;

    }
}
public class MergeSortedLists {
    static Node mergeSortedList(Node a, Node b) {
        // Create a dummy node to help with the merging process
        Node dummy = new Node(0);
        Node tail = dummy;

        // Traverse both lists and merge them
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes from the non-exhausted list
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }


        // Return the merged list, which starts at dummy.next
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a =new Node(2);
        a.next =new Node(3);
        a.next.next=new Node(8);
        a.next.next.next =new Node(9);


        Node b =new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergeSortedList(a,b);
        Node temp =res;

        while (temp !=null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }

    }
}
