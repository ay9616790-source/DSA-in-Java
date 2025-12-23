
import java.util.*;

public class ActivitySelectionifNotSorted {



        public static void main(String[] args) {
            int start[]={1,3,0,5,8,5};
            int end[]={2,4,6,4,9,9};
            //if not sorted
            int activities[][]=new int [start.length][3];
            for(int i=0;i< start.length;i++){
                activities[i][0]=i; //save index
                activities[i][1]=start[i]; //start elem
                activities[i][2]=end[i];  //end elem
            }
            Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

            //if end arr sorted
            int maxAct=0;
            ArrayList<Integer> ans=new ArrayList<>();
            //1 activity
            maxAct=1;
            ans.add(activities[0][0]);
            int lastIdx=activities[0][2];
            for(int i=0;i<end.length;i++){
                if(activities[i][1]>=lastIdx){
                    maxAct++;
                    ans.add(activities[i][0]);
                    lastIdx=activities[i][2];
                }
            }
            System.out.println(" max Activity"+maxAct);
            for(int i=0;i<ans.size();i++){
                System.out.print("A"+ans.get(i)+" ");
            }
            System.out.println();
        }
    }


