import java.util.ArrayList;
import java.util.*;

public class JobSequning {
    static class Job{

        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            profit=p;
            deadline=d;
        }
    }
    public static void main(String[] args) {
        int josInfo[][]={{4,20},{1,20},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<josInfo.length;i++){
            jobs.add (new Job(i,josInfo[i][0],josInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                time++;
                seq.add(curr.id);
            }
        }
        System.out.println("Max_Jobs="+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
        }
        System.out.println();
    }
}
