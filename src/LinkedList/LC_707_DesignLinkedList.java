package LinkedList;

public class LC_707_DesignLinkedList {
    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    private int size;
    private Node head;
    public LC_707_DesignLinkedList(){
        head = null;
        size = 0;
    }
    public static void main(String[] args) {

        LC_707_DesignLinkedList list = new LC_707_DesignLinkedList();

        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtTail(30);
        list.addAtIndex(1, 15);

        System.out.println(list.get(0)); // expected: 20
        System.out.println(list.get(1)); // expected: 15
        System.out.println(list.get(2)); // expected: 10
        System.out.println(list.get(3)); // expected: 30
    }


    public int get(int index){
        if(index < 0 || index >= size){
            return -1;
        }
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;

        }
        return curr.val;
    }
    public void addAtHead(int val){
        Node node = new Node(val);

        node.next = head;
        head = node;
        size++;
    }
    public void addAtTail(int val){
        Node node = new Node(val);
        if(head == null){
            //empty LL
            addAtHead(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = node;
        size++;
    }
    public void addAtIndex(int index, int val){
        if(index < 0 || index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node curr = head;
        for(int i = 0; i < index-1; i++){
            curr = curr.next;
        }
        node.next = curr.next;

        curr.next = node;
        size++;
    }

}
