import java.util.LinkedList;
import java.util.Queue;

public class Question2073 {
    public static int timeRequiredToBuy(int[] tickets, int k){
        if(tickets[k]==0){
            return 0;
        }
        int time=0;
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(true){
            int person=q.poll();
            tickets[person]--;
            time++;

            if(tickets[person]==0 && person==k){
                return time;
            }
            if(tickets[person]>0){
                q.add(person);
            }
        }
//        int time=0;
//        for(int i=0;i< tickets.length;i++){
//            if(i<=k){
//                time+=Math.min(tickets[i],tickets[k]);
//            }else{
//                time+=Math.min(tickets[i],tickets[k]-1);
//            }
//        }
//        return time;
    }
    public static void main(String[] args) {
        int []  tickets = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets,k)) ;
    }
}
