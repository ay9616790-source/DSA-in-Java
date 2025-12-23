public class PowerofTwo {
    public static boolean Check(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 2 != 0) return false;
        return Check(n / 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(Check(n));
    }
}
