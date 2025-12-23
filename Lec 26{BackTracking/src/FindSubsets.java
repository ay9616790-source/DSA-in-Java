public class FindSubsets {
    public static void  Subsets(String s1,String ans,int i){
        if(i==s1.length()){
            System.out.println(ans+" ");
            return ;
        }
        //if yes
        Subsets(s1,ans+s1.charAt(i),i+1);
        //if No
        Subsets(s1,ans,i+1);
    }
    public static void main(String[] args) {
        String s1="abc";
        Subsets(s1,"",0);
    }
}
