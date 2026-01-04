public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        //upper Half
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
                int space=2*(n-i);
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                 //2part
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            System.out.println();



        }
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //2part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();



        }
    }

}
