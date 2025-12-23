import java.util.LinkedList;

public class Question82 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    public static Node tail;
    public static LinkedList<Integer> duplicate(LinkedList<Integer> l){
        Node temp=head;
        while(temp!=null || temp.next!=null){
            if(temp.data==temp.next.data){
                temp.
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
    }

}
