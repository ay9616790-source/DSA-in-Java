public class TillProblem {
    public static int tillProblem(int n){
        //base case
        if(n==0|| n==1) {
            return 1;
        }
        int tillVertical=tillProblem(n-1);
        int tillHoriztonal=tillProblem(n-2);
        int totalWay=tillHoriztonal+tillVertical;
        return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(tillProblem(4));
    }

}
