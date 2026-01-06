public class CompareString {
    public static String Comaprelexicographic(String [] fruits){
        String larget=fruits[0];
        for(int i=0;i< fruits.length;i++){
        if(larget.compareToIgnoreCase(fruits[i])<0){
           larget=fruits[i];
        }
        }
        return larget;
    }
//    public static String Reapeted(String [] fruits){
//        String LargetPrefix="";
//        for(int i=0;i< fruits.length;i++){
//            if(fruits[i].compareToIgnoreCase(fruits[i+1])){
//
//            }
//        }
//    }
    public static void main(String[] args) {
        String []fruits ={"Apple","aanana","aango"};
//        System.out.println(Comaprelexicographic(fruits));
    }
}
