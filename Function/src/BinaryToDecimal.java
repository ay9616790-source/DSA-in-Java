public class BinaryToDecimal {
    public static void BToD(int binNum){
        int OriginalNum=binNum;
        int pow=0;
        int dec=0;

        while(binNum>0){
          int lastd=binNum%10;
          dec=dec+(lastd*(int)Math.pow(2,pow));

          pow++;
          binNum =binNum/10;

        }
        System.out.print("Number is convert "+OriginalNum+" Num from Deciam "+dec);
    }
    public static void main(String[] args) {
        BToD(111);

    }
}
