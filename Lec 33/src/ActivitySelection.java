import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //if end arr sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1 activity
        maxAct=1;
        ans.add(0);
        int lastIdx=end[0];
        for(int i=0;i<end.length;i++){
            if(start[i]>=lastIdx){
                maxAct++;
                ans.add(i);
                lastIdx=end[i];
            }
        }
        System.out.println(" max Activity"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
