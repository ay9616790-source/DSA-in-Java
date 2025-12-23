public class Print1ToN {

        public static void Print(int n){
            if(n==0 ){
                return ;
            }
//            System.out.print(n+" ");
            Print(n-1);
            System.out.print(n+" ");
        }

        public static void main(String[] args) {
            int n=10;
            Print(n);

        }


}
