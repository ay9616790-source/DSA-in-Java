public class DeskRecursion {
    public static void towerOfHanoi(int n,String src,String helper,String desk){
        if(n==1) {
            System.out.println("Tower desk" + n + "from" + src + "to" + desk);
            return;
        }
        towerOfHanoi(n-1,src,desk,helper);
        System.out.println("Tower desk"+n+"from"+src+"to"+desk);
        towerOfHanoi(n-1,helper,src,desk);

    }

    public static void main(String[] args) {
        int n=5;
        towerOfHanoi(n,"S","H","D");
    }
}
