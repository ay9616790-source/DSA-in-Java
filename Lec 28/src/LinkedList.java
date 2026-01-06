public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static  Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {
            //first setp
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //Sceond step linked new node is a head
            newNode.next = head;

            head = newNode;

        }
        public void addLast(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                 head=tail=newNode;
                 return ;
            }
            tail.next=newNode;
            tail=newNode;

    }
    //add Middle of the linked list
    public void add(int idx,int data){
            if(idx==0){
                addFirst(data);
                return ;
            }

            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
        Node newNode=new Node(data);
            size++;
            newNode.next=temp.next;
            temp.next=newNode;
    }
    public void print(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+"-> ");
                temp=temp.next;
            }
        System.out.println(" null");

    }
    public int removeFirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                size=0;
                int val=head.data;
                head=tail=null;
                return val;
            }
            size--;
            int val=head.data;
            head=head.next;
            return val;

    }
    public int removeLast(){

            if(size==0){
                System.out.println("LL is Empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
        Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
    }
    public int iterative(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            // if not found
        return -1;
    }

       //Iteration in Rec
    public int helper(Node head,int key){
            if(head==null){
                return -1;
            }if(head.data==key){
                return 0;
        }
            int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
    }
    public int recSearch(int key){
            return helper(head,key);
    }
    public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
    }
    public void RemoveNthidxFromLast(int n){
            int sz=0; //size of linedlist
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==0){
            head=head.next;
            return;
        }
         //sz!=1
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;

    }
    public Node FindMid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null || fast.next!=null){
                slow=slow.next;  //+1;
                fast=fast.next.next;  //+2
            }
            return slow;
    }
    public boolean checkPalldrome(){
            if(head==null || head.next!=null){
                return true;
            }
            //step1 find mid node
        Node midNode=FindMid(head);

            //reverse 2 rigth half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            prev=curr;
            curr=next;
        }
        Node rigth=prev;
        Node left=head;
        while(rigth!=null){
            if(left.data!= rigth.data){
                return false;
            }
            left=left.next;
            rigth=rigth.next;
        }
        return true;
    }
    public   static boolean isCycle(){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
            if(cycle==false){
                return;
            }
            //find meet point
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;

    }


    public static void main(String[] args) {
//        LinkedList ll=new LinkedList();
//
//        ll.addFirst(2);
//
//        ll.addFirst(1);
//
//        ll.addLast(2);
//
//        ll.addLast(1);
//        ll.print();
//        ll.add(2,3);
//        ll.print();
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
//
//        ll.print();
//        System.out.println(ll.size);
////        System.out.println( ll.iterative(4));
////        System.out.println(ll.recSearch(4));
////        System.out.println(ll.recSearch(10));
////
////
////        ll.reverse();
////        ll.print();
//        ll.RemoveNthidxFromLast(2);
//        ll.print();
         head=new Node(1);
         Node temp=new Node(2);
         head.next=temp;
        head.next.next=new Node(3);
         head.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
