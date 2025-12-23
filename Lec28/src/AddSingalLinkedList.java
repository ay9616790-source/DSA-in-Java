public class AddSingalLinkedList {
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
            //Add first
    public void addFirst(int data ){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
          //AddLast
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
    }
          //AddMid
    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
       newNode.next=temp.next;
        temp.next=newNode;

    }
      //removeFirst
    public  void removeFirst(int data){
        head=head.next;
    }
          //PrintLinkedList
    public void PrintLl(){
        Node temp=head;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddSingalLinkedList list=new AddSingalLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.removeFirst(1);
        list.addLast(5);
        list.addLast(6);
        list.add(3,4);
        list.PrintLl();
    }


}
