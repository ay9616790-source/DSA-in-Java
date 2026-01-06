public class DubblyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public  Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        //add first
    public void addFirst(int data){
       Node newNode=new Node(data);
       size++;
       if(head==null){
           head=tail=newNode;
           return ;
       }
       newNode.next=head;
       head.prev=newNode;
       head=newNode;


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");

        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val= head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;


    }


    public static void main(String[] args) {
        DubblyLL Dll=new DubblyLL();
        Dll.addFirst(5);
        Dll.addFirst(4);
        Dll.addFirst(3);
        Dll.addFirst(2);
        Dll.addFirst(1);
        Dll.print();
        System.out.println(size);
        Dll.removeFirst();
        Dll.print();


    }
}
