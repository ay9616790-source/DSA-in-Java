import java.util.LinkedList;

public class Question143 {
    public static LinkedList<Integer> ReorderList(LinkedList<Integer> l){
        LinkedList<Integer> l1=new LinkedList<>();
       for(int i=0;i< l.size()/2;i++){
            l1.add(l.get(i));


       }
        LinkedList<Integer> l2=new LinkedList<>();
        for(int i=l.size()/2;i<l.size();i++){
           l2.get(l.get(i));
       }
        for(int i=0;i<l2.size();i++){
            int temp=l2.get(i);
            l2.get(i)=l2.get(l2.size()-i);
            l2.get(l2.size()-i);

        }


    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        //[1,2,3,4]
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

    }
}
