public class LinearSearchinString {
    public static boolean serach(String [] meanu,String Foodname){
        for(int i=0;i< meanu.length;i++){
            if(meanu[i].equals(Foodname)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String [] meanu={"Samoso","ChualaBatroua","Water",};
                String key="Water";
         boolean found=serach(meanu,key);
        if (found) {
            System.out.println(key + " is found in the menu!");
        } else {
            System.out.println(key + " is not found in the menu!");
        }
    }
}
