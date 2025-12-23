import java.util.*;
public class Question46 {
    public static List<List<Integer>> Permutation(List<List<Integer>> result,ArrayList<Integer> temp, int [] nums){
       if(temp.size()== nums.length){
          result.add(new ArrayList<>(temp));
       }
       for(int number:nums){
           if(temp.contains(number)) continue;
           temp.add(number);
           Permutation(result,temp,nums);
           temp.remove(temp.size()-1);
       }
       return result;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3};
        ArrayList<Integer> temp=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        System.out.println(Permutation(result,temp,nums));
    }
}
