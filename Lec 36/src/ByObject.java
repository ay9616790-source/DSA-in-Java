import java.util.PriorityQueue;

public class ByObject {
    static class Student implements Comparable<Student>{
      String name;
      int rank;
      public Student (String name,int rank){
          this.name=name;
          this.rank=rank;
      }

        @Override
        public int compareTo(Student s2) {
            return this.rank -s2.rank;  //Acc Order
//            //return s2.rank-this.rank; for dec order
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A",4));
        pq.add(new Student("B",3));
        pq.add(new Student("c",2));
        pq.add(new Student("D",8));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
