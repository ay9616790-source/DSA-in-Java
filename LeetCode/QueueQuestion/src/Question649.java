import java.util.*;
import java.util.LinkedList;

public class Question649 {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R'){
                r.offer(i);
            }else{
                q.offer(i);
            }
        }
        while(!r.isEmpty()&& !q.isEmpty()){
            int indxR=r.poll();
            int indxQ=q.poll();
            if(indxR<indxQ){
                r.offer(indxR+senate.length());
            }else{
                q.offer(indxQ+senate.length());
            }
        }
        if(r.isEmpty()){
            return "Dire";
        }else{
            return "Radiant";
        }
    }
    public static void main(String[] args) {
        String s="RDD";
        System.out.println(predictPartyVictory(s));
    }
}
