public class Concatenation {
    public static void main(String[] args) {
        String firstname="Abhishek";
        String lastName="Kumar";
        //Concatenation
        String fullName =firstname +" "+ lastName;
        System.out.println(fullName.length());

        //CharAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
