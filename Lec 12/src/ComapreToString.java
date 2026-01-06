public class ComapreToString {
    public static void main(String[] args) {
        String firstname="Abhishek";
        String lastName="Abhishek";
        //Concatenation
        String fullName =firstname +" "+ lastName;
        System.out.println(fullName.length());
        //1 s1>s2=+ve value
        //2 s1=s2= 0;
        //2 s1<s2=-ve value
        //comapare katha is yah abcd ke ki con first atat ha
        if(firstname.compareTo(lastName)==0){
            System.out.println("string are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
}
